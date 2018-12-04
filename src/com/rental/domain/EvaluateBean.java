package com.rental.domain;

public class EvaluateBean {
	public long eva_id;
	public long house;
	public long tenant_dd;
	public String evaluate_s;
	public int star;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String name;
	
	public long getEva_id() {
		return eva_id;
	}
	public void setEva_id(long eva_id) {
		this.eva_id = eva_id;
	}
	public long getHouse() {
		return house;
	}
	public void setHouse(long house) {
		this.house = house;
	}
	public long getTenant_dd() {
		return tenant_dd;
	}
	public void setTenant_dd(long tenant_dd) {
		this.tenant_dd = tenant_dd;
	}
	public String getEvaluate_s() {
		return evaluate_s;
	}
	public void setEvaluate_s(String evaluate_s) {
		this.evaluate_s = evaluate_s;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}

}
