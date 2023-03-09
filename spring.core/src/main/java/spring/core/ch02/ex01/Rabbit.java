package spring.core.ch02.ex01;

public class Rabbit {
	private void sleep() {
		try {
			Thread.sleep((long)(Math.random() * 1000));
		} catch(Exception e) {}
	}
	
	public void start() {
		long start = System.currentTimeMillis();
		sleep();
		long end = System.currentTimeMillis();
		
		System.out.println("토끼: " + (end - start));
	}
}

/*
 * aspect 객체들의 공통 된 기능들을 의미한다.
 * aspect를 만든다는 것은 aspect를 담당하는 또다른 객체를 만든다는 것이다.
 */

/*
 * class단에서 결합 시키는 것은 우리가 서블릿에서 include redirect를 통해 배웠다.
 * 객체끼리의 결합은 include action을 통해 배웠다.
 * 스프링에서는 논리적으로 객체 단에서 결합을 할 것이다.
 */