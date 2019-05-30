package com.ssafyns.dao;

import java.util.List;

import com.ssafyns.vo.User;

public interface UserDAO {

	void insertUser(User user);

	void updateUser(User user);

	void deleteUser(String user_id);

	User selectUser(String user_id);
	
	List<User> selectUserList();

	
}