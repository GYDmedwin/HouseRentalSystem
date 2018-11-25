package com.rental.controller;

import java.util.List;

import com.rental.domain.HouseBean;
import com.rental.service.FilterService;

public class FilterController {
     private FilterService fs = new FilterService();
     
     public List<HouseBean> filterHouse(HouseBean house){
    	 return fs.filterHouse(house);
     }
     public List<HouseBean> filterHouse(HouseBean house, String range){
    	 switch(range) {
    	 case "700-":
    		 house.rent = 1;
    		 break;
    	 case "700-2000":
    		 house.rent = 2;
    		 break;
    	 case "2000-5000":
    		 house.rent = 3;
    		 break;
    	 case "5000+":
    		 house.rent = 4;
    		 break;
    	 }
    	 return fs.filterHouse(house);
     }
}
