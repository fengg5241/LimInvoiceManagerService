package com.lim.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lim.cms.entity.SimSales;
import com.lim.cms.entity.SimSalesReportCriteria;
import com.lim.cms.service.SaleService;

@RestController
@RequestMapping("/api/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@RequestMapping(value = "/selectAll", produces = "application/json")
	public List<SimSales> selectAll() {
		return saleService.selectAll();
	}
	
	@RequestMapping(value = "/selectById/{id}", produces = "application/json")
	public SimSales selectById(@PathVariable int id) {
		return saleService.selectByPrimaryKey(id);
	}
	
	@PostMapping("/insert")
	public int insert(@RequestBody SimSales record) {
		int newQuoteId = saleService.insert(record);
		return newQuoteId;
	}
	
	@PostMapping("/update")
	public void update(@RequestBody SimSales record) {
		saleService.update(record);
	}
	
	@PostMapping(value = "getSalesReport")
	public List<SimSales> getSalesReport(@RequestBody SimSalesReportCriteria searchParams) {
		return saleService.getSalesReport(searchParams);
	}
	
	@RequestMapping(value = "/delete/{id}", produces = "application/json")
	public int delete(@PathVariable int id) {
		return saleService.delete(id);
	}
	
	
}
