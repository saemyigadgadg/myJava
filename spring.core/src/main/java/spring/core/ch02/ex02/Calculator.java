package spring.core.ch02.ex02;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	public Result calc() {
		try {
			Thread.sleep((long)(Math.random() * 1000));
		} catch(Exception e) {}
		
		Result result = new Result();
		result.setResult(1);  //계산을 끝내면 1이 나오고
		
		return result;   //결과값이 리턴되며 계산이 끝난다.
	}
}