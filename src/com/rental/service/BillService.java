package com.rental.service;

import com.rental.dao.BillDao;
import com.rental.dao.SignDao;
import com.rental.domain.BillBean;

import java.math.BigDecimal;
import java.util.List;

public class BillService {
       
	   private BillDao bdo = new BillDao();

    public List<BillBean> getBillList() {
        return bdo.getBillList();
    }

    public boolean payBill(long bill_id, BigDecimal charge) {
        long householder_id = 12345678901L;
        if (!new SignDao().payMoney(householder_id,charge, null, 1))
            return false;
        return bdo.payBill(bill_id);
    }
}
