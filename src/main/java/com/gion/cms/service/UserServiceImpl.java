package com.gion.cms.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.gion.cms.controller.UserController;
import com.gion.cms.entity.TUser;
import com.gion.cms.mapper.TUserMapper;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger log = Logger.getLogger(UserServiceImpl.class);
	
	@Resource
	private TUserMapper userMapper;
	
	@Override
	public TUser getUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public TUser getUserByPhone(String phone) {
		return userMapper.selectByPhone(phone);
	}

	@Override
	public int insertUser(TUser user) {
		return userMapper.insert(user);
	}

	@Override
	public List<TUser> getAll() {
		return userMapper.selectAll();
	}

	@Override
	public List<TUser> getAllWithPoint() {
		return userMapper.selectAllWIthPoint();
	}
	
	@Override
	public TUser getUserWithPointById(int id) {
		return userMapper.selectUserWIthPointById(id);
	}

	@Override
	public void softDelete(TUser user) {
		userMapper.softDelete(user);
	}

	@Override
	public void insert(TUser user) {
		userMapper.insert(user);
	}

	@Override
	public void update(TUser user) {
		userMapper.updateByPrimaryKey(user);
	}

	@Override
	public TUser getUserWithPointByPhone(String phone) {
		return userMapper.selectUserWIthPointByPhone(phone);
	}

	@Override
	public TUser userLogin(TUser user) {
		
		log.info("====================user service");
		TUser loginUser = userMapper.userLogin(user);
		return loginUser;
	}

	@Override
	public void updatePassword(TUser user) {
		userMapper.updatePassword(user);
	}

	@Override
	public int addPoints(TUser user) {
		return userMapper.addPoints(user);
	}
}
