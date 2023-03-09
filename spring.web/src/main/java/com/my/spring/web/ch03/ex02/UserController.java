package com.my.spring.web.ch03.ex02;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;

//bean의 네임
@Controller("ch03.ex02")
@RequestMapping("ch03/ex02/user")
public class UserController {
	@Value("${attachPath}") private String attachPath;
	
	@GetMapping
	public String userIn() {
		return "ch03/ex02/userIn";
	}
	
	@PostMapping //Original = 클라이언트가 사용한 파일명 Dto에는 사진 파일이 들어있고 user에는 사진파일 명이 들어있다.
	public String userOut(UserDto userDto, HttpServletRequest request, User user) {
		String filename = userDto.getFace().getOriginalFilename();
		//userDto안에 있는 사진 파일을 filename으로 쓰겠다.
		saveFile(attachPath + "/" + filename, userDto.getFace());
		
		user.setFaceFilename(filename);
		return "ch03/ex02/userOut";
	}
	
	private void saveFile(String filename, MultipartFile file) {
		try {
			file.transferTo(new File(filename));
		} catch(IOException e) {}
	}
}