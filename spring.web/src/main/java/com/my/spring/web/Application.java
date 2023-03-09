package com.my.spring.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

/*
 * 스프링부트는 main 메소드가 선언된 클래스를 기준으로 실행됩니다.
 * @SpringBootApplication 어노테이션은 
 * 스프링 부트의 가장 기본적인 설정을 선언해 줍니다.
 * 
 * Application.class를 해주면 com.my.spring.web; 즉, 루트 패키지를 알 수 있다.
*/