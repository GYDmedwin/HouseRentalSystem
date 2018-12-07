package com.rental.service;

import com.rental.dao.BillDao;
import com.rental.dao.SignDao;
import com.rental.domain.BillBean;

import java.util.List;

public class BillService {

    private BillDao bdo = new BillDao();

    public List<BillBean> getBillList() {
        return bdo.getBillList();
    }

    public boolean payBill(BillBean bill) {
        long householder_id = 12345678901L;
        if (new SignDao().payMoney(householder_id, bill.charge, null, 1)){
            if(bill.type.equals("÷√∂•∑—"))
                bdo.addSetTop(bill.charge,bill.house_dd);
            return bdo.payBill(bill);
        }
        return false;
    }

    public boolean addBill(BillBean bill) {
        return bdo.addBill(bill);
    }
}
