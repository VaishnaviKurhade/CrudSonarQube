package com.acc.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.acc.SpringBootCrud.dao.EmployeeRepository;
import com.acc.SpringBootCrud.entity.Employee;

@Service
public class EmployeeService_Impl implements EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepo;

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employee = new ArrayList<>();
		employeeRepo.findAll().forEach(employee::add);
		return employee;
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeRepo.save(employee);
	}

	@Override
	public void updateEmployee(Integer id, Employee employee) {
		employeeRepo.save(employee);
	}

	@Override
	public void deleteById(Integer id, Employee employee) {
		employeeRepo.delete(employee);
	}

}
