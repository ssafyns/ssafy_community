package com.ssafyns.dao;

import java.util.List;

import com.ssafyns.vo.Message;

public interface MessageDAO {

	Message selectMessage(int message_no);

	List<Message> selectMessageList();

	void insertMessage(Message message);

	void updateMessage(Message message);

	void deleteMessage(int message_no);

}