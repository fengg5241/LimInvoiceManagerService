package com.lim.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lim.cms.entity.SimCustomers;
import com.lim.cms.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/selectAll", produces = "application/json")
	public List<SimCustomers> selectAll() {
		return customerService.selectAll();
	}
	
	@RequestMapping(value = "/selectById/{id}", produces = "application/json")
	public SimCustomers selectById(@PathVariable int id) {
		return customerService.selectByPrimaryKey(id);
	}
	
	@PostMapping("/insert")
	public int insert(@RequestBody SimCustomers record) {
		return customerService.insert(record);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody SimCustomers record) {
		customerService.update(record);
	}
	
	@RequestMapping(value = "/delete/{id}", produces = "application/json")
	public int delete(@PathVariable int id) {
		return customerService.delete(id);
	}
}
