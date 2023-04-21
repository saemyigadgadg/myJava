package com.my.spring.web.ch02.ex02;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
<<<<<<< HEAD
import lombok.Data;

@Data
=======
import lombok.Getter;

@Getter
>>>>>>> refs/remotes/origin/master
@AllArgsConstructor
public class User {
	private String username;
	private int age;
	private LocalDate regDate;
}
