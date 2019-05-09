package com.lim.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lim.cms.entity.SimPaypal;
import com.lim.cms.service.PaypalService;

@RestController
@RequestMapping("/api/paypal")
public class PaypalController {
	@Autowired
	private PaypalService paypalService;
	
	@RequestMapping(value = "/selectAll", produces = "application/json")
	public List<SimPaypal> selectAll() {
		return paypalService.selectAll();
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody SimPaypal record) {
		paypalService.insert(record);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody SimPaypal record) {
		paypalService.update(record);
	}
}
