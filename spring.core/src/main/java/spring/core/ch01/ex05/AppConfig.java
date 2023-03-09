package spring.core.ch01.ex05;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
여기 값으로 root패키지를 써주면 모든 class를 
componentScanning을 하게 된다.
 */
@ComponentScan("spring.core.ch01.ex05")  
public class AppConfig {
	
}
