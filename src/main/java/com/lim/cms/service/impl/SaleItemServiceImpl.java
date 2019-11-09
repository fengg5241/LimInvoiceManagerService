package com.lim.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lim.cms.entity.SimSaleItems;
import com.lim.cms.mapper.SimSaleItemsMapper;
import com.lim.cms.service.SaleItemService;

@Service
public class SaleItemServiceImpl implements SaleItemService {

	@Resource
	private SimSaleItemsMapper simSaleItemsMapper;
	
	@Override
	public int insert(SimSaleItems record) {
		return simSaleItemsMapper.insert(record);
	}

	@Override
	public SimSaleItems selectByPrimaryKey(Integer id) {
		return simSaleItemsMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SimSaleItems> selectAll() {
		return simSaleItemsMapper.selectAll();
	}

	@Override
	public int update(SimSaleItems record) {
		return simSaleItemsMapper.updateByPrimaryKey(record);
	}

	@Override
	public int delete(Integer id) {
		return simSaleItemsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<SimSaleItems> selectAllBySaleId(Integer id) {
		return simSaleItemsMapper.selectAllBySaleId(id);
	}

	@Override
	public int bulkInsert(List<SimSaleItems> record) {
		return simSaleItemsMapper.bulkInsert(record);
	}

	@Override
	public int bulkUpdate(List<SimSaleItems> record) {
		return simSaleItemsMapper.bulkUpdate(record);
	}

	@Override
	public int bulkDelete(List<SimSaleItems> record) {
		return simSaleItemsMapper.bulkDelete(record);
	}
}
