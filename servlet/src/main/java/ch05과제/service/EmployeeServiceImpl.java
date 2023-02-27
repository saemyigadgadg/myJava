package ch05과제.service;

import ch05과제.dao.EmployeeDao;
import ch05과제.dao.EmployeeDaoImpl;
import ch05과제.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService {
private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		this.employeeDao = new EmployeeDaoImpl();
	}
	
	@Override
	public Employee getEmployee(int employeeId) {
		return employeeDao.selectEmployee(employeeId);
	}
}
