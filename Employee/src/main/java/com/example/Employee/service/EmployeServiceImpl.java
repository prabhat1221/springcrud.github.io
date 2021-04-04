package com.example.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.model.Employee;
import com.example.Employee.repository.EmployeeRepository;
@Service
public class EmployeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public void saveEmployee(Employee employe) {
		repo.save(employe);		
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		repo.deleteById(id);		
	}

}
