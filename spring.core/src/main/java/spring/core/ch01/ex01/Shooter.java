package spring.core.ch01.ex01;

public class Shooter {
	private Gun gun;
	
	public Shooter(Gun gun) {
		this.gun = gun;
	}
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void fire() {
		gun.fire();
	}
}

//help하면 export해서 주실거다. 그러면 import해서 사용하면 된다.