package com.ssafyns.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafyns.dao.MessageDAO;
import com.ssafyns.vo.Message;

@Service
public class MessageServiceImpl implements MessageService {

	private MessageDAO messageDao;

	@Autowired
	public void setMessageDao(MessageDAO messageDao) {
		this.messageDao = messageDao;
	}

	@Override
	public Message getMessage(int message_no) {
		return messageDao.selectMessage(message_no);
	}

	@Override
	public List<Message> getMessageList() {
		return messageDao.selectMessageList();
	}

	@Override
	public void createMessage(Message message) {
		long time = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		message.setMessage_date(dayTime.format(new Date(time)));
		messageDao.insertMessage(message);
	}

	@Override
	public void modifyMessage(Message message) {
		messageDao.updateMessage(message);
	}

	@Override
	public void destroyMessage(int message_no) {
		messageDao.deleteMessage(message_no);
	}
}
