package com.my.spring.web.ch02.ex06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller("ch02/ex06")
@RequestMapping("ch02/ex06")
public class UserController {
	
	//쿠키값이 있으면 username에 값을 담는다. 
	@GetMapping("login")
	public String loginIn(@CookieValue(required=false) String username, @ModelAttribute("user") UserDto user) {
			user.setUsername("최한석");
		return "ch02/ex06/login";
	}
	/*
	 * <HttpServletResponse>
	 *  WAS는 클라이언트에게 응답을 보내기 위한 
	 *  HttpServletResponse 객체를 생성하여 servlet에게
	 *  전달한다. servlet은 해당 객체를 이용해서
	 *  content type, 응답코드, 응답 메세지 등을 
	 *  클라이언트에게 전달한다.
	 */
	@PostMapping("login")
	public String login(@ModelAttribute("user") UserDto user, String rememberMe,
			HttpSession session, HttpServletResponse response) {
		//세션이 유지되는 동안 저장되는 username, 즉 로그인이 된다.
		session.setAttribute("username", user.getUsername());
		
		//rememberMe check시, 쿠키가 저장된다.
		if(rememberMe != null && rememberMe.equals("on")) {
			Cookie cookie = new Cookie("username", user.getUsername());
			cookie.setMaxAge(5);
			response.addCookie(cookie);
		}
		return "ch02/ex06/logout";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:login";
	}
}
