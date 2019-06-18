package com.ssafyns.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafyns.vo.Notice;

@Repository
public class NoticeDAOImpl implements NoticeDAO {

	private SqlSession session;

	@Autowired
	public void setSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public Notice selectNotice(int notice_no) {
		return session.selectOne("Notice.selectNotice", notice_no);
	}
	
	@Override
	public List<Notice> selectNoticeList() {
		return session.selectList("Notice.selectNoticeList");
	}

	@Override
	public void insertNotice(Notice notice) {
		session.insert("Notice.insertNotice", notice);
	}
	
	@Override
	public void updateNotice(Notice notice) {
		session.update("Notice.updateNotice", notice);
	}

	@Override
	public void deleteNotice(int notice_no) {
		session.delete("Notice.deleteNotice", notice_no);
	}
}
