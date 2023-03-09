package com.my.spring.web.ch02.ex02;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.ex02")
@RequestMapping("ch02/ex02/") //공통 url을 쓰면 각 Mapping에 해당 url이 앞쪽에 붙
public class UserController {
	@GetMapping("userIn")
	public String userIn() {
		return "ch02/ex02/userIn";
	}
	
	/*
	//request중에 파라미터 중에 username을 꺼내서 username에 넣을 것이다.
	@PostMapping("userOut")
	public String userOut(@RequestParam String username,
						  @RequestParam int age,
						  @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate regDate,
						  Model model) {
		model.addAttribute("user", new User(username, age, regDate));   //실제로는 해당 데이터를 서비스에 넘겨줄 것이다.
		
		return "ch02/ex02/userOut";
	}
	*/
	
	//@RequestParam은 기본값이라 쓰지 않아도 알아 먹는다.
	@PostMapping("userOut")  //실제 포폴 만들때는 앞쪽엔 업무명을 쓰고, 뒤에는 기능을 쓰면 된다 ex)user/add
	public String userOut(String username,
						  int age,
						  @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate regDate,
						  Model model) {
		model.addAttribute("user", new User(username, age, regDate));   //실제로는 해당 데이터를 서비스에 넘겨줄 것이다.
		
		return "ch02/ex02/userOut";
	}
}