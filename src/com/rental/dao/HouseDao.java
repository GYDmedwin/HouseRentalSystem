package com.rental.dao;

import com.rental.controller.BillController;
import com.rental.domain.HouseBean;
import com.rental.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public class HouseDao {
       private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

	public boolean add(HouseBean house) {
		try {
			String sql = "Insert into house(householder,type,h_type,accommodate,state,rent,province,city,county,address,set_top) "
					+ "values(?,?,?,?,?,?,?,?,?,?,?);";
			Object[] params = {house.householder,house.type,house.h_type,house.accommodate,house.state,
					house.rent,house.province,house.city,house.county,house.address,house.set_top};
			if(qr.update(sql, params)!=0) {
				new BillController().addBill(house.householder,new BigDecimal(300),0,house.house_id);
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean delete(long house_id) {
		try {
			String sql = "Delete from house where house_id=?;";
			if(qr.update(sql, house_id)!=0) {
				return true;
			}
		} catch (SQLException e) {
			String sql = "Update house set state=-1 where house_id=?;";
			try {
				qr.update(sql,house_id);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			//e.printStackTrace();
		}
		return false;
	}

	public List<HouseBean> query(long householder_id) {
		List<HouseBean> list = null;
		try {
			String sql = "Select * from house where householder=? and state>-1 order by state desc,set_top desc,house_id asc;";
			list = qr.query(sql, householder_id, new BeanListHandler<>(HouseBean.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}		
        return list;
	}

	public boolean update(BigDecimal rent, long house_id) {
        try {
			String sql = "Update house set rent=? where house_id=?;";
			Object[] params = {rent,house_id};
			if(qr.update(sql, params)!=0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
