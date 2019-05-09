package com.lim.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lim.cms.entity.SimStripe;
import com.lim.cms.service.StripeService;

@RestController
@RequestMapping("/api/stripe")
public class StripeController {

	@Autowired
	private StripeService stripeService;
	
	@RequestMapping(value = "/selectAll", produces = "application/json")
	public List<SimStripe> selectAll() {
		return stripeService.selectAll();
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody SimStripe record) {
		stripeService.insert(record);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody SimStripe record) {
		stripeService.update(record);
	}
}
