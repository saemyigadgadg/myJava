package ch05과제.dao;

import ch05과제.domain.Employee;

public interface EmployeeDao {
	Employee selectEmployee(int employeeId);
}