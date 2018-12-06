package com.rental.service;

import com.rental.dao.FilterDao;
import com.rental.domain.HouseBean;

import java.util.List;

public class FilterService {
    
	private FilterDao  fdo = new FilterDao();
	
	public List<HouseBean> filterHouse(HouseBean house, int temp) {
		String sql = "select * from house where state>0";
		if(house.province!="-") {
			sql += " and province='" + house.province + "'";
			if(house.city!="-")
				sql += " and city='" + house.city + "'";
			if(house.county!="-")
				sql += " and county='" + house.county + "'";
			if(house.h_type!="-")
				sql += " and h_type='" + house.h_type + "'";
			if(house.type!="-")
				sql += " and type='" + house.type + "'";
			if(house.rent == null) {
				switch(temp) {
				case 1:
					sql += " and rent between 0 and 700";
					break;
				case 2:
					sql += " and rent between 701 and 2000";
					break;
				case 3:
					sql += " and rent between 2001 and 5000";
					break;
				case 4:
					sql += " and rent>5000";
					break;
				}
			}
		}
		sql += " order by state desc,set_top desc,house_id asc";
		return fdo.filterHouse(sql);
	}

}
