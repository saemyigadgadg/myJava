package spring.core.ch01.ex06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) //여기에 쓸것이다.
@Retention(RetentionPolicy.RUNTIME)//annotation은 이때까지 사용할 거다.
public @interface NoComponent {

}

//annotation만들기