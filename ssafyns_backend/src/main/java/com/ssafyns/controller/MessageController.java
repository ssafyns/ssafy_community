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

import com.ssafyns.service.MessageService;
import com.ssafyns.vo.Message;

@CrossOrigin(origins = "*")
@RestController
public class MessageController {

	private MessageService messageService;

	@Autowired
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	@GetMapping("/message/{message_no}")
	public ResponseEntity<Boolean> getMessageCtrl(@PathVariable int message_no) {
		messageService.getMessage(message_no);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@GetMapping("/messages")
	public ResponseEntity<List<Message>> getMessageListCtrl() {
		List<Message> list = messageService.getMessageList();
		return new ResponseEntity<List<Message>>(list, HttpStatus.OK);
	}

	@PostMapping("/message")
	public ResponseEntity<Boolean> createMessageCtrl(@RequestBody Message message) {
		messageService.createMessage(message);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@PutMapping("/message")
	public ResponseEntity<Boolean> modifyMessageCtrl(@RequestBody Message message) {
		messageService.modifyMessage(message);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@DeleteMapping("message/{message_no}")
	public ResponseEntity<Boolean> deleteMessageCtrl(@PathVariable int message_no) {
		messageService.destroyMessage(message_no);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
}
