package com.rental.service;

import com.rental.dao.SignDao;
import com.rental.domain.UserBean;

public class SignService {

	private SignDao sdo = new SignDao();
	
	public UserBean signIn(String userName, String passWord) {
		UserBean user = sdo.signIn(userName,passWord);
		if(user.ph_id!=null) {
			return sdo.queryInfo();
		}
		return user;
	}

	public boolean signUp(String userName, String passWord) {
		return sdo.signUp(userName, passWord);
	}

	public boolean fixInfo(UserBean user) {
		
		return sdo.fixInfo(user);
	}
	
	

}
