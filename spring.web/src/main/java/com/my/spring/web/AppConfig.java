package com.my.spring.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {
	@Value("${attachPath}")  /*attach 의 값을 가져온다*/
	private String attachPath;
	
	@Override    //모델 없이 view만 return 하고 싶을 때 사용한다.
	public void addViewControllers(ViewControllerRegistry registry) {
		//request url이 /면 viewName을 다음과 같이 하겠다.
		registry.addViewController("/").setViewName("ch01/main"); 
		registry.addViewController("ch02/ex03/user").setViewName("ch02/ex03/userIn"); 
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//클라이언트가 request를 보내면 web inf/res 로 바뀌고 톰켓이 갖고 있는
		//default 서블릿에 보낸다. 여러 리소스 중에서 해당 url을 갖고 있는 리소스를 찾는다.
		//해당 리소스를 response에 담아서 클라이언트에게 보낸다.
		//모델과 view를 짝지어줄 필요가 없기 때문에 default 서블릿이 작동 시킬 수 있다.
		// ** 별 두개는 n개가 오면 된다는 의미.
		registry.addResourceHandler("res/**").addResourceLocations("WEB-INF/res/"); 
		registry.addResourceHandler("attach/**").addResourceLocations("file:///" + attachPath + "/");
	}	
}