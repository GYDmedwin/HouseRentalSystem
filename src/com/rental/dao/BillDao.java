package com.rental.dao;

import com.rental.controller.SignController;
import com.rental.domain.BillBean;
import org.apache.commons.dbutils.QueryRunner;

import com.rental.utils.JDBCUtils;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class BillDao {
	
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

	public List<BillBean> getBillList(){
        try {
            String sql ="Select * from bill where householder_num = ?";
            List<BillBean> list = qr.query(sql, new BeanListHandler<>(BillBean.class), SignController.user.householder_id);
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
	}

    public boolean payBill(long bill_id) {
        try {
            String sql = "Update bill set pay = 1 where bill_id = ?";
            if(qr.update(sql,bill_id)!=0){
                return true;
}
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
