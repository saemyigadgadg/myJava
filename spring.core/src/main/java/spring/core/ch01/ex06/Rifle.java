package spring.core.ch01.ex06;

@NoComponent
public class Rifle {
	public void fire() {
		System.out.println("소총 탕탕★");
	}
}

/*
 * NoComponent가 Component안할 것이라는 것을 container에게 알려줘야 한다.
 * 곧 할 것이다.
 */