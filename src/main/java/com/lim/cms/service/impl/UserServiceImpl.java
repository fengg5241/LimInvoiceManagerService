package com.lim.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lim.cms.entity.SimUsers;
import com.lim.cms.entity.SimUsersGroups;
import com.lim.cms.mapper.SimUsersGroupsMapper;
import com.lim.cms.mapper.SimUsersMapper;
import com.lim.cms.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private SimUsersMapper userMapper;
	
	@Resource
	private SimUsersGroupsMapper userGroupMapper;
	
	@Override
	public int insert(SimUsers record) {
		userMapper.insert(record);
		SimUsersGroups userGroup = new SimUsersGroups();
		userGroup.setGroupId(record.getGroupId());
		userGroup.setUserId(record.getId());
		return userGroupMapper.insert(userGroup);
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
		userMapper.updateByPrimaryKey(record);
		SimUsersGroups userGroup = new SimUsersGroups();
		userGroup.setGroupId(record.getGroupId());
		userGroup.setUserId(record.getId());
		return userGroupMapper.updateByUserId(userGroup);
	}

	@Override
	public int delete(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public SimUsers loginAuth(SimUsers user) {
		return userMapper.loginAuth(user);
	}

	@Override
	public List<SimUsers> selectAllByCustomerId(Integer id) {
		return userMapper.selectAllByCustomerId(id);
	}

	@Override
	public int changePassword(SimUsers record) {
		return userMapper.updateByPrimaryKey(record);
	}

	@Override
	public SimUsers getUserByEmail(String email) {
		return userMapper.selectByEmail(email);
	}

}
