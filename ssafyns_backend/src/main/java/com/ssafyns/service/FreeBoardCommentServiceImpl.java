package com.ssafyns.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafyns.dao.FreeBoardCommentDAO;
import com.ssafyns.vo.FreeBoardComment;

@Service
public class FreeBoardCommentServiceImpl implements FreeBoardCommentService {

	private FreeBoardCommentDAO freeBoardCommentDao;
	
	@Autowired
	public void setFreeBoardDao(FreeBoardCommentDAO freeBoardCommentDao) {
		this.freeBoardCommentDao = freeBoardCommentDao;
	}
	
	@Override
	public FreeBoardComment getFreeBoardComment(int fbcomment_no) {
		return freeBoardCommentDao.selectFreeBoardComment(fbcomment_no);
	}
	
	@Override
	public List<FreeBoardComment> getFreeBoardCommentList() {
		return freeBoardCommentDao.selectFreeBoardCommentList();
	}
	
	@Override
	public void createFreeBoardComment(FreeBoardComment freeBoardComment) {
		long time = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		freeBoardComment.setFbcomment_date(dayTime.format(new Date(time)));
		freeBoardCommentDao.insertFreeBoardComment(freeBoardComment);
	}
	
	@Override
	public void modifyFreeBoardComment(FreeBoardComment freeBoardComment) {
		freeBoardCommentDao.updateFreeBoardComment(freeBoardComment);
	}
	
	@Override
	public void destroyFreeBoardComment(int fbcomment_no) {
		freeBoardCommentDao.deleteFreeBoardComment(fbcomment_no);
	}
}
