package com.rental.controller;

import java.util.List;

import com.rental.domain.SeeBean;
import com.rental.service.SeeService;

public class SeeController {
	
	private SeeService ss = new SeeService();
	
	public boolean seeHouse(long house_id, long tenant_id, String date) {
		SeeBean see = new SeeBean();
		see.house_num = house_id;
		see.tenant = tenant_id;
		see.date = date;
		see.agree = 0;
		see.deal = 0;
		return ss.seeHouse(see);
	}

	public List<SeeBean> getSeeList_H(){
		return ss.getSeeList_H();
	}
	
	public List<SeeBean> getSeeList_T(){
		return ss.getSeeList_T();
	}
	
	public boolean isAgree(int isAgree,long see_id) {
		return ss.isAgree(isAgree,see_id);
	}

}
