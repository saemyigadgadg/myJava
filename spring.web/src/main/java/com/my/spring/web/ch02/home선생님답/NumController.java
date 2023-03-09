package com.my.spring.web.ch02.home선생님답;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.home선생님답")
@RequestMapping("ch02/home선생님답")
public class NumController {
	@GetMapping("numIn")
	public String numIn() {
		return "ch02/home선생님답/numIn";
	}
	
	@GetMapping("numOut")
	public String numOut(Number num) {
		return "ch02/home선생님답/numOut";
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