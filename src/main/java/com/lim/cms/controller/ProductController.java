package com.lim.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lim.cms.entity.SimProducts;
import com.lim.cms.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/selectAll", produces = "application/json")
	public List<SimProducts> selectAll() {
		return productService.selectAll();
	}
	
	@RequestMapping(value = "/selectById/{id}", produces = "application/json")
	public SimProducts selectById(@PathVariable int id) {
		return productService.selectByPrimaryKey(id);
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody SimProducts record) {
		productService.insert(record);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody SimProducts record) {
		productService.update(record);
	}
}
