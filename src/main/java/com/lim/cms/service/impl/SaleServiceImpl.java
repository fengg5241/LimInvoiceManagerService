package com.lim.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lim.cms.entity.SimSales;
import com.lim.cms.entity.SimSalesReportCriteria;
import com.lim.cms.mapper.SimSalesMapper;
import com.lim.cms.service.SaleService;
@Service
public class SaleServiceImpl implements SaleService {

	@Resource
	private SimSalesMapper simSalesMapper;
	
	@Override
	public int insert(SimSales record) {
		return simSalesMapper.insert(record);
	}

	@Override
	public SimSales selectByPrimaryKey(Integer id) {
		return simSalesMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SimSales> selectAll() {
		return simSalesMapper.selectAll();
	}

	@Override
	public int update(SimSales record) {
		return simSalesMapper.updateByPrimaryKey(record);
	}

	@Override
	public int delete(Integer id) {
		return simSalesMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<SimSales> getSalesReport(SimSalesReportCriteria criteria) {
		return simSalesMapper.selectAllByCondition(criteria);
	}

}
