package com.rental.service;

import com.rental.dao.EvaluateDao;
import com.rental.domain.EvaluateBean;

import java.util.List;

public class EvaluateService {
	private EvaluateDao edo = new EvaluateDao();


    public boolean add(EvaluateBean evaluate) {
        return edo.add(evaluate);
    }

    public boolean delete(long eva_id) {
        return edo.delete(eva_id);
    }

    public List<EvaluateBean> getEvaList(long house_id) {
        return edo.getEvaList(house_id);
    }
}
