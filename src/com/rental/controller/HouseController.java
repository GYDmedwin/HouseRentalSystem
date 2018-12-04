package com.rental.controller;

import com.rental.domain.HouseBean;
import com.rental.service.HouseService;

import java.math.BigDecimal;
import java.util.List;

public class HouseController {
       private HouseService hs = new HouseService();
       
       public boolean add(String province, String city, String county, String type
    		   ,String h_type, String address, String accommodate, String rent) {
    	   HouseBean house = new HouseBean();
    	   house.province = province;
    	   house.city = city;
    	   house.county = county;
    	   house.type = type;
    	   house.h_type = h_type;
    	   house.address = address;
    	   house.rent = BigDecimal.valueOf(Double.parseDouble(rent));
    	   house.state = 0;
    	   house.set_top = 0;
    	   house.accommodate = Integer.parseInt(accommodate);
    	   house.householder = SignController.user.householder_id;
    	   return hs.add(house);
       }
       
       public boolean delete(long house_id) {
    	   return hs.delete(house_id);
       }
       
       public boolean update(String rent, long house_id) {
       	   double rent1 = Double.parseDouble(rent);
    	   return hs.update(rent1,house_id);
       }
       
       public List<HouseBean> query(long householder_id){
    	   return hs.query(householder_id);
       }
}
