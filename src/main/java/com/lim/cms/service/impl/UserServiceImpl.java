package com.lim.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lim.cms.entity.SimUsers;
import com.lim.cms.mapper.SimUsersMapper;
import com.lim.cms.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private SimUsersMapper userMapper;
	
	@Override
	public int insert(SimUsers record) {
		return userMapper.insert(record);
	}

	@Override
	public SimUsers selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SimUsers> selectAll() {
		return userMapper.selectAll();
	}

	@Override
	public int update(SimUsers record) {
		return userMapper.updateByPrimaryKey(record);
	}

	@Override
	public int delete(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

}
