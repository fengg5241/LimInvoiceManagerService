package com.lim.cms.service;

import java.util.List;

import com.lim.cms.entity.SimSettings;

public interface SysSettingService {
	
	int insert(SimSettings record);

    List<SimSettings> selectAll();

    int update(SimSettings record);

}
