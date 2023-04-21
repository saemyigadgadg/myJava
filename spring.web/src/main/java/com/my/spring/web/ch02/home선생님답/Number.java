package com.my.spring.web.ch02.home선생님답;

import lombok.Setter;

@Setter
public class Number {
	private double num;
	public double getNum() {
		return num + (int)(Math.random() * 10) / 10.0;
	}
}
