package com.rental.controller;

import com.rental.domain.UserBean;
import com.rental.service.SignService;

public class SignController {
    private SignService ss = new SignService();
    
    public UserBean signIn(String userName, String passWord) {
    	return ss.signIn(userName,passWord);
    }
    
    public boolean signUp(UserBean user) {
    	return ss.signUp(user);
    }
}
