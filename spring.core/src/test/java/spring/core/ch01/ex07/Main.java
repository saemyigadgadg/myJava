package spring.core.ch01.ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Lion lion = ctx.getBean(Lion.class);
		lion.shout();
		
		//container가 자신의 bean들을 정리하고 죽는다.
		//이 과정에서 lion bean이 죽는다.
		ctx.close();  
	}
}