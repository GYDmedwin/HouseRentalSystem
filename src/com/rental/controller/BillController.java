package com.rental.controller;

import com.rental.domain.BillBean;
import com.rental.service.BillService;

import java.math.BigDecimal;
import java.util.List;

public class BillController {
	
	private BillService bs = new BillService();

	public boolean addBill(long householder, BigDecimal charge, int type, long house_dd){
		BillBean bill = new BillBean();
		bill.charge = charge;
		bill.householder_num = householder;
        bill.house_dd = house_dd;
		if(type == 0){
			bill.type = "手续费";
			bill.pay = 0;
		}else if(type == 1){
			bill.type = "置顶费";
			bill.pay = 0;
		}else if(type == 2){
			bill.type = "佣金";
			bill.pay = 1;
		}
		return bs.addBill(bill);
	}

	public List<BillBean> getBillList(){
		return bs.getBillList();
	}

	public boolean isMoneyEnough(BigDecimal charge){
		int result = SignController.user.money.compareTo(charge);
		if(result < 0)
			return false;
		return true;
	}

	public boolean payBill(long bill_id,BigDecimal charge,long house_dd, int type){
		return bs.payBill(bill_id,charge,house_dd,type);
	}

}
