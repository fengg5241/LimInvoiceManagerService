package com.lim.cms.service;

import java.util.List;

import com.lim.cms.entity.SimSaleItems;

public interface SaleItemService {

	int insert(SimSaleItems record);

	SimSaleItems selectByPrimaryKey(Integer id);

    List<SimSaleItems> selectAll();
    
    List<SimSaleItems> selectAllBySaleId(Integer id);

    int update(SimSaleItems record);
    
    int delete(Integer id);
    
    int bulkInsert(List<SimSaleItems> record);
    
    int bulkUpdate(List<SimSaleItems> record);
    
    int bulkDelete(List<SimSaleItems> record);
}
