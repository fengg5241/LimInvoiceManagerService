package com.lim.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lim.cms.entity.SimCustomers;
import com.lim.cms.mapper.SimCustomersMapper;
import com.lim.cms.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Resource
	private SimCustomersMapper customerMapper;
	
	@Override
	public int insert(SimCustomers record) {
		customerMapper.insert(record);
		return record.getId();
	}

	@Override
	public SimCustomers selectByPrimaryKey(Integer id) {
		return customerMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SimCustomers> selectAll() {
		return customerMapper.selectAll();
	}

	@Override
	public int update(SimCustomers record) {
		return customerMapper.updateByPrimaryKey(record);
	}

}
