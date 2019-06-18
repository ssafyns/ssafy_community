package com.ssafyns.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafyns.service.NoticeCommentService;
import com.ssafyns.vo.NoticeComment;

@CrossOrigin(origins = { "*" })
@RestController
public class NoticeCommentController {
	
	private NoticeCommentService noticeCommentService;

	@Autowired
	public void setNoticeCommentService(NoticeCommentService noticeCommentService) {
		this.noticeCommentService = noticeCommentService;
	}

	@GetMapping("/noticeComment/{ncomment_no}")
	public ResponseEntity<Boolean> getNoticeCommentCtrl(@PathVariable String ncomment_no) {
		noticeCommentService.getNoticeComment(Integer.parseInt(ncomment_no));
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@GetMapping("/noticeComments")
	public ResponseEntity<List<NoticeComment>> getNoticeCommentListCtrl() {
		List<NoticeComment> list = noticeCommentService.getNoticeCommentList();
		return new ResponseEntity<List<NoticeComment>>(list , HttpStatus.OK);
	}
	
	@PostMapping("/noticeComment")
	public ResponseEntity<Boolean> createNoticeCommentCtrl(@RequestBody NoticeComment noticeComment) {
		noticeCommentService.createNoticeComment(noticeComment);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@PutMapping("/noticeComment")
	public ResponseEntity<Boolean> modifyNoticeCommentCtrl(@RequestBody NoticeComment noticeComment) {
		noticeCommentService.modifyNoticeComment(noticeComment);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@DeleteMapping("noticeComment/{ncomment_no}")
	public ResponseEntity<Boolean> deleteNoticeCommentCtrl(@PathVariable String ncomment_no) {
		noticeCommentService.destroyNoticeComment(Integer.parseInt(ncomment_no));
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
}
