package ch05과제.dao;

import ch05과제.config.Configuration;
import ch05과제.dao.map.EmployeeMap;
import ch05과제.domain.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private EmployeeMap employeeMap;
	
	public EmployeeDaoImpl() {
		this.employeeMap = Configuration.getMapper(EmployeeMap.class);
	}
	
	@Override
	public Employee selectEmployee(int employeeId) {
		return employeeMap.selectEmployee(employeeId);
	}
}