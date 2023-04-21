package com.my.spring.web.ch02.ex04;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ch02/ex04")
public class CheckController {
   @GetMapping
   public String main() {
      return "ch02/ex04/main";
   }
   
   @GetMapping("choice")
   public String choice(int kind) {
      String view = "ch02/ex04/";
      
      switch(kind) {
      case 1: view += "radioIn"; break;
      case 2: view += "checkboxIn";
      }
      
      return view;
   }
   
   /*
   @PostMapping("radio")    //모델 네임이 필요해서 Model model을 쓴다.
   public String radio(String agree, Model model) {
	   model.addAttribute("agree", agree);
	   return "ch02/ex04/radioOut";
   }
   */
   
   @PostMapping("radio")
   public String radio(@ModelAttribute("agree") String agree) {
	   return "ch02/ex04/radioOut";
   }
   
   /*
    * @ModelAttribute()를 쓰려면, RequestParam이 없어야 한다.
    */
   
 //@RequestParam("fruit") 변수명과 request파람의 네임이 다를 경우 파라미터 name을 지정해 줄 수 있다.
   
   @PostMapping("checkbox")    
   public String checkbox(@RequestParam("fruit") ArrayList<String> fruits, Model model) {
	   
	   model.addAttribute("fruits", fruits);
	   return "ch02/ex04/checkboxOut";
   }
   //위의 작업들은 command 쓰는 순간 간편하게 해결 할 수 있다.
}