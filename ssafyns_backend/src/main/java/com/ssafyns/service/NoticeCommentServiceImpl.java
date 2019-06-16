package com.ssafyns.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafyns.dao.NoticeCommentDAO;
import com.ssafyns.vo.NoticeComment;

@Service
public class NoticeCommentServiceImpl implements NoticeCommentService {

	private NoticeCommentDAO noticeCommentDao;
	
	@Autowired
	public void setNoticeDao(NoticeCommentDAO noticeCommentDao) {
		this.noticeCommentDao = noticeCommentDao;
	}
	
	@Override
	public NoticeComment getNoticeComment(String fbcomment_no) {
		return noticeCommentDao.selectNoticeComment(fbcomment_no);
	}
	
	@Override
	public List<NoticeComment> getNoticeCommentList() {
		return noticeCommentDao.selectNoticeCommentList();
	}
	
	@Override
	public void createNoticeComment(NoticeComment noticeComment) {
		long time = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		noticeComment.setNcomment_date(dayTime.format(new Date(time)));
		noticeCommentDao.insertNoticeComment(noticeComment);
	}
	
	@Override
	public void modifyNoticeComment(NoticeComment noticeComment) {
		noticeCommentDao.updateNoticeComment(noticeComment);
	}
	
	@Override
	public void destroyNoticeComment(String fbcomment_no) {
		noticeCommentDao.deleteNoticeComment(fbcomment_no);
	}
}
