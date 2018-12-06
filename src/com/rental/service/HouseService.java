package com.rental.service;

import com.rental.dao.HouseDao;
import com.rental.domain.HouseBean;

import java.math.BigDecimal;
import java.util.List;

public class HouseService {
       private HouseDao hao = new HouseDao();

	public boolean add(HouseBean house) {
		return hao.add(house);
	}

	public boolean delete(long house_id) {
		return hao.delete(house_id);
	}

	public List<HouseBean> query(long householder_id) {
		return hao.query(householder_id);
	}

	public boolean update(BigDecimal rent, long house_id) {
		return hao.update(rent,house_id);
	}
}
