package com.rental.domain;

import java.math.BigDecimal;

public class BillBean {
	public long bill_id;
	public long householder_num;
	public BigDecimal charge;
	public String type;
	public int pay;
	
	public long getBill_id() {
		return bill_id;
	}
	public void setBill_id(long bill_id) {
		this.bill_id = bill_id;
	}
	public long getHouseholder_num() {
		return householder_num;
	}
	public void setHouseholder_num(long householder_num) {
		this.householder_num = householder_num;
	}
	public BigDecimal getCharge() {
		return charge;
	}
	public void setCharge(BigDecimal charge) {
		this.charge = charge;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
}
