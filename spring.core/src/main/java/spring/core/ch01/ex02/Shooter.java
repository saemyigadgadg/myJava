package spring.core.ch01.ex02;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.core.ch01.ex01.Gun;

@Setter					//롬북이 setter을 만든다.
@NoArgsConstructor      //롬북이 생산자를 추가시킨다.
@AllArgsConstructor		//롬분이 해당 dependency들을 만들게 한다.
public class Shooter {
	private String shooterName;
	private Gun gun;
	
	public void fire() {
		System.out.print(shooterName + ": ");
		gun.fire();
	}
}

//롬북을 이용해서 ex01의 Shooter.class를 더욱 깔끔하게 만들 수 있다.

//dependency 2개 추가하고 해당 dependency를 롬북이 만들게 한다.
/*
 * 우리는 지금 DI를 연습하고 있다.
 * DI: 의존성 주입, 외부에서 두 객체 간의 관계를 결정해주는 디자인 패턴이다.
 * 인터페이스를 사이에 둬서 클래스 레벨에서는 
 * 의존관계가 고정되지 않도록 하고 런타임 시에 
 * 관계를 동적으로 주입하여 유연성을 확보하고 결합도를 낮출 수 있게 해준다.
 */


/*
 * mybatis때에도 문서를 만들어서 기술해주었다.
 * resources 폴더에 문서를 기술해주자.
 */