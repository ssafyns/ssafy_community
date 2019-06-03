package com.ssafyns.controller;

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

import com.ssafyns.service.FreeBoardService;
import com.ssafyns.vo.FreeBoard;

@CrossOrigin(origins = { "*" })
@RestController
public class FreeBoardController {

	private FreeBoardService freeBoardService;

	@Autowired
	public void setFreeBoardService(FreeBoardService freeBoardService) {
		this.freeBoardService = freeBoardService;
	}

	@GetMapping("/freeBoard/{freeboard_no}")
	public ResponseEntity<Boolean> getFreeBoardCtrl(@PathVariable String freeboard_no) {
		freeBoardService.selectFreeBoard(freeboard_no);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@PostMapping("/freeBoard")
	public ResponseEntity<Boolean> createFreeBoardCtrl(@RequestBody FreeBoard freeBoard) {
		freeBoardService.insertFreeBoard(freeBoard);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@PutMapping("/freeBoard")
	public ResponseEntity<Boolean> modifyFreeBoardCtrl(@RequestBody FreeBoard freeBoard) {
		freeBoardService.updateFreeBoard(freeBoard);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@DeleteMapping("freeBoard/{freeboard_no}")
	public ResponseEntity<Boolean> deleteFreeBoardCtrl(@PathVariable String freeboard_no) {
		freeBoardService.deleteFreeBoard(freeboard_no);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
}
