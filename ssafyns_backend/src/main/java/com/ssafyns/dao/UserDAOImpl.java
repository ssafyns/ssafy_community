package com.ssafyns.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafyns.vo.User;

@Repository
public class UserDAOImpl implements UserDAO {

	private SqlSession session;

	@Autowired
	public void setSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public void insertUser(User user) {
		session.insert("user.InsertUser", user);
	}

	@Override
	public void updateUser(User user) {
		session.update("user.UpdateUser", user);
	}

	@Override
	public void deleteUser(String user_id) {
		session.delete("user.DeleteUser", user_id);
	}

	@Override
	public User selectUser(String user_id) {
		return session.selectOne("user.SelectUser", user_id);
	}
	
	@Override
	public List<User> selectUserList() {
		return session.selectList("user.SelectUserList");
	}
	
}
