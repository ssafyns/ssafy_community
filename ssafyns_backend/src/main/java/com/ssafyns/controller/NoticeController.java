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

import com.ssafyns.service.NoticeService;
import com.ssafyns.vo.Notice;

@CrossOrigin(origins = { "*" })
@RestController
public class NoticeController {

	private NoticeService noticeService;

	@Autowired
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}

	@GetMapping("/notice/{notice_no}")
	public ResponseEntity<Boolean> getNoticeCtrl(@PathVariable String notice_no) {
		noticeService.getNotice(Integer.parseInt(notice_no));
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@GetMapping("/notices")
	public ResponseEntity<List<Notice>> getNoticeListCtrl() {
		List<Notice> list = noticeService.getNoticeList();
		return new ResponseEntity<List<Notice>>(list , HttpStatus.OK);
	}
	
	@PostMapping("/notice")
	public ResponseEntity<Boolean> createNoticeCtrl(@RequestBody Notice notice) {
		noticeService.createNotice(notice);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@PutMapping("/notice")
	public ResponseEntity<Boolean> modifyNoticeCtrl(@RequestBody Notice notice) {
		noticeService.modifyNotice(notice);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@DeleteMapping("notice/{notice_no}")
	public ResponseEntity<Boolean> deleteNoticeCtrl(@PathVariable String notice_no) {
		noticeService.destroyNotice(Integer.parseInt(notice_no));
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
}
