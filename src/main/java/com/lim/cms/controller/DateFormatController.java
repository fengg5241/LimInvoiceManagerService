package com.lim.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lim.cms.entity.SimDateFormat;
import com.lim.cms.service.DateFormatService;

@RestController
@RequestMapping("/api/dateFormat")
public class DateFormatController {
	
	@Autowired
	private DateFormatService dateFormatService;
	
	@RequestMapping(value = "/selectAll", produces = "application/json")
	public List<SimDateFormat> selectAll() {
		return dateFormatService.selectAll();
	}

}
