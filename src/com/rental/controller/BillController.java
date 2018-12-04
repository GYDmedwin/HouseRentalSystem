package com.rental.controller;

import com.rental.domain.BillBean;
import com.rental.service.BillService;

import java.math.BigDecimal;
import java.util.List;

public class BillController {
	
	private BillService bs = new BillService();

	public List<BillBean> getBillList(){
		return bs.getBillList();
	}

	public boolean isMoneyEnough(BigDecimal charge){
		int result = SignController.user.money.compareTo(charge);
		if(result < 0)
			return false;
		return true;
	}

	public boolean payBill(long bill_id,BigDecimal charge){
		return bs.payBill(bill_id,charge);
	}

}
