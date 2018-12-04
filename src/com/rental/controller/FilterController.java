package com.rental.controller;

import com.rental.domain.HouseBean;
import com.rental.service.FilterService;

import java.util.List;

public class FilterController {
     private FilterService fs = new FilterService();
     int temp;
     
     public List<HouseBean> filterHouse(HouseBean house){
    	 return fs.filterHouse(house, temp);
     }
     public List<HouseBean> filterHouse(HouseBean house, String range){
    	 switch(range) {
    	 case "700-":
    		 temp = 1;
    		 break;
    	 case "700-2000":
    		 temp = 2;
    		 break;
    	 case "2000-5000":
    		 temp = 3;
    		 break;
    	 case "5000+":
    		 temp = 4;
    		 break;
    	 }
    	 return fs.filterHouse(house,temp);
     }
}
