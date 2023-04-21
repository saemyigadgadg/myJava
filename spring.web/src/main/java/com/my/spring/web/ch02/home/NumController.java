package com.my.spring.web.ch02.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.home")
@RequestMapping("ch02/home")
public class NumController {
	@GetMapping("numIn")
	public String numInIn() {
		return "ch02/home/numIn";
	}
	
	@PostMapping("numIn")
	public String numIn(@ModelAttribute("number") double number, Model model) {	
		
		number += (int)(Math.random() * 10) / 10.0;
		model.addAttribute("number", number);
		return "ch02/home/numOut";  
	}
}

/*
 * 더 필요한 class나 jsp 있으면 추가 할 수 있다.
 * 
 * 과제: 폼에 자연수 하나를 입력한다.
 * 폼을 제출한다.
 * 입력값 <= x < 입력값 + 1인, x를 출력한다.
 * x는 실수이다.
 * x는 랜덤값이다.
 * x는 소수점 이하 한자리까지 표현한다.
 */