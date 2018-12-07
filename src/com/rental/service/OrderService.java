package com.rental.service;

import com.rental.controller.BillController;
import com.rental.dao.OrderDao;
import com.rental.dao.SignDao;
import com.rental.domain.HouseBean;
import com.rental.domain.OrderBean;

import java.math.BigDecimal;
import java.util.List;

public class OrderService {
       private OrderDao odo = new OrderDao();

	public HouseBean getHouse(long house_num) {
		return odo.getHouse(house_num);
	}

	public boolean add(OrderBean order) {
		BigDecimal income = order.charge.multiply(order.tax).setScale(2,BigDecimal.ROUND_HALF_UP);
		if(!new SignDao().payMoney(order.household,order.charge,income,0))
			return false;
		new BillController().addBill(order.household,income,2,order.house_num);
		order.charge = order.charge.subtract(income);
		return odo.add(order);
	}

	public List<OrderBean> getOrderList_H() {
		return odo.getOrderList_H();
	}

	public List<OrderBean> getOrderList_T() {
		List<OrderBean> list = odo.getOrderList_T();
		for(OrderBean order : list){
			order.charge = order.charge.divide(new BigDecimal(0.9),2,BigDecimal.ROUND_HALF_UP);
		}
		return list;
	}

	public boolean checkOut(long house_num) {
		return odo.checkOut(house_num);
	}
}
