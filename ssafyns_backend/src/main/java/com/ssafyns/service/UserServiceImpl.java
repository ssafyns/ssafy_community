package com.ssafyns.service;

import java.util.List;

import com.ssafyns.dao.UserDAO;
import com.ssafyns.vo.User;

public class UserServiceImpl implements UserService {

	UserDAO userDao;

	@Override
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	public void InsertUserService(User user) {
		userDao.InsertUserDAO(user);
	}

	@Override
	public void UpdateUserService(User user) {
		userDao.UpdateUserDAO(user);
	}

	@Override
	public void DeleteUserService(String user_id) {
		userDao.DeleteUserDAO(user_id);
	}

	@Override
	public User SelectUserService(String user_id) {
		User u = userDao.SelectUserDAO(user_id);
		return u;
	}

	@Override
	public List<User> SelectUserListService() {
		return userDao.SelectUserListDAO();
	}

}
