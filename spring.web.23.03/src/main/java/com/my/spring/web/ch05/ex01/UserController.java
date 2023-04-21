package com.my.spring.web.ch05.ex01;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.my.spring.web.ch05.domain.User;

@RestController("ch05.ex01")
@RequestMapping("ch05/ex01")
public class UserController {
	@GetMapping("main")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("ch05/ex01/main");
		return mv;
	}
	
	@GetMapping("get")
	public User get(User user) {
		return user;
	}
	
	@PostMapping("post")
	public User post(@RequestBody User user) {
		return user;
	}
<<<<<<< HEAD
	
	@PutMapping("put")
	public User put(@RequestBody User user) {
		return user;
	}
	
=======
	//@PutMapping : 덮어쓰기 (통째로 변경)
	@PutMapping("put")
	public User put(@RequestBody User user) {
		return user;
	}
	
	//@PatchMapping : 일부를 수정하다
>>>>>>> refs/remotes/origin/master
	@PatchMapping("patch")
	public User patch(@RequestBody User user) {
		return user;
	}
	
	@DeleteMapping("delete")
	public User delete(@RequestBody User user) {
		return user;
	}
}
