package com.ssafyns.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafyns.dao.UserDAO;
import com.ssafyns.vo.User;

@Service
public class UserServiceImpl implements UserService {

	private UserDAO userDao;

	@Autowired
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	public void createUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	public void modifyUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public void destroyUser(String user_id) {
		userDao.deleteUser(user_id);
	}

	@Override
	public User getUser(String user_id) {
		return userDao.selectUser(user_id);
	}

	@Override
	public List<User> getUserList() {
		return userDao.selectUserList();
	}

}
