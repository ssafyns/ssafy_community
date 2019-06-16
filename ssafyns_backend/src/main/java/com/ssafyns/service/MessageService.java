package com.ssafyns.service;

import java.util.List;

import com.ssafyns.vo.Message;

public interface MessageService {

	Message getMessage(int message_no);

	List<Message> getMessageList();

	void createMessage(Message message);

	void modifyMessage(Message message);

	void destroyMessage(int message_no);

}