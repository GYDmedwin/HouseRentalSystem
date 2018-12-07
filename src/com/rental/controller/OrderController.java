package com.rental.controller;

import com.rental.domain.HouseBean;
import com.rental.domain.OrderBean;
import com.rental.service.OrderService;

import java.math.BigDecimal;
import java.util.List;

public class OrderController {

    private OrderService os = new OrderService();

    public HouseBean getHouse(long house_num) {
        return os.getHouse(house_num);
    }

    public boolean add(long householder, long house_num, BigDecimal charge, String duration) {
        if (SignController.user.householder_id == householder)
            return false;
        OrderBean order = new OrderBean();
        order.charge = charge;
        order.deal = 0;
        order.duration = Integer.parseInt(duration);
        order.tax = new BigDecimal(0.1);
        order.tenant_num = SignController.user.tenant_id;
        order.household = householder;
        order.house_num = house_num;
        return os.add(order);
    }

    public boolean isMoneyEnough(BigDecimal charge) {
        int result = SignController.user.money.compareTo(charge);
        if (result < 0)
            return false;
        return true;
    }

    public boolean checkOut(long house_num) {
        return os.checkOut(house_num);
    }

    public List<OrderBean> getOrderList_H() {
        return os.getOrderList_H();
    }

    public List<OrderBean> getOrderList_T() {
        return os.getOrderList_T();
    }

}
