package com.rental.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.rental.domain.HouseBean;
import com.rental.utils.JDBCUtils;

public class FilterDao {

	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	List<HouseBean> list = new ArrayList<HouseBean>();
	
	public List<HouseBean> filterHouse(String sql) {
		try {
			list = qr.query(sql, new BeanListHandler<>(HouseBean.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
