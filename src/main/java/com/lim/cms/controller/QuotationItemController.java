package com.lim.cms.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lim.cms.entity.SimQuoteItems;
import com.lim.cms.service.QuoteItemService;


@RestController
@RequestMapping("/api/quotationItem")
public class QuotationItemController {
	
	@Autowired
	private QuoteItemService quoteItemService;
	
	@RequestMapping(value = "/selectAll", produces = "application/json")
	public List<SimQuoteItems> selectAll() {
		return quoteItemService.selectAll();
	}
	
	@RequestMapping(value = "/selectById/{id}", produces = "application/json")
	public SimQuoteItems selectById(@PathVariable int id) {
		return quoteItemService.selectByPrimaryKey(id);
	}
	
	@RequestMapping(value = "/selectByQuoteId/{id}", produces = "application/json")
	public List<SimQuoteItems> selectByQuoteId(@PathVariable int id) {
		return quoteItemService.selectAllByQuoteId(id);
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody SimQuoteItems record) {
		quoteItemService.insert(record);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody SimQuoteItems record) {
		quoteItemService.update(record);
	}
	
	@PostMapping("/bulkUpdate")
	public void bulkUpdate(@RequestBody List<SimQuoteItems> record) {
		List<SimQuoteItems> updateItems = new ArrayList<SimQuoteItems>();
		List<SimQuoteItems> insertItems = new ArrayList<SimQuoteItems>();
		List<SimQuoteItems> deleteItems = new ArrayList<SimQuoteItems>();
		for (SimQuoteItems item : record) {
			if(item.getQuantity() == BigDecimal.ZERO) {
				deleteItems.add(item);
			}else if(item.getId() != null ) {
				updateItems.add(item);
			}else {
				insertItems.add(item);
			}
		}
		
		if(updateItems.size() > 0) {
			quoteItemService.bulkUpdate(updateItems);
		}
		if(insertItems.size() > 0) {
			quoteItemService.bulkInsert(insertItems);
		}
		if(deleteItems.size() > 0) {
			quoteItemService.bulkDelete(deleteItems);
		}
		
	}
	
	@RequestMapping(value = "/delete/{id}", produces = "application/json")
	public int delete(@PathVariable int id) {
		return quoteItemService.delete(id);
	}

}
