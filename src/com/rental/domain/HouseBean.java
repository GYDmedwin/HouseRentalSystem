package com.rental.domain;

import java.math.BigDecimal;

public class HouseBean {
	
	public long house_id;
	public long householder;
	public String type;
	public String h_type;
	public int accommodate;
	public int state;
	public BigDecimal rent;
	public int set_top;
	public String province;
	public String city;
	public String county;
	public String address;
	
	public long getHouse_id() {
		return house_id;
	}

	public void setHouse_id(long house_id) {
		this.house_id = house_id;
	}

	public long getHouseholder() {
		return householder;
	}

	public void setHouseholder(long householder) {
		this.householder = householder;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getH_type() {
		return h_type;
	}

	public void setH_type(String h_type) {
		this.h_type = h_type;
	}

	public int getAccommodate() {
		return accommodate;
	}

	public void setAccommodate(int accommodate) {
		this.accommodate = accommodate;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public BigDecimal getRent() {
		return rent;
	}

	public void setRent(BigDecimal rent) {
		this.rent = rent;
	}

	public int getSet_top() {
		return set_top;
	}

	public void setSet_top(int set_top) {
		this.set_top = set_top;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public HouseBean(String province, String city, String county) {
		this.province = province;
		this.city = city;
		this.county = county;
	}
	public HouseBean() {}
}
