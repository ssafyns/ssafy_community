package com.ssafyns.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafyns.service.UserService;
import com.ssafyns.vo.User;

@RequestMapping("/user")
@Controller
public class UserController {

	UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/u_insert.do")
	public String UserControllerInsert(User user,HttpSession session) {
		userService.SelectUserService(user.getUser_id());
		return "redirect:/food/list.do";
	}

	@PostMapping("/u_delete.do")
	public String UserControllerDelete(HttpSession hsession) {
		userService.DeleteUserService(((User) hsession.getAttribute("user")).getUser_id());
		hsession.invalidate();
		return "redirect:/food/list.do";
	}

	@PostMapping("/u_update.do")
	public String UserControllerUpdate(User user, HttpSession session) {
		userService.UpdateUserService(user);
		session.setAttribute("user", user);
		return "redirect:/food/list.do";
	}

	@GetMapping("/u_select.do")
	public String UserControllerSelect(Model model, User user) {
		model.addAttribute("user", userService.SelectUserService(user.getUser_id()));
		return "redirect:/food/list.do";
	}


}
