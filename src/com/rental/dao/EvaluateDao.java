package com.rental.dao;

import com.rental.domain.EvaluateBean;
import org.apache.commons.dbutils.QueryRunner;

import com.rental.utils.JDBCUtils;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class EvaluateDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());


    public boolean add(EvaluateBean evaluate) {
        try {
            String sql = "Insert into evaluate(house,tenant_dd,evaluate_s,star) values(?,?,?,?);";
            Object[] params = {evaluate.house,evaluate.tenant_dd,evaluate.evaluate_s,evaluate.star};
            if(qr.update(sql,params)!=0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(long eva_id) {
        String sql = "Delete from evaluate where eva_id = ?";
        try {
            if(qr.update(sql,eva_id)!=0)
                return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    //TODO 补全SQL语句，要联合查询出名字
    public List<EvaluateBean> getEvaList(long house_id) {
        String sql = "SELECT\n" +
                "tenant.name,\n" +
                "Evaluate.eva_id,\n" +
                "Evaluate.house,\n" +
                "Evaluate.tenant_dd,\n" +
                "Evaluate.Evaluate_s,\n" +
                "Evaluate.star\n" +
                "FROM\n" +
                "    evaluate\n" +
                "INNER JOIN tenant ON (tenant.tenant_id = evaluate.tenant_dd) where evaluate.house=? order by Evaluate.eva_id desc;";
        try {
            List<EvaluateBean> list = qr.query(sql, new BeanListHandler<>(EvaluateBean.class), house_id);
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
