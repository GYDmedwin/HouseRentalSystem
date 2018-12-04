package com.rental.controller;

import com.rental.domain.EvaluateBean;
import com.rental.service.EvaluateService;

import java.util.List;

public class EvaluateController {
	private EvaluateService es = new EvaluateService();

	public boolean add(long house_id, long tenant_id, String text, int star){
		EvaluateBean evaluate = new EvaluateBean();
		evaluate.tenant_dd = tenant_id;
		evaluate.house = house_id;
		evaluate.evaluate_s = text;
		evaluate.star = star;
		return es.add(evaluate);
	}

	public boolean delete(long eva_id){
		return es.delete(eva_id);
	}

	public List<EvaluateBean> getEvaList(long house_id){
		return es.getEvaList(house_id);
	}

}
