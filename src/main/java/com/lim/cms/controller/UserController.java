package com.lim.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lim.cms.entity.SimUsers;
import com.lim.cms.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/selectAll", produces = "application/json")
	public List<SimUsers> selectAll() {
		return userService.selectAll();
	}
	
	@RequestMapping(value = "/selectById/{id}", produces = "application/json")
	public SimUsers selectById(@PathVariable int id) {
		return userService.selectByPrimaryKey(id);
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody SimUsers record) {
		userService.insert(record);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody SimUsers record) {
		userService.update(record);
	}
	
	@RequestMapping(value = "/delete/{id}", produces = "application/json")
	public int delete(@PathVariable int id) {
		return userService.delete(id);
	}
}
