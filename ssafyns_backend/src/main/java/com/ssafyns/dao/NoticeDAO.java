package com.ssafyns.dao;

import java.util.List;

import com.ssafyns.vo.Notice;

public interface NoticeDAO {
	
	void insertNotice(Notice notice);
	void updateNotice(Notice notice);

	void deleteNotice(String notice_no);

	Notice selectNotice(String notice_no);
	
	List<Notice> selectNoticeList();
	
}