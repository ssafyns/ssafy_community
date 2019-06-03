package com.ssafyns.dao;

import com.ssafyns.vo.FreeBoard;

public interface FreeBoardDAO {

	void createFreeBoard(FreeBoard freeBoard);

	FreeBoard getFreeBoard(String freeboard_no);

	void modifyFreeBoard(FreeBoard freeBoard);

	void deleteFreeBoard(String freeboard_no);

}