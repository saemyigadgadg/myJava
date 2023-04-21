package spring.core.ch01.ex06;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//내가 만든 annotation을 container에게 알려줘보자. 
@ComponentScan(basePackages="spring.core.ch01.ex06",
excludeFilters = @Filter(type=FilterType.ANNOTATION,
						classes=(NoComponent.class)))
public class AppConfig {

}


