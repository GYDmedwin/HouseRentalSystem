package com.rental.dao;

import com.rental.controller.SignController;
import com.rental.domain.BillBean;
import org.apache.commons.dbutils.QueryRunner;

import com.rental.utils.JDBCUtils;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public class BillDao {

    private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

    public List<BillBean> getBillList() {
        try {
            String sql = "SELECT\n" +
                    "house.address,\n" +
                    "bill.bill_id,\n" +
                    "bill.house_dd,\n" +
                    "Bill.householder_num,\n" +
                    "bill.charge,\n" +
                    "bill.type,\n" +
                    "bill.pay\n" +
                    "FROM\n" +
                    "    bill\n" +
                    "INNER JOIN house ON (house.house_id = bill.house_dd) where bill.householder_num=?";
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
            if (qr.update(sql, bill_id) != 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addSetTop(BigDecimal charge, long house_dd) {
        try {
            String sql = "Update house set set_top = set_top+? where house_id = ?";
            Object[] params = {charge,house_dd};
            if (qr.update(sql, params) != 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addBill(BillBean bill) {
        try {
            String sql = "Insert into bill(householder_num,charge,type,pay,house_dd) values(?,?,?,?,?)";
            Object[] params = {bill.householder_num,bill.charge,bill.type,bill.pay,bill.house_dd};
            if(qr.update(sql,params)!=0)
                return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
