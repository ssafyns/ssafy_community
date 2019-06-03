package com.ssafyns.service;

import java.util.List;

import com.ssafyns.vo.User;

public interface UserService {

	void createUser(User user);

	void modifyUser(User user);

	void destroyUser(String user_id);

	User getUser(String user_id);

	List<User> getUserList();
	
}