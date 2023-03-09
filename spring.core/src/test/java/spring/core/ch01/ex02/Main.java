package spring.core.ch01.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml", Main.class);
		
		Shooter shooter1 = ctx.getBean("shooter1", Shooter.class);
		Shooter shooter2 = ctx.getBean("shooter2", Shooter.class);
		
		shooter1.fire();
		shooter2.fire();
	}
}

/*
 * ApplicationContext :
 * ClassPathXmlApplicationContext
 * 을 이용해 container를 만들어 준다. ctx안에 문서에 작성한 것을을 담고 있다.
 */

/*
 * 가져오는 객체는 Object이다. Shooter.class로 캐스팅 해서 달라는 의미이다. 
 */