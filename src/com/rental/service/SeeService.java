package com.rental.service;

import java.util.List;

import com.rental.dao.SeeDao;
import com.rental.domain.SeeBean;

public class SeeService {
     private SeeDao sdo = new SeeDao();

	public boolean seeHouse(SeeBean see) {
		return sdo.seeHouse(see);
	}

	public List<SeeBean> getSeeList_H() {
		return sdo.getSeeList_H();
	}
	
	public List<SeeBean> getSeeList_T() {
		return sdo.getSeeList_T();
	}

	public boolean isAgree(int isAgree, long see_id) {
		return sdo.isAgree(isAgree,see_id);
	}
}
