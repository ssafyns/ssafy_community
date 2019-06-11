package com.ssafyns.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafyns.vo.FreeBoardComment;

@Repository
public class FreeBoardCommentDAOImpl implements FreeBoardCommentDAO {

	private SqlSession session;

	@Autowired
	public void setSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public FreeBoardComment selectFreeBoardComment(int fbcomment_no) {
		return session.selectOne("freeBoardComment.selectFreeBoardComment", fbcomment_no);
	}
	
	@Override
	public List<FreeBoardComment> selectFreeBoardCommentList() {
		return session.selectList("freeBoardComment.selectFreeBoardCommentList");
	}

	@Override
	public void insertFreeBoardComment(FreeBoardComment freeBoardComment) {
		session.insert("freeBoardComment.insertFreeBoardComment", freeBoardComment);
	}
	
	@Override
	public void updateFreeBoardComment(FreeBoardComment freeBoardComment) {
		session.update("freeBoardComment.updateFreeBoard", freeBoardComment);
	}

	@Override
	public void deleteFreeBoardComment(int fbcomment_no) {
		session.delete("freeBoardComment.deleteFreeBoardComment", fbcomment_no);
	}
}
