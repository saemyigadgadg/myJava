package spring.core.ch01.ex01;

public class Main {
	public static void main(String[] args) {
		Pistol pistol = new Pistol();
		Rifle rifle = new Rifle();
		
		Shooter shooter = new Shooter(pistol);
		shooter.fire();
		
		shooter.setGun(rifle);
		shooter.fire();
	}
}

/*지금 현제 사용하고 있는 것은 메이븐이다.*/