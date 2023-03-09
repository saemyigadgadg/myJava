package com.my.spring.web.ch02.ex01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data    //class에 get set을 만들어 준다.
@NoArgsConstructor 
@AllArgsConstructor
public class User {
	private String username;
	private int age;
}

/*
 * <@Getter @Setter>
 * 특정 필드에 해당 어노테이션을 붙여주면 자동으로 get(접근자),set(설정자) 메소드를
 * 사용할 수 있게 된다.
 * <@NoArgsConstructor>
 * 파라미터가 없는 기본 생성자를 생성한다.
 * <@AllArgsConstructor>
 * 모든 필드 값을 파라미터로 받는 생성자를 만든다.
 */