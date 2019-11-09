package com.lim.cms.service;

import java.util.List;

import com.lim.cms.entity.SimSales;
import com.lim.cms.entity.SimSalesReportCriteria;

public interface SaleService {
	
	int insert(SimSales record);

	SimSales selectByPrimaryKey(Integer id);

    List<SimSales> selectAll();

    int update(SimSales record);
    
    int delete(Integer id);
    
    List<SimSales> getSalesReport(SimSalesReportCriteria criteria);
    
}
