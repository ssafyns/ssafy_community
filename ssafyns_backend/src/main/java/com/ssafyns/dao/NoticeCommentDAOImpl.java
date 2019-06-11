package com.ssafyns.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafyns.vo.NoticeComment;

@Repository
public class NoticeCommentDAOImpl implements NoticeCommentDAO {

	private SqlSession session;

	@Autowired
	public void setSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public NoticeComment selectNoticeComment(String ncomment_no) {
		return session.selectOne("noticeComment.selectNoticeComment", ncomment_no);
	}
	
	@Override
	public List<NoticeComment> selectNoticeCommentList() {
		return session.selectList("noticeComment.selectNoticeCommentList");
	}

	@Override
	public void insertNoticeComment(NoticeComment noticeComment) {
		session.insert("noticeComment.insertNoticeComment", noticeComment);
	}
	
	@Override
	public void updateNoticeComment(NoticeComment noticeComment) {
		session.update("noticeComment.updateNotice", noticeComment);
	}

	@Override
	public void deleteNoticeComment(String ncomment_no) {
		session.delete("noticeComment.deleteNoticeComment", ncomment_no);
	}
}
