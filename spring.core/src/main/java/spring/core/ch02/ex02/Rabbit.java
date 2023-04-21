package spring.core.ch02.ex02;

import org.springframework.stereotype.Component;

@Component
public class Rabbit {
	public Result sleep() {
		try {
			Thread.sleep((long)(Math.random() * 1000));
		} catch(Exception e) {}
		
		Result result = new Result();
		result.setResult("zzz");
		
		return result;
	}
}


//@Component를 통해서 bean으로 생성이 되어 container에 들어간다.