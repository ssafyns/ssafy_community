package com.ssafyns.dao;

import java.util.List;

import com.ssafyns.vo.User;

public interface UserDAO {

	void InsertUserDAO(User user);

	void UpdateUserDAO(User user);

	void DeleteUserDAO(String user_id);

	User SelectUserDAO(String user_id);
	
	List<User> SelectUserListDAO();

	
}