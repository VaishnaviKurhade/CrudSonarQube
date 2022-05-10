package com.acc.SpringBootCrud.service;

import java.util.List;

import com.acc.SpringBootCrud.entity.Employee;


public interface EmployeeService {

	public List<Employee> getAllEmployee();
	public void addEmployee(Employee employee);
	public void updateEmployee(Integer id, Employee employee);
	public void deleteById(Integer id, Employee employee);
	
}
