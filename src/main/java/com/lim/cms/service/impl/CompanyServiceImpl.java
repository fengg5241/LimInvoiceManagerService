package com.lim.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lim.cms.entity.SimCompany;
import com.lim.cms.mapper.SimCompanyMapper;
import com.lim.cms.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Resource
	private SimCompanyMapper companyMapper;
	
	@Override
	public int insert(SimCompany record) {
		return companyMapper.insert(record);
	}

	@Override
	public SimCompany selectByPrimaryKey(Integer id) {
		return companyMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SimCompany> selectAll() {
		return companyMapper.selectAll();
	}

	@Override
	public int update(SimCompany record) {
		return companyMapper.updateByPrimaryKey(record);
	}

}
