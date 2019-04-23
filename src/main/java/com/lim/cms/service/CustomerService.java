package com.lim.cms.service;

import java.util.List;

import com.lim.cms.entity.SimCustomers;

public interface CustomerService {

	int insert(SimCustomers record);

    SimCustomers selectByPrimaryKey(Integer id);

    List<SimCustomers> selectAll();

    int update(SimCustomers record);
}
