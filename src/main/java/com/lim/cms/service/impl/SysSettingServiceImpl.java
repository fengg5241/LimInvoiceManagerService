package com.lim.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lim.cms.entity.SimSettings;
import com.lim.cms.mapper.SimSettingsMapper;
import com.lim.cms.service.SysSettingService;

@Service
public class SysSettingServiceImpl implements SysSettingService {

	@Resource
	private SimSettingsMapper settingsMapper;
	
	@Override
	public int insert(SimSettings record) {
		return settingsMapper.insert(record);
	}

	@Override
	public List<SimSettings> selectAll() {
		return settingsMapper.selectAll();
	}

	@Override
	public int update(SimSettings record) {
		return settingsMapper.updateByPrimaryKey(record);
	}

}
