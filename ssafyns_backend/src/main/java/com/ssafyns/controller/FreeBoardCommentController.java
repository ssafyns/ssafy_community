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

import com.ssafyns.service.FreeBoardCommentService;
import com.ssafyns.vo.FreeBoardComment;

@CrossOrigin(origins = { "*" })
@RestController
public class FreeBoardCommentController {
	
	private FreeBoardCommentService freeBoardCommentService;

	@Autowired
	public void setFreeBoardCommentService(FreeBoardCommentService freeBoardCommentService) {
		this.freeBoardCommentService = freeBoardCommentService;
	}

	@GetMapping("/freeBoardComment/{fbcomment_no}")
	public ResponseEntity<Boolean> getFreeBoardCommentCtrl(@PathVariable int fbcomment_no) {
		freeBoardCommentService.getFreeBoardComment(fbcomment_no);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@GetMapping("/freeBoardComments")
	public ResponseEntity<List<FreeBoardComment>> getFreeBoardCommentListCtrl() {
		List<FreeBoardComment> list = freeBoardCommentService.getFreeBoardCommentList();
		return new ResponseEntity<List<FreeBoardComment>>(list , HttpStatus.OK);
	}
	
	@PostMapping("/freeBoardComment")
	public ResponseEntity<Boolean> createFreeBoardCommentCtrl(@RequestBody FreeBoardComment freeBoardComment) {
		freeBoardCommentService.createFreeBoardComment(freeBoardComment);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@PutMapping("/freeBoardComment")
	public ResponseEntity<Boolean> modifyFreeBoardCommentCtrl(@RequestBody FreeBoardComment freeBoardComment) {
		freeBoardCommentService.modifyFreeBoardComment(freeBoardComment);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@DeleteMapping("freeBoardComment/{fbcomment_no}")
	public ResponseEntity<Boolean> deleteFreeBoardCommentCtrl(@PathVariable int fbcomment_no) {
		freeBoardCommentService.destroyFreeBoardComment(fbcomment_no);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
}
