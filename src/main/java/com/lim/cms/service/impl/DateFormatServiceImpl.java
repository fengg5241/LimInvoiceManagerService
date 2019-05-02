package com.lim.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lim.cms.entity.SimDateFormat;
import com.lim.cms.mapper.SimDateFormatMapper;
import com.lim.cms.service.DateFormatService;

@Service
public class DateFormatServiceImpl implements DateFormatService {

	@Resource
	private SimDateFormatMapper simDateFormatMapper;
	@Override
	public List<SimDateFormat> selectAll() {
		return simDateFormatMapper.selectAll();
	}

}
