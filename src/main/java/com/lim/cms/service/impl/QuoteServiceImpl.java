package com.lim.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lim.cms.entity.SimQuotes;
import com.lim.cms.mapper.SimQuotesMapper;
import com.lim.cms.service.QuoteService;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Resource
	private SimQuotesMapper simQuotesMapper;
	
	@Override
	public int insert(SimQuotes record) {
		return simQuotesMapper.insert(record);
	}

	@Override
	public SimQuotes selectByPrimaryKey(Integer id) {
		return simQuotesMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SimQuotes> selectAll() {
		return simQuotesMapper.selectAll();
	}

	@Override
	public int update(SimQuotes record) {
		return simQuotesMapper.updateByPrimaryKey(record);
	}

	@Override
	public int delete(Integer id) {
		return simQuotesMapper.deleteByPrimaryKey(id);
	}

}
