package com.rental.service;

import com.rental.dao.SignDao;
import com.rental.domain.UserBean;

public class SignService {

	private SignDao dao = new SignDao();
	
	public UserBean signIn(String userName, String passWord) {
		return dao.signIn(userName,passWord);
	}

	public boolean signUp(UserBean user) {
		return dao.signUp(user);
	}

}
