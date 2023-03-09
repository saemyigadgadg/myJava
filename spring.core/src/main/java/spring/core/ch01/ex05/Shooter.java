package spring.core.ch01.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	@Autowired @Nullable private Gun pistol;
	@Autowired @Nullable private Gun rifle;
	
	public void fire() {
		try {
			pistol.fire();
			rifle.fire();
		} catch(NullPointerException e) {}
	}
}

/*
 * 지금은 Gun type bean이 2개여서 변수명이 같은 것을 찾아서 DI를 해주지만
 * 실전에서는 싱글톤으로 작업하기 때문에 변수명이 달라도 괜찮다. 
 */

/*
 * ex05의 방법은 실전에서 유용하게 쓰일 것이다.
 * 다음은 몇가지 예외상황이다.
 * (1)
 * Pistol과 Rifle의 Component를 주석 처리하면 오류가 발생한다.
 * 해당 bean을 찾을 수 없게 된다. 
 * pistol이라는 field가 있는데, 거기에 적합한 dependency를 찾을 수 
 * 없다고 나온다. autowire할 수 있는 후보자 최소 하나가 있어야 한다.
 * 
 * (2)
 * 	위의 상황에서 @Nullable을 사용함으로써 
 *  Autowire할 수 없을 때 발생하는 에러는 사라졌다.
 *  그러나 NullpointEXCETION이 발생한다. SHOOTER에 FIRE()메소드에서 
 *  에러가 뜬 것이다. 
 *  
 *  과제: NULL값이어도 ERROR가 뜨지 않게 해보자.
 *  
 *  (3)
 *  이번에는 Component를 전부 살리고 id값을 주석 처리했다.
 *  bean이 2rork 발견됐다. pistol은 문제가 발생하지 않았으나,
 *  rifleGun Id를 가진 bean을 찾는데 보이지 않는다. 2차 조건으로는
 * 만족하는 bean을 못 찾으니까 Gun 을 조건으로 찾는다.
 * 찾아지는 것은 pistol, rifle만 발견된다.
 * 
 * (4)anotaion을 직접 만들어서 사용 할 수도 있다.
 * 하지만 아마 실전에서는 쓰지는 않을 것이다.
 */