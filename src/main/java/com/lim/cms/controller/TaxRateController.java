package com.lim.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lim.cms.entity.SimCompany;
import com.lim.cms.entity.SimTaxRates;
import com.lim.cms.service.TaxRateService;

@RestController
@RequestMapping("/api/taxRate")
public class TaxRateController {

	@Autowired
	private TaxRateService taxRateService;
	
	@RequestMapping(value = "/selectAll", produces = "application/json")
	public List<SimTaxRates> selectAll() {
		return taxRateService.selectAll();
	}
	
	@RequestMapping(value = "/selectById/{id}", produces = "application/json")
	public SimTaxRates selectById(@PathVariable int id) {
		return taxRateService.selectByPrimaryKey(id);
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody SimTaxRates record) {
		taxRateService.insert(record);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody SimTaxRates record) {
		taxRateService.update(record);
	}
	
	@RequestMapping(value = "/delete/{id}", produces = "application/json")
	public void delete(@PathVariable int id) {
		taxRateService.delete(id);
	}
}
