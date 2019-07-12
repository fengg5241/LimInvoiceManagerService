package com.lim.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lim.cms.entity.SimQuotes;
import com.lim.cms.service.QuoteService;

@RestController
@RequestMapping("/api/quotation")
public class QuotationController {

	@Autowired
	private QuoteService quoteService;
	
	@RequestMapping(value = "/selectAll", produces = "application/json")
	public List<SimQuotes> selectAll() {
		return quoteService.selectAll();
	}
	
	@RequestMapping(value = "/selectById/{id}", produces = "application/json")
	public SimQuotes selectById(@PathVariable int id) {
		return quoteService.selectByPrimaryKey(id);
	}
	
	@PostMapping("/insert")
	public int insert(@RequestBody SimQuotes record) {
		int newQuoteId = quoteService.insert(record);
		return newQuoteId;
	}
	
	@PostMapping("/update")
	public void update(@RequestBody SimQuotes record) {
		quoteService.update(record);
	}
	
	@RequestMapping(value = "/delete/{id}", produces = "application/json")
	public int delete(@PathVariable int id) {
		return quoteService.delete(id);
	}
}
