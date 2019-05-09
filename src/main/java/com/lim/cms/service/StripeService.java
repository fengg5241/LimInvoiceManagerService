package com.lim.cms.service;

import java.util.List;

import com.lim.cms.entity.SimStripe;

public interface StripeService {

	int insert(SimStripe record);

    List<SimStripe> selectAll();

    int update(SimStripe record);
}
