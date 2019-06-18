package com.ssafyns.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafyns.dao.NoticeDAO;
import com.ssafyns.vo.Notice;

@Service
public class NoticeServiceImpl implements NoticeService {

	private NoticeDAO noticeDao;
	
	@Autowired
	public void setNoticeDao(NoticeDAO noticeDao) {
		this.noticeDao = noticeDao;
	}
	
	@Override
	public Notice getNotice(int notice_no) {
		return noticeDao.selectNotice(notice_no);
	}
	
	@Override
	public List<Notice> getNoticeList() {
		return noticeDao.selectNoticeList();
	}
	
	@Override
	public void createNotice(Notice notice) {
		long time = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		notice.setNotice_date(dayTime.format(new Date(time)));
		noticeDao.insertNotice(notice);
	}
	
	
	@Override
	public void modifyNotice(Notice notice) {
		noticeDao.updateNotice(notice);
	}
	
	@Override
	public void destroyNotice(int notice_no) {
		noticeDao.deleteNotice(notice_no);
	}
}
