package com.ssafyns.dao;

import java.util.List;

import com.ssafyns.vo.FreeBoard;

public interface FreeBoardDAO {
	
	void insertFreeBoard(FreeBoard freeBoard);

	void updateFreeBoard(FreeBoard freeBoard);

	void deleteFreeBoard(int freeboard_no);

	FreeBoard selectFreeBoard(int freeboard_no);
	
	List<FreeBoard> selectFreeBoardList();
	
}