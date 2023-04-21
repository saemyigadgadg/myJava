package spring.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component     //spring container bean들 중에 spring beans라는 라이브러리가 처리한다.
public class Timer {
	/*
	 * public type이고 return 타입은 아무거나, 
	 * 다음 클래스 풀 네임 중 일부를 적어주고 해당 클래스에 있는 모든 메소드
	 * (..)//0개 이상 이라는 의미이다.
	 */
	@Pointcut("execution(public * spring.core.ch02.ex02..*(..))")
	private void myPointcut() {} //각각의 포인트는 해당 메소드 명으로 구분짓는다.
	
	//advice로 지정 5개 중 하나를 지정해준다.
	//독립적으로 clock이 실행될 이유가 없다. 토끼나 계산기와 함께 실행되어야 한다.
	@Around("myPointcut()")  //: JoinPoint 전 후로 실행하겠다.
	//클라이언트가 호출한 메소드의 시그니처 (리턴타입, 이름, 매개변수) 정보가 저장된 Signature 객체를 리턴
	public Object clock(ProceedingJoinPoint jp) throws Throwable {  //proceed를 쓰고 싶을때 ProceedingJoinPoint 쓴다.
		System.out.println(jp.getSignature());
		
		long start = System.currentTimeMillis();
		Result result = (Result)jp.proceed(); //calc메소드가 작동한다.
		long end = System.currentTimeMillis();
		
		System.out.println("경과시간: " + (end - start));
		
		result.setResult(result.getResult() + "(clock)");
		return result; //JoinPoint를 call한 client에게 return 한다.
	}
}
//@Aspect 평범한 bean이 아니고 aspect를 가지고 있어야한다.

//팀장만 고민하면 되는 부분 JoinPoint를 만드는 사람들은 그냥 만들면 된다.

/*
 * @Pointcut : JoinPoint의 pattern을 Timer에게 알려줘야한다.
 * clock은 해당 PointCut을 이용해서 JoinPoint를 찾는다.
 */