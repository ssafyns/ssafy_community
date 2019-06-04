package com.ssafyns.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafyns.dao.FreeBoardDAO;
import com.ssafyns.vo.FreeBoard;

@Service
public class FreeBoardServiceImpl implements FreeBoardService {

	private FreeBoardDAO freeBoardDao;
	
	@Autowired
	public void setFreeBoardDao(FreeBoardDAO freeBoardDao) {
		this.freeBoardDao = freeBoardDao;
	}
	
	@Override
	public FreeBoard getFreeBoard(String freeboard_no) {
		return freeBoardDao.selectFreeBoard(freeboard_no);
	}
	
	@Override
	public List<FreeBoard> getFreeBoardList() {
		return freeBoardDao.selectFreeBoardList();
	}
	
	@Override
	public void createFreeBoard(FreeBoard freeBoard) {
		long time = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		freeBoard.setFreeboard_date(dayTime.format(new Date(time)));
		freeBoardDao.insertFreeBoard(freeBoard);
	}
	
	
	@Override
	public void modifyFreeBoard(FreeBoard freeBoard) {
		freeBoardDao.updateFreeBoard(freeBoard);
	}
	
	@Override
	public void destroyFreeBoard(String freeboard_no) {
		freeBoardDao.deleteFreeBoard(freeboard_no);
	}
}
