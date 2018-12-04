package com.rental.service;

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
		order.charge = order.charge.subtract(income);
		return odo.add(order);
	}

	public List<OrderBean> getOrderList_H() {
		return odo.getOrderList_H();
	}

	public List<OrderBean> getOrderList_T() {
		return odo.getOrderList_T();
	}
}
