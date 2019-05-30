package com.ssafyns.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ssafyns.vo.User;

public class UserDAOImpl implements UserDAO {

	private SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public void InsertUserDAO(User user) {
		session.insert("user.InsertUser", user);
	}

	@Override
	public void UpdateUserDAO(User user) {
		session.update("user.UpdateUser", user);
	}

	@Override
	public void DeleteUserDAO(String user_id) {
		session.update("user.DeleteUser", user_id);
	}

	@Override
	public User SelectUserDAO(String user_id) {
		return session.selectOne("user.SelectUser", user_id);
	}
	
	@Override
	public List<User> SelectUserListDAO() {
		return session.selectList("user.SelectUserList");
	}
	
}
