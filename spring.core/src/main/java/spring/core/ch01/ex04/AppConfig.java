package spring.core.ch01.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spring.core.ch01.ex01.Gun;
import spring.core.ch01.ex02.Shooter;

@Configuration
@Import({Config1.class, Config2.class})  //AppConfig안에는 위 class에 메소드가 존재한다.
public class AppConfig {
	//메소드를 필요에 따라 추가 시킬 수 있다.
	@Autowired private Gun pistol;   
	@Autowired private Gun rifle;
	
	@Bean
	public Shooter shooter1() {
			return new Shooter("최한석", pistol);
	}
	
	@Bean
	public Shooter shooter2() {
		Shooter shooter = new Shooter();
		shooter.setShooterName("한아름");
		shooter.setGun(rifle);
		
		return shooter;
	}
}

/*
 * @Autowired : (DI) container 안에 있는 객체를 자동으로 연결시켜준다. 
 * 맴버변수 pistol하고 pistol이라는 bean을 연결시켜준다.
 */