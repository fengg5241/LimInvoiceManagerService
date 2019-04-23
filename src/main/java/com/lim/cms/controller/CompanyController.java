package com.lim.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lim.cms.entity.SimCompany;
import com.lim.cms.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(value = "/selectAll", produces = "application/json")
	public List<SimCompany> selectAll() {
		return companyService.selectAll();
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody SimCompany record) {
		companyService.insert(record);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody SimCompany record) {
		companyService.update(record);
	}
}
