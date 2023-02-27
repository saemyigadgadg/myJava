package ch05.domian;

import java.time.LocalDate;

public class Employee {
	private int employeeId;
	private String lastName;
	private LocalDate hireDate;
	
	@Override
	public String toString() {
		return employeeId + ", " + lastName + ", " + hireDate;
	}
}
