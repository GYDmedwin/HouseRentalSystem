package com.rental.domain;

import java.math.BigDecimal;

public class OrderBean {
    public long	order_id;
    public long household;
    public long tenant_num;
    public long house_num;
    public int deal;
    public BigDecimal charge;
    public BigDecimal tax;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String name;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String address;
    
    
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	public long getHousehold() {
		return household;
	}
	public void setHousehold(long household) {
		this.household = household;
	}
	public long getTenant_num() {
		return tenant_num;
	}
	public void setTenant_num(long tenant_num) {
		this.tenant_num = tenant_num;
	}
	public long getHouse_num() {
		return house_num;
	}
	public void setHouse_num(long house_num) {
		this.house_num = house_num;
	}
	public int getDeal() {
		return deal;
	}
	public void setDeal(int deal) {
		this.deal = deal;
	}
	public BigDecimal getCharge() {
		return charge;
	}
	public void setCharge(BigDecimal charge) {
		this.charge = charge;
	}
	public BigDecimal getTax() {
		return tax;
	}
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
}
