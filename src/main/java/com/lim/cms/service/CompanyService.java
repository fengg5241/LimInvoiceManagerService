package com.lim.cms.service;

import java.util.List;

import com.lim.cms.entity.SimCompany;

public interface CompanyService {

	int insert(SimCompany record);

    SimCompany selectByPrimaryKey(Integer id);

    List<SimCompany> selectAll();

    int update(SimCompany record);
}
