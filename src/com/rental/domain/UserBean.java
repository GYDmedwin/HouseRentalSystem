package com.rental.domain;

public class UserBean {
	public long tenant_id;
	public long getTenant_id() {
		return tenant_id;
	}
	public void setTenant_id(long tenant_id) {
		this.tenant_id = tenant_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPh_id() {
		return ph_id;
	}
	public void setPh_id(String ph_id) {
		this.ph_id = ph_id;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getComplete() {
		return complete;
	}
	public void setComplete(int complete) {
		this.complete = complete;
	}
	public String name;
	public String adress;
	public String ph_id;
	public String birth;
	public String sex;
	public int complete;
	public boolean isHouseHolder = false;
	public long householder_id;
}
