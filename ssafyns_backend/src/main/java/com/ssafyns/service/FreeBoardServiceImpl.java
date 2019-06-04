package com.ssafyns.service;

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
	public void insertFreeBoard(FreeBoard freeBoard) {
		freeBoardDao.createFreeBoard(freeBoard);
	}
	
	@Override
	public FreeBoard selectFreeBoard(String freeboard_no) {
		return freeBoardDao.getFreeBoard(freeboard_no);
	}
	
	@Override
	public void updateFreeBoard(FreeBoard freeBoard) {
		freeBoardDao.modifyFreeBoard(freeBoard);
	}
	
	@Override
	public void deleteFreeBoard(String freeboard_no) {
		freeBoardDao.deleteFreeBoard(freeboard_no);
	}
}
