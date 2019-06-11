package com.ssafyns.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafyns.vo.Message;

@Repository
public class MessageDAOImpl implements MessageDAO {

	private SqlSession session;

	@Autowired
	public void setSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public Message selectMessage(int message_no) {
		return session.selectOne("message.selectMessage", message_no);
	}
	
	@Override
	public List<Message> selectMessageList() {
		return session.selectList("message.selectMessageList");
	}

	@Override
	public void insertMessage(Message message) {
		session.insert("message.insertMessage", message);
	}
	
	@Override
	public void updateMessage(Message message) {
		session.update("message.updateMessage", message);
	}

	@Override
	public void deleteMessage(int message_no) {
		session.delete("message.deleteMessage", message_no);
	}
}
