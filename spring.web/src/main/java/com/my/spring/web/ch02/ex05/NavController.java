package com.my.spring.web.ch02.ex05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/ex05")
public class NavController {
	@GetMapping("forward")
	public String forward() {
		return "forward:target";
	}
	
	@GetMapping("target")
	public String target() {
		return "ch02/ex05/target";
	}
	
	@GetMapping("redirect")
	public String redirect() {
		return "redirect:target";
	}
	
	//과제: 네이버로 연결하라.
	@GetMapping("naver")
	public String naver() {
		return "redirect:http://www.naver.com/";
	}
}

/*
 * <클라이언트로부터 들어온 요청을 다른 곳으로 넘기는 방안 2가지>
 * 
 * [redirect]
 * 서버에 요청이 들어오면 클라이언트로 HTTP Status Cod 302를 Location header에
 * 이동할 URL로 함께 전송한다. 웹 브라우저에서는 Location 값을 보고 다시 요청한다.
 * [forward]
 * 서버에 요청이 들어온 뒤 클라이언트로 값을 바로 내려주지 않고 서버에서 
 * 원하는 URL로 포워딩 시킨다. 포워딩 된 URL에서 response를 한다.
 */