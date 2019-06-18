package com.ssafyns.service;

import java.util.List;

import com.ssafyns.vo.Notice;

public interface NoticeService {

	Notice getNotice(int freeboard_no);

	List<Notice> getNoticeList();

	void createNotice(Notice Notice);

	void modifyNotice(Notice Notice);

	void destroyNotice(int freeboard_no);

}