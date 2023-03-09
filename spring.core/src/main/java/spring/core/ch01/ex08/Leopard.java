package spring.core.ch01.ex08;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") //기본이 singleton인데 이처럼 명시해 줄 수 있다.
public class Leopard {

}