package spring.core.ch02.ex03;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {
	@Before("execution(* spring..*(int))") //특정 메소드를 지칭
	public void clockStart(JoinPoint jp) {
		System.out.println(jp.toShortString());
		System.out.println("시작 시각: "  + LocalDateTime.now());
	}
	
	@After("within(spring..Calculator)") //특정 class에 있는 모든 메소드를 지칭
	public void clockEnd(JoinPoint jp) {
		System.out.println(jp.toShortString());
		System.out.println("종료 시각: " + LocalDateTime.now());
	}
	
	@AfterReturning(pointcut="bean(calc*)", returning="result") //calc로 시작하는 bean에 있는 메소드이다.
	public void printResult(JoinPoint jp, int result) {	//조인포인트가 return한 값이 result에 담긴다.
		System.out.println(jp.toShortString() + ": " + result);
	}
	//AfterThoriwing이 포트폴리오 만들때 적합하다.
	
}

//많은 경우 point cut은 일회용이다. 이 경우 이름을 굳이 붙일 필요 없다.