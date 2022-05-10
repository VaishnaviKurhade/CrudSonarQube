package com.acc.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acc.SpringBootCrud.entity.Employee;
import com.acc.SpringBootCrud.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
// for get all employee.. we can also add id to get employee by id
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> list = employeeService.getAllEmployee();
		if (list.isEmpty()) {
			return new ResponseEntity<List<Employee>>(list, HttpStatus.NO_CONTENT);

		} else {
			return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
		}
	}
// for save employee
	@PostMapping(value = "/employee")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
// for update employee
	@PutMapping(value = "/employee/{id}")
	public void updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
		employeeService.updateEmployee(id, employee);
	}
// for delete employee
	@DeleteMapping(value = "/employee/{id}")
	public void DeleteById(@PathVariable Integer id, @RequestBody Employee employee) {
		employeeService.deleteById(id, employee);
	}

}
