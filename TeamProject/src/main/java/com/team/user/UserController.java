package com.team.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/login")
public class UserController {
	
	@Autowired
	UserServiceImpl service;
	
	@RequestMapping(value = "/adduser", method = RequestMethod.GET)
	public String adduser() {
		return "adduserform";
	}
	@RequestMapping(value = "/adduserok", method = RequestMethod.POST)
	public String addPostOK(UserVO vo) {
		if(service.insertUser(vo) == 0) {
			System.out.println("데이터 추가 실패");
		}
		else
			System.out.println("데이터 추가 성공!!!");
		return "redirect:list";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(String t, Model model) {
		return "login";
	}
	
	@RequestMapping(value="/loginOk", method=RequestMethod.POST)
	public String loginCheck(HttpSession session, UserVO vo) {
		String returnURL = "";
		if(session.getAttribute("login")!=null) {
			session.removeAttribute("login");
		}
		
		UserVO loginvo = service.getUser(vo);
		if(loginvo != null) {
			System.out.println("로그인 성공!");
			session.setAttribute("login", loginvo);
			returnURL = "redirect:/home";
		}
		else {
			System.out.println("로그인 실패!");
			returnURL = "redirect:/login/login";
		}
		return returnURL;
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login/login";
	}

}
