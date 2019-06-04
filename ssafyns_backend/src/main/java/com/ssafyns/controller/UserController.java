package com.ssafyns.controller;

import javax.servlet.http.HttpSession;

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

import com.ssafyns.service.UserService;
import com.ssafyns.vo.User;

@CrossOrigin(origins = { "*" })
@RestController
public class UserController {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/user")
	public ResponseEntity<Boolean> createUserCtrl(@RequestBody User user) {
		System.out.println("create됨!!!!!!!!!!!!!");
		System.out.println(user.toString());
		userService.createUser(user);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@DeleteMapping("/user/{id}")
	public ResponseEntity<Boolean> destroyUserCtrl(@PathVariable String id, HttpSession hsession) {
		userService.destroyUser(id);
		hsession.invalidate();
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@PutMapping("/user")
	public ResponseEntity<Boolean> modifyUserCtrl(@RequestBody User user) {
		userService.modifyUser(user);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserCtrl(@PathVariable String id) {
		return new ResponseEntity<User>(userService.getUser(id), HttpStatus.OK);
	}

	@GetMapping("/users")
	public ResponseEntity<Boolean> getUserListCtrl() {
		userService.getUserList();
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@GetMapping("/login/{id}/{pw}")
	public ResponseEntity<Boolean> UserLoginControllerSelect(@PathVariable String id, @PathVariable String pw) {
		return (userService.getUser(id) != null && userService.getUser(id).getUser_pw().equals(pw))
				? new ResponseEntity<Boolean>(true, HttpStatus.OK)
				: new ResponseEntity<Boolean>(false, HttpStatus.OK);
	}
}
