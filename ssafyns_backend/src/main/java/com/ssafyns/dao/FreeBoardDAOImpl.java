package com.ssafyns.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafyns.vo.FreeBoard;

@Repository
public class FreeBoardDAOImpl implements FreeBoardDAO {

	private SqlSession session;

	@Autowired
	public void setSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public void createFreeBoard(FreeBoard freeBoard) {
		session.insert("freeBoard.insertFreeBoard", freeBoard);
	}

	@Override
	public FreeBoard getFreeBoard(String freeboard_no) {
		return session.selectOne("freeBoard.selectFreeBoard", freeboard_no);
	}

	@Override
	public void modifyFreeBoard(FreeBoard freeBoard) {
		session.update("freeBoard.updateFreeBoard", freeBoard);
	}

	@Override
	public void deleteFreeBoard(String freeboard_no) {
		session.delete("freeBoard.deleteFreeBoard", freeboard_no);
	}
}
