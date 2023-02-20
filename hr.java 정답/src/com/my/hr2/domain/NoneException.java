package com.my.hr2.domain;

public class NoneException extends RuntimeException {
	public NoneException(String msg) {
		super(msg);
	}
}
//아무런 노동자 데이터가 없을 때 활용하기 위해 만든 클래스이다.