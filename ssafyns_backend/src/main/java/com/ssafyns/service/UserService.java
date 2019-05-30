package com.ssafyns.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ssafyns.dao.UserDAO;
import com.ssafyns.vo.User;

public interface UserService {

	void setUserDao(UserDAO userDao);

	void InsertUserService(User user);

	void UpdateUserService(User user);

	void DeleteUserService(String user_id);

	User SelectUserService(String user_id);

	List<User> SelectUserListService();
	
}