package com.lx.splitdb.splitdb.service;

import com.lx.splitdb.splitdb.entity.User;

public interface UserService {
	int addUser(User user);
	
	int deleteUser(User user);
	
	int updateUser(User user);
	
	User getUser(int id);

}
