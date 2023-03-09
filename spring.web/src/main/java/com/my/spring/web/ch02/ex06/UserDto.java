package com.my.spring.web.ch02.ex06;

import lombok.Data;

@Data
public class UserDto {
	private String username;
	private String password;
}

/*
 * <DTO란?>
 * DTO(Data Transfer Object)는 계층 간 데이터 교환을 하기 위해서
 * 사용하는 객체로 로직을 가지지 않는 순수한 데이터 객체
 * (getter & setter만 가진 클래스)이다.
 * 
 * 유저가 브라우저에 데이터를 입력하면 form에 있는 데이터를
 * DTO에 넣어 전송한다. 해당 DTO를 서버가 받고 DAO를 이용해서
 * 데이터베이스에 데이터를 집어넣는다.
 */