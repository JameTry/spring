package com.jame.service;

import com.jame.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : Jame
 * @date : 2021-11-18 16:27
 **/
@Component
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public int getUserCount(){
		return userMapper.selectCount();
	}
}
