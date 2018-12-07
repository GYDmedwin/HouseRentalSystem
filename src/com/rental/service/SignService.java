package com.rental.service;

import com.rental.dao.SignDao;
import com.rental.domain.UserBean;

import java.math.BigDecimal;

public class SignService {

	private SignDao sdo = new SignDao();
	
	public UserBean signIn(String userName, String passWord) {
		UserBean user = sdo.signIn(userName,passWord);
		if(user!=null) {
			BigDecimal money = user.money;
			user = sdo.queryInfo();
			user.money = money;
			return user;
		}
		return user;
	}

	public boolean signUp(String userName, String passWord) {
		return sdo.signUp(userName, passWord);
	}

	public boolean fixInfo(UserBean user) {
		
		return sdo.fixInfo(user);
	}


	public boolean becomeHouseHolder() {
		return sdo.becomeHouseHolder();
	}

	public void deleteHouseHolder() {
		sdo.deleteHouseHolder();
	}

	public  boolean topUpMoney(BigDecimal num){
		return sdo.topUpMoney(num);
	}
}
