package com.lim.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lim.cms.entity.SimSkrill;
import com.lim.cms.mapper.SimSkrillMapper;
import com.lim.cms.service.SkrillService;

@Service
public class SkrillServiceImpl implements SkrillService {

	@Resource
	private SimSkrillMapper skrillMapper;
	
	@Override
	public int insert(SimSkrill record) {
		return skrillMapper.insert(record);
	}

	@Override
	public List<SimSkrill> selectAll() {
		return skrillMapper.selectAll();
	}

	@Override
	public int update(SimSkrill record) {
		return skrillMapper.updateByPrimaryKey(record);
	}

}
