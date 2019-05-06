package com.lim.cms.service;

import java.util.List;

import com.lim.cms.entity.SimProducts;

public interface ProductService {

	int insert(SimProducts record);

    SimProducts selectByPrimaryKey(Integer id);

    List<SimProducts> selectAll();

    int update(SimProducts record);
    
    int delete(Integer id);
}
