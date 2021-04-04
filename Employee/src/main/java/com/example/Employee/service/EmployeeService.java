package com.example.Employee.service;

import java.util.List;

import com.example.Employee.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employe);
	Employee getEmployeeById(Long id);
	void deleteEmployeeById(Long id);
}
