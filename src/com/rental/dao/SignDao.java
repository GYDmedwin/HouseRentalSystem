package com.rental.dao;

import com.rental.controller.SignController;
import com.rental.domain.UserBean;
import com.rental.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public class SignDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
    public  UserBean user = new UserBean();
	
	public UserBean signIn(String userName, String passWord) {
		try {
			String sql = "Select phone_num,money from account where phone_num=? and password=password(?)";
			Object[] params = { userName, passWord };
			Object[] query = qr.query(sql, params, new ArrayHandler());
			if(query.length!=0) {
				user.ph_id = (String) query[0];
				user.money = (BigDecimal) query[1];
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
   
	public boolean signUp(String userName, String passWord) {
		try {
			String sql ="Insert into account(phone_num,password) values(?,password(?))";
			Object[] params = {userName,passWord};
			if(qr.update(sql, params)!=0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public UserBean queryInfo() {
        try {
			String sql = "Select Tenant_id,name,adress,Ph_id,birth,sex,complete from tenant where ph_id = ?;";
			Object[] params = {user.ph_id};
			List<UserBean> list = qr.query(sql, new BeanListHandler<>(UserBean.class),params);
			user = list.get(0);
			sql = "Select householder_id from householder where phone_id = ?;";
			params[0] = user.ph_id;
			Object[] householder_id = qr.query(sql, new ArrayHandler(),params);
			if(householder_id.length!=0) {
			  user.isHouseHolder = true;
			  user.householder_id = (long) householder_id[0];
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public boolean fixInfo(UserBean user) {
		String sql = "Update tenant set name=?,adress=?,birth=?,sex=?,complete=? where ph_id=?;";
		Object[] params = {user.name,user.adress,user.birth,user.sex,user.complete,user.ph_id};
		try {
			if(qr.update(sql,params)!=0)
				if(user.isHouseHolder) {
					sql = "Update householder set name=?, address = ? where householder_id = ?";
					Object[] param = {user.name,user.adress,user.householder_id};
					return qr.update(sql, param) != 0;
				}
			    return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean becomeHouseHolder() {
		try {
			String sql = "Insert into householder(name,address,phone_id,complete) values(?,?,?,1);";
			Object[] params = {SignController.user.name,SignController.user.adress,SignController.user.ph_id};
			if(qr.update(sql,params)!=0){
				sql = "Select householder_id from householder where phone_id = ?;";
				Object[] id = qr.query(sql, SignController.user.ph_id, new ArrayHandler());
				SignController.user.isHouseHolder = true;
				SignController.user.householder_id = (long) id[0];
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void deleteHouseHolder() {
		try {
			String sql = "Delete from householder where householder_id = ?;";
			qr.update(sql,SignController.user.householder_id);
			SignController.user.isHouseHolder = false;
			SignController.user.householder_id = 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//type 为 2  是向平台付佣金
	//type 为 1  是向管理员付账单费
	//type 为 0  是向房主付费
	public  boolean payMoney(long houseHolder, BigDecimal num, BigDecimal income, int type){
		String sql_T = "Update account set money=? where phone_num = ?";
		String sql_H = "Update account set money=money+? where phone_num=(select phone_id from householder where householder_id = ?);";
		Object[] params_H = null;
		Object[] params_T = null;

		if(type == 1 ) {
			sql_H = "Update account set money=? where phone_num = ?;";
			params_H = new Object[]{num, houseHolder};
			num = SignController.user.money.subtract(num);
			params_T = new Object[]{num,SignController.user.ph_id};
		}else if(type == 0){
			if(!payMoney(12345678901L,income,null,2))
				return false;
			params_H = new Object[]{num.subtract(income), houseHolder};
			num = SignController.user.money.subtract(num);
			params_T = new Object[]{num,SignController.user.ph_id};
		}else if(type == 2){
			sql_H = "Update account set money=money+? where phone_num = ?;";
			params_H = new Object[]{num, houseHolder};
			params_T = new Object[]{SignController.user.money,SignController.user.ph_id};
		}

		try {
			if(qr.update(sql_T,params_T)!=0&&qr.update(sql_H,params_H)!=0) {
				if(type!=2)
				    SignController.user.money = num;
                return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public  boolean topUpMoney(BigDecimal num){
		String sql = "Update account set money=? where phone_num = ?";
		num = SignController.user.money.add(num);
		Object[] params = {num,SignController.user.ph_id};
		try {
			if(qr.update(sql,params)!=0) {
				SignController.user.money=num;
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
