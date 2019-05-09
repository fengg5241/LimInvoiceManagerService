package com.lim.cms.service;

import java.util.List;

import com.lim.cms.entity.SimSkrill;

public interface SkrillService {
	
	int insert(SimSkrill record);

    List<SimSkrill> selectAll();

    int update(SimSkrill record);

}
