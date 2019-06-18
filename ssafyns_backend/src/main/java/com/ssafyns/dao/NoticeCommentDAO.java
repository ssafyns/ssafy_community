package com.ssafyns.dao;

import java.util.List;

import com.ssafyns.vo.NoticeComment;

public interface NoticeCommentDAO {

	NoticeComment selectNoticeComment(int ncomment_no);

	List<NoticeComment> selectNoticeCommentList();

	void insertNoticeComment(NoticeComment noticeComment);

	void updateNoticeComment(NoticeComment noticeComment);

	void deleteNoticeComment(int ncomment_no);

}