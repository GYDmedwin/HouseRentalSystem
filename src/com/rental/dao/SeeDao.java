package com.rental.dao;

import com.rental.controller.SignController;
import com.rental.domain.SeeBean;
import com.rental.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

public class SeeDao {
    private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

	public boolean seeHouse(SeeBean see) {
        try {
        	String sql = "Select householder from house where house_id = ?";
            long householder = qr.query(sql,new ScalarHandler<Long>(),see.house_num);
            if(householder == SignController.user.householder_id)
            	return false;
			sql = "Insert into see_house(house_num,tenant,date,deal,agree) "
					+ "values(?,?,?,?,?);";
			Object[] params = {see.house_num,see.tenant,see.date,see.deal,see.agree};
			if(qr.update(sql, params)!=0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return false;
	}

	public List<SeeBean> getSeeList_H() {
        try {
        		String sql = "SELECT\r\n" + 
        				"house.address,\r\n" + 
        				"Tenant.name ,\r\n" + 
        				"Tenant.ph_id,\r\n" + 
        				"See_house.see_id,\r\n" + 
        				"See_house.house_num,\r\n" + 
        				"See_house.tenant,\r\n" + 
        				"See_house.date,\r\n" + 
        				"See_house.deal,\r\n" + 
        				"See_house.agree\r\n" + 
        				"FROM\r\n" + 
        				"    See_house\r\n" + 
        				"INNER JOIN house ON (house.house_id = see_house.house_num)\r\n" + 
        				"INNER JOIN tenant ON (tenant.tenant_id = see_house.tenant) WHERE house.householder=? order by See_house.see_id desc";
    			List<SeeBean> list = 
    					qr.query(sql, SignController.user.householder_id, new BeanListHandler<>(SeeBean.class));
    			return list;
        } catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
     
	public List<SeeBean> getSeeList_T() {
        try {
        	String sql = "SELECT\r\n" + 
        			"    house.address,\r\n" + 
        			"See_house.see_id,\r\n" + 
        			"See_house.house_num,\r\n" + 
        			"See_house.tenant,\r\n" + 
        			"See_house.date,\r\n" + 
        			"See_house.deal,\r\n" + 
        			"See_house.agree\r\n" + 
        			"FROM\r\n" + 
        			"    See_house\r\n" + 
        			"INNER JOIN house ON (house.house_id = see_house.house_num) where see_house.tenant=? order by See_house.see_id desc;";
        	List<SeeBean> list = 
					qr.query(sql, SignController.user.tenant_id, new BeanListHandler<>(SeeBean.class));
        		return list;
        } catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean isAgree(int isAgree, long see_id) {
		try {
			String sql = "Update see_house set agree=? where see_id=?;";
			Object[] params = {isAgree,see_id};
			if(qr.update(sql, params)!=0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
