package com.ssafyns.service;

import java.util.List;

import com.ssafyns.vo.NoticeComment;

public interface NoticeCommentService {

	NoticeComment getNoticeComment(String ncomment_no);

	List<NoticeComment> getNoticeCommentList();

	void createNoticeComment(NoticeComment noticeComment);

	void modifyNoticeComment(NoticeComment noticeComment);

	void destroyNoticeComment(String ncomment_no);

}