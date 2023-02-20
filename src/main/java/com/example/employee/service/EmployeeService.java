package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRespository;

	public ResponseEntity<String> getAllEmployeeDetails(Employee employee) {
		 Employee employee1=new Employee();
		 employee1.setEmpId(employee.getEmpId());
		 employee1.setEmpName(employee.getEmpName());
		 employee1.setEmpSalary(employee.getEmpSalary());
		  employeeRespository.saveAndFlush(employee1);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	public List<Employee> getallemployee() {
		return employeeRespository.findAll() ;
	}

}
