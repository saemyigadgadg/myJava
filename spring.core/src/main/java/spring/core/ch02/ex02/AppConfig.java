package spring.core.ch02.ex02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring.core.ch02.ex02")
@EnableAspectJAutoProxy  //AOP에 관련된 Bean을 Container에 집어넣는다.
public class AppConfig {

}
