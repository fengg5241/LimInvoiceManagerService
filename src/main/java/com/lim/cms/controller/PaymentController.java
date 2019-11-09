package com.lim.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lim.cms.entity.SimPayment;
import com.lim.cms.entity.SimPaymentReportCriteria;
import com.lim.cms.entity.SimSales;
import com.lim.cms.service.PaymentService;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	
	@RequestMapping(value = "/selectAll", produces = "application/json")
	public List<SimPayment> selectAll() {
		return paymentService.selectAll();
	}
	
	@RequestMapping(value = "/selectAllBySaleId/{id}", produces = "application/json")
	public List<SimPayment> selectAllBySaleId(@PathVariable int id) {
		return paymentService.selectAllBySaleId(id);
	}
	
	@RequestMapping(value = "/selectById/{id}", produces = "application/json")
	public SimPayment selectById(@PathVariable int id) {
		return paymentService.selectByPrimaryKey(id);
	}
	
	@PostMapping(value = "getPaymentReport")
	public List<SimPayment> getPaymentReport(@RequestBody SimPaymentReportCriteria searchParams) {
		return paymentService.getPaymentReport(searchParams);
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody SimPayment record) {
		paymentService.insert(record);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody SimPayment record) {
		paymentService.update(record);
	}
	
	@RequestMapping(value = "/delete/{id}", produces = "application/json")
	public int delete(@PathVariable int id) {
		return paymentService.delete(id);
	}
}
