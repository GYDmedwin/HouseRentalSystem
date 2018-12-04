package com.rental.controller;

import com.rental.domain.UserBean;
import com.rental.service.SignService;

import java.math.BigDecimal;

public class SignController {
    private SignService ss = new SignService();
    public static UserBean user;
    
    public UserBean signIn(String userName, String passWord) {
    	user = ss.signIn(userName,passWord);
    	return user;
    }
    
    public boolean signUp(String userName, String passWord) {
    	return ss.signUp(userName, passWord);
    }
    
    public boolean fixInfo(String nickName, String address, String birthday, String sex) {
		user.adress = address;
		user.birth = birthday;
		user.name = nickName;
		user.sex = sex;
		user.complete = 1;
		return ss.fixInfo(user);
	}

    public boolean becomeHouseHolder(){
    	return ss.becomeHouseHolder();
	}

	public void deleteHouseHolder(){
		ss.deleteHouseHolder();
	}

	public  boolean topUpMoney(String num){
		return ss.topUpMoney(BigDecimal.valueOf(Double.parseDouble(num)));
	}
}
