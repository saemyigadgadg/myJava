package com.my.spring.web.ch02.ex03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("ch02.ex03")
@RequestMapping("ch02/ex03/user") //각 핸들러에 붙이는 url은 앱상에서 유일해야 한다.
public class UserController {
	@GetMapping  //지워버리면 평험한 메소드가 된다.
	public String userIn() {
		return "ch02/ex03/userIn";
	}   //과제: 리퀘스트가 핸들러 받지 않고 바로 userIn.jsp를 화면에 띄워라
	
	//두가지 역할을 하는 객체를 command라고 부른다.
	//command를 만들기 위해서는 기본 생성자가 있어야 한다.
	
	@PostMapping  
	public String userOut(User user) {
		return "ch02/ex03/userOut";
	}
}

//핸들러 url을 구분할 때 url이름, 그리고 각 메소드를 본다.