package com.lim.cms.service;

import java.util.List;

import com.lim.cms.entity.SimUsers;

public interface UserService {

	int insert(SimUsers record);

    SimUsers selectByPrimaryKey(Integer id);
    
    SimUsers loginAuth(SimUsers user);
   
    List<SimUsers> selectAll();
    
    List<SimUsers> selectAllByCustomerId(Integer id);

    int update(SimUsers record);
    
    int changePassword(SimUsers record);
    
    int delete(Integer id);
    
    SimUsers getUserByEmail(String email);
}
