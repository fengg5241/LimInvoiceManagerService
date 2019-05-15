package com.lim.cms.service;

import java.util.List;

import com.lim.cms.entity.SimQuotes;

public interface QuoteService {
	
	int insert(SimQuotes record);

	SimQuotes selectByPrimaryKey(Integer id);

    List<SimQuotes> selectAll();

    int update(SimQuotes record);
    
    int delete(Integer id);

}
