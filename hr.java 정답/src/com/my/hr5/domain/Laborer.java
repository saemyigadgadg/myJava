package com.my.hr5.domain;

import java.time.LocalDate;

public record Laborer(int laborerId, String laborerName, LocalDate hireDate) {
	@Override
	public String toString() {
		return String.format("%2d %-5s %d", laborerId, laborerName, hireDate);
	}
}
