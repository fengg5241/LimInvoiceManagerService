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

import com.lim.cms.entity.SimSaleItems;
import com.lim.cms.service.SaleItemService;

@RestController
@RequestMapping("/api/saleItem")
public class SaleItemController {

	@Autowired
	private SaleItemService saleItemService;
	
	@RequestMapping(value = "/selectAll", produces = "application/json")
	public List<SimSaleItems> selectAll() {
		return saleItemService.selectAll();
	}
	
	@RequestMapping(value = "/selectById/{id}", produces = "application/json")
	public SimSaleItems selectById(@PathVariable int id) {
		return saleItemService.selectByPrimaryKey(id);
	}
	
	@RequestMapping(value = "/selectBySaleId/{id}", produces = "application/json")
	public List<SimSaleItems> selectBySaleId(@PathVariable int id) {
		return saleItemService.selectAllBySaleId(id);
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody SimSaleItems record) {
		saleItemService.insert(record);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody SimSaleItems record) {
		saleItemService.update(record);
	}
	
	@PostMapping("/bulkUpdate")
	public void bulkUpdate(@RequestBody List<SimSaleItems> record) {
		List<SimSaleItems> updateItems = new ArrayList<SimSaleItems>();
		List<SimSaleItems> insertItems = new ArrayList<SimSaleItems>();
		List<SimSaleItems> deleteItems = new ArrayList<SimSaleItems>();
		for (SimSaleItems item : record) {
			if(item.getQuantity() == BigDecimal.ZERO) {
				deleteItems.add(item);
			}else if(item.getId() != null ) {
				updateItems.add(item);
			}else {
				insertItems.add(item);
			}
		}
		
		if(updateItems.size() > 0) {
			saleItemService.bulkUpdate(updateItems);
		}
		if(insertItems.size() > 0) {
			saleItemService.bulkInsert(insertItems);
		}
		if(deleteItems.size() > 0) {
			saleItemService.bulkDelete(deleteItems);
		}
		
	}
	
	@RequestMapping(value = "/delete/{id}", produces = "application/json")
	public int delete(@PathVariable int id) {
		return saleItemService.delete(id);
	}
}
