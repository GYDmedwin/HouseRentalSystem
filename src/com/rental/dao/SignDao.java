package com.rental.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;

import com.rental.domain.UserBean;
import com.rental.utils.JDBCUtils;

public class SignDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
    public  UserBean user = new UserBean();
	
	public UserBean signIn(String userName, String passWord) {
		try {
			String sql = "Select phone_num from account where phone_num=? and password=password(?)";
			Object[] params = { userName, passWord };
			Map<String, Object> map = qr.query(sql, params, new MapHandler());
			if(map != null) {
				user.ph_id = userName;
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
			if(householder_id!=null) {
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
			    return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
