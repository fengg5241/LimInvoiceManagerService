package com.lim.cms.service;

import java.util.List;

import com.lim.cms.entity.SimUsers;

public interface UserService {

	int insert(SimUsers record);

    SimUsers selectByPrimaryKey(Integer id);
   
    List<SimUsers> selectAll();

    int update(SimUsers record);
    
    int delete(Integer id);
}
