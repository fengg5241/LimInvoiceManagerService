package com.lim.cms.service;

import java.util.List;

import com.lim.cms.entity.SimPaypal;

public interface PaypalService {
	
	int insert(SimPaypal record);

    List<SimPaypal> selectAll();

    int update(SimPaypal record);
}
