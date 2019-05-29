package com.lim.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lim.cms.entity.SimQuoteItems;
import com.lim.cms.mapper.SimQuoteItemsMapper;
import com.lim.cms.service.QuoteItemService;

@Service
public class QuoteItemServiceImpl implements QuoteItemService {

	@Resource
	private SimQuoteItemsMapper simQuoteItemsMapper;
	
	@Override
	public int insert(SimQuoteItems record) {
		return simQuoteItemsMapper.insert(record);
	}

	@Override
	public SimQuoteItems selectByPrimaryKey(Integer id) {
		return simQuoteItemsMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SimQuoteItems> selectAll() {
		return simQuoteItemsMapper.selectAll();
	}

	@Override
	public int update(SimQuoteItems record) {
		return simQuoteItemsMapper.updateByPrimaryKey(record);
	}

	@Override
	public int delete(Integer id) {
		return simQuoteItemsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<SimQuoteItems> selectAllByQuoteId(Integer id) {
		return simQuoteItemsMapper.selectAllByQuoteId(id);
	}

	@Override
	public int bulkInsert(List<SimQuoteItems> record) {
		return simQuoteItemsMapper.bulkInsert(record);
	}

	@Override
	public int bulkUpdate(List<SimQuoteItems> record) {
		return simQuoteItemsMapper.bulkUpdate(record);
	}

	@Override
	public int bulkDelete(List<SimQuoteItems> record) {
		return simQuoteItemsMapper.bulkDelete(record);
	}

}
