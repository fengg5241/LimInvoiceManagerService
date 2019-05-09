package com.lim.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lim.cms.entity.SimSkrill;
import com.lim.cms.service.SkrillService;

@RestController
@RequestMapping("/api/skrill")
public class SkrillController {
	@Autowired
	private SkrillService skrillService;
	
	@RequestMapping(value = "/selectAll", produces = "application/json")
	public List<SimSkrill> selectAll() {
		return skrillService.selectAll();
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody SimSkrill record) {
		skrillService.insert(record);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody SimSkrill record) {
		skrillService.update(record);
	}

}
