package com.rental.dao;

import com.rental.controller.SignController;
import com.rental.domain.HouseBean;
import com.rental.domain.OrderBean;
import com.rental.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class OrderDao {
       private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

	public HouseBean getHouse(long house_num) {
		try {
			String sql = "Select * from house where house_id=?";
			List<HouseBean> list = qr.query(sql, house_num, new BeanListHandler<>(HouseBean.class));
			return list.get(0);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean add(OrderBean order) {
		try {
			String sql = "Insert into order_rent(household,tenant_num,house_num,deal,charge,tax,duration) values(?,?,?,?,?,?,?)";
			Object[] params = {order.household,order.tenant_num,order.house_num,order.deal,order.charge,order.tax,order.duration};
			if(qr.update(sql, params)!=0)
				sql = "Update house set state=1 where house_id = ?;";
			    if(qr.update(sql,order.house_num)!=0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<OrderBean> getOrderList_H() {
		try {
			String sql = "SELECT\n" +
					"tenant.name,\n" +
					"House.address,\n" +
					"Order_rent.order_id,\n" +
					"Order_rent.household,\n" +
					"Order_rent.tenant_num,\n" +
					"Order_rent.house_num,\n" +
					"Order_rent.deal,\n" +
					"Order_rent.charge,\n" +
					"Order_rent.tax,\n" +
					"Order_rent.duration\n"+
					"FROM\n" +
					"Order_rent\n" +
					"INNER JOIN house ON (house.house_id = order_rent.house_num)\n" +
					"INNER JOIN tenant ON (tenant.tenant_id =order_rent.tenant_num) where order_rent.household=? order by Order_rent.order_id desc;";
			List<OrderBean> list = qr.query(sql, new BeanListHandler<>(OrderBean.class), SignController.user.householder_id);
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<OrderBean> getOrderList_T() {
		try {
			String sql = "SELECT\n" +
					"Householder.name,\n" +
					"House.address,\n" +
					"Order_rent.order_id,\n" +
					"Order_rent.household,\n" +
					"Order_rent.tenant_num,\n" +
					"Order_rent.house_num,\n" +
					"Order_rent.deal,\n" +
					"Order_rent.charge,\n" +
					"Order_rent.tax,\n" +
					"Order_rent.duration\n"+
					"FROM\n" +
					"Order_rent\n" +
					"INNER JOIN house ON (house.house_id = order_rent.house_num)\n" +
					"INNER JOIN householder ON (householder.householder_id =order_rent.household) where order_rent.tenant_num=? order by Order_rent.order_id desc;";
			List<OrderBean> list = qr.query(sql, new BeanListHandler<>(OrderBean.class), SignController.user.tenant_id);
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean checkOut(long house_num) {
		try {
			String sql = "Update house set state = 2 where house_id = ?";
			if(qr.update(sql,house_num)!=0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
