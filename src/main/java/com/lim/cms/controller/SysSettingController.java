package com.lim.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lim.cms.entity.SimCompany;
import com.lim.cms.entity.SimSettings;
import com.lim.cms.service.SysSettingService;

@RestController
@RequestMapping("/sysSetting")
public class SysSettingController {
	@Autowired
	private SysSettingService sysSettingService;
	
	@RequestMapping(value = "/selectAll", produces = "application/json")
	public List<SimSettings> selectAll() {
		return sysSettingService.selectAll();
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody SimSettings record) {
		sysSettingService.insert(record);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody SimSettings record) {
		sysSettingService.update(record);
	}

}
