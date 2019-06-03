package com.ssafyns.service;

import com.ssafyns.vo.FreeBoard;

public interface FreeBoardService {

	void insertFreeBoard(FreeBoard freeBoard);

	FreeBoard selectFreeBoard(String freeboard_no);

	void updateFreeBoard(FreeBoard freeBoard);

	void deleteFreeBoard(String freeboard_no);

}