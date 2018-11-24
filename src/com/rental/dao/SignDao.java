package com.rental.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.rental.domain.UserBean;
import com.rental.utils.JDBCUtils;

public class SignDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

	public UserBean signIn(String userName, String passWord) {
		try {
			String sql = "";//TODO ²¹È«sqlÓï¾ä
			Object[] params = { userName, passWord };
			List<UserBean> list =  qr.query(sql, new BeanListHandler<>(UserBean.class), params);
			if(list != null) {
				return list.get(0);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
   
	public boolean signUp(UserBean user) {
		try {
			String sql ="";//TODO sqlÓï¾ä²¹È«
			Object[] params = {user.userName,user.passWord,user.isComplete};
			if(qr.update(sql, params)!=0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
