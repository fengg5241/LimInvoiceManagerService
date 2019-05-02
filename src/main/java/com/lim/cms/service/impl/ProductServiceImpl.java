package com.lim.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lim.cms.entity.SimProducts;
import com.lim.cms.mapper.SimProductsMapper;
import com.lim.cms.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Resource
	private SimProductsMapper simProductsMapper;
	
	@Override
	public int insert(SimProducts record) {
		return simProductsMapper.insert(record);
	}

	@Override
	public SimProducts selectByPrimaryKey(Integer id) {
		return simProductsMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SimProducts> selectAll() {
		return simProductsMapper.selectAll();
	}

	@Override
	public int update(SimProducts record) {
		return simProductsMapper.updateByPrimaryKey(record);
	}

}
