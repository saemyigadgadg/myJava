package com.my.spring.web.ch02.ex03;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
	private String username;
	private int age;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate regDate;
}

/*
 * int가 String 으로 자동 변환이 잘 된다.
*/
