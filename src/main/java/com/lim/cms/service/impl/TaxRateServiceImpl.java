package com.lim.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lim.cms.entity.SimTaxRates;
import com.lim.cms.mapper.SimTaxRatesMapper;
import com.lim.cms.service.TaxRateService;

@Service
public class TaxRateServiceImpl implements TaxRateService {

	@Resource
	private SimTaxRatesMapper taxRatesMapper;
	
	@Override
	public int insert(SimTaxRates record) {
		return taxRatesMapper.insert(record);
	}

	@Override
	public SimTaxRates selectByPrimaryKey(Integer id) {
		return taxRatesMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SimTaxRates> selectAll() {
		return taxRatesMapper.selectAll();
	}

	@Override
	public int update(SimTaxRates record) {
		return taxRatesMapper.updateByPrimaryKey(record);
	}

	@Override
	public int delete(Integer id) {
		return taxRatesMapper.deleteByPrimaryKey(id);
	}

}
