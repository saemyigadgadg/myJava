package com.my.spring.web.ch03.ex02;

import lombok.Data;

@Data
public class User {
	private String username;
	private int age;
	private String faceFilename;  //얼굴사진을 파일명으로 바라본다.
}