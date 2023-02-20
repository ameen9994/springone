package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@PostMapping("/create")
	public ResponseEntity<String> getAllEmployeeDetails(Employee employee){
		return employeeService.getAllEmployeeDetails(employee);
	}
	@GetMapping("/allemployee")
    public List<Employee> getallemployee(){
		return employeeService.getallemployee();
    }
}
