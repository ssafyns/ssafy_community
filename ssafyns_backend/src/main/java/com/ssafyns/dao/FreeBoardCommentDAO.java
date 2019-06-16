package com.ssafyns.dao;

import java.util.List;

import com.ssafyns.vo.FreeBoard;
import com.ssafyns.vo.FreeBoardComment;

public interface FreeBoardCommentDAO {

	FreeBoardComment selectFreeBoardComment(int fbcomment_no);

	List<FreeBoardComment> selectFreeBoardCommentList();

	void insertFreeBoardComment(FreeBoardComment freeBoardComment);

	void updateFreeBoardComment(FreeBoardComment freeBoardComment);

	void deleteFreeBoardComment(int fbcomment_no);

}