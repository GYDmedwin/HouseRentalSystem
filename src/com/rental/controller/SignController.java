package com.rental.controller;

import com.rental.domain.UserBean;
import com.rental.service.SignService;

public class SignController {
    private SignService ss = new SignService();
    private static UserBean user;
    
    public UserBean signIn(String userName, String passWord) {
    	user = ss.signIn(userName,passWord);
    	System.out.println(user.isHouseHolder);
    	System.out.println(user.householder_id);
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
}
