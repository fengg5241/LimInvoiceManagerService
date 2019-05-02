package com.lim.cms.service;

import java.util.List;

import com.lim.cms.entity.SimTaxRates;

public interface TaxRateService {

	int insert(SimTaxRates record);

	SimTaxRates selectByPrimaryKey(Integer id);

    List<SimTaxRates> selectAll();

    int update(SimTaxRates record);
    
    int delete(Integer id);
}
