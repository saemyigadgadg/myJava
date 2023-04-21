package spring.core.ch02.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.ch02.ex04.AppConfig;
import spring.core.ch02.ex04.Calculator;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Calculator calculator = ctx.getBean(Calculator.class);
		
		calculator.add();	
		calculator.minus();	
		calculator.divide();	
	}
}
