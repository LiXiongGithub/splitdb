package com.lx.splitdb.splitdb.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lx.splitdb.splitdb.entity.User;
import com.lx.splitdb.splitdb.mapper.UserMapper;
import com.lx.splitdb.splitdb.service.UserService;

@Service("userService")
public class UserServiceImp implements UserService {
	@Autowired
	UserMapper userMapper;

	@Override
	public int addUser(User user) {
		return userMapper.insert(user);
	}

	@Override
	public int deleteUser(User user) {
		return userMapper.delete(user);
	}

	@Override
	public int updateUser(User user) {
		return userMapper.updateByPrimaryKey(user);
	}

	@Override
	public User getUser(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
