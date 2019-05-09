package com.lim.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.lim.cms.entity.SimPaypal;
import com.lim.cms.mapper.SimPaypalMapper;
import com.lim.cms.service.PaypalService;

public class PaypalServiceImpl implements PaypalService {

	@Resource
	private SimPaypalMapper paypalMapper;
	
	@Override
	public int insert(SimPaypal record) {
		return paypalMapper.insert(record);
	}

	@Override
	public List<SimPaypal> selectAll() {
		return paypalMapper.selectAll();
	}

	@Override
	public int update(SimPaypal record) {
		return paypalMapper.updateByPrimaryKey(record);
	}
}
