package com.ssafyns.dao;

import java.util.List;

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
	public FreeBoard selectFreeBoard(int freeboard_no) {
		return session.selectOne("freeBoard.selectFreeBoard", freeboard_no);
	}
	
	@Override
	public List<FreeBoard> selectFreeBoardList() {
		return session.selectList("freeBoard.selectFreeBoardList");
	}

	@Override
	public void insertFreeBoard(FreeBoard freeBoard) {
		session.insert("freeBoard.insertFreeBoard", freeBoard);
	}
	
	@Override
	public void updateFreeBoard(FreeBoard freeBoard) {
		session.update("freeBoard.updateFreeBoard", freeBoard);
	}

	@Override
	public void deleteFreeBoard(int freeboard_no) {
		session.delete("freeBoard.deleteFreeBoard", freeboard_no);
	}
}
