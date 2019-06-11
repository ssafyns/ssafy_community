package com.ssafyns.dao;

import java.util.List;

import com.ssafyns.vo.NoticeComment;

public interface NoticeCommentDAO {

	NoticeComment selectNoticeComment(String ncomment_no);

	List<NoticeComment> selectNoticeCommentList();

	void insertNoticeComment(NoticeComment noticeComment);

	void updateNoticeComment(NoticeComment noticeComment);

	void deleteNoticeComment(String ncomment_no);

}