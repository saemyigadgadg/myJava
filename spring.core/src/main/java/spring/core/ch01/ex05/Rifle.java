package spring.core.ch01.ex05;

import org.springframework.stereotype.Component;

@Component//("rifleGun") //@안에 Bean의 id를 써줄 수 있다.
public class Rifle implements Gun {
	@Override
	public void fire() {
		System.out.println("소총 탕탕");
	}
}