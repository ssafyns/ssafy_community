package com.ssafyns.service;

import java.util.List;

import com.ssafyns.vo.FreeBoard;

public interface FreeBoardService {

	FreeBoard getFreeBoard(String freeboard_no);

	List<FreeBoard> getFreeBoardList();

	void createFreeBoard(FreeBoard freeBoard);

	void modifyFreeBoard(FreeBoard freeBoard);

	void destroyFreeBoard(String freeboard_no);

}