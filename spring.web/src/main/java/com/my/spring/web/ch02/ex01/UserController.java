package com.my.spring.web.ch02.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {   //controller m과 v를 짝지어 준다.
	//그릇을 만든다.
	//context path /뒤에 올 것을 적어주면 된다. localHost/11 이라고 
	//request를 보내면 해당 handler에게 request를 던진다.
	//핸들러 매핑에 핸들러 이름과 url을 등록해 주어야 한다. 그제서야 핸들러가 된다.
	//핸들러 자체는 벨류가 되고 url은 키가 된다. url은 유일해야한다.
	 //request메핑은 get이고 url이 11이다.
	@GetMapping("11") 
	public ModelAndView handler11(ModelAndView mv) {
		mv.addObject("user", new User("최한석", 11)); //model  user는 attributeName으로 사용된다.
		mv.setViewName("ch02/ex01/user"); //view
		
		return mv;
	}
	
	@GetMapping("21")
	public String handler21(Model model) {
		model.addAttribute("user", new User("한아름",21));
		//viewName을 리턴하지만 컨테이너가 알아서 모델도 같이 dispatcher에게 보내준다.
		return "ch02/ex01/user"; 
	}	
	
	@GetMapping("22")
	public String handler22() {
		return "ch02/ex01/user";
	}
	
	@GetMapping("ch02/ex01/31")
	public void handler31(User user) {
		user.setUsername("양승일");   //실제로는 서비스 단에서 끝날 일이다.
		user.setAge(31);
	}
	
	@GetMapping("ch02/ex01/32")
	public void handler32(@ModelAttribute("man") User user) {
		user.setUsername("서준환");
		user.setAge(32);
	}
	
	@GetMapping("ch02/ex01/41")
	public User handler41(User user) {
		user.setUsername("김가람");
		user.setAge(21);
		
		return user;
	}
	
	@GetMapping("ch02/ex01/42")
	@ModelAttribute("man")
	public User handler42(User user) {
		user.setUsername("박건우");
		user.setAge(41);
		
		return user;
	}
}

/*
 *2개의 핸들러가 하나의 view를 가진다.
*/

/*
 * hr 때에는 Controller service와 연결된다.
 * @GetMapping request method get
 * @PostMapping request method post
 */