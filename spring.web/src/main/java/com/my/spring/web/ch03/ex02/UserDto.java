package com.my.spring.web.ch03.ex02;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class UserDto {
	private String username;
	private int age;
	//service oracle 까지 파일 자체를 줄 필요는 없다.
	//oracle 에게는 파일 명을 준다.
	private MultipartFile face;   //얼굴사진을 파일 자체로 바라본다.
}