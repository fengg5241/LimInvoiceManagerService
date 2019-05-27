package com.lim.cms.service;

import java.util.List;

import com.lim.cms.entity.SimQuoteItems;

public interface QuoteItemService {
	
	int insert(SimQuoteItems record);

	SimQuoteItems selectByPrimaryKey(Integer id);

    List<SimQuoteItems> selectAll();
    
    List<SimQuoteItems> selectAllByQuoteId(Integer id);

    int update(SimQuoteItems record);
    
    int delete(Integer id);
    
    int bulkInsert(List<SimQuoteItems> record);
    
    int bulkUpdate(List<SimQuoteItems> record);

}
