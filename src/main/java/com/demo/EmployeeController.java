package com.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		return "Welcome to Spring Boot REST API";
	}

	@GetMapping("/employee")
	public Employee getEmployee() {
//		return "{id : 1}";
		return new Employee(5, "JumboJets", 5);
	}
	@GetMapping("/employees")
	public List getEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add( new Employee(5, "JumboJets", 55));
		employeeList.add( new Employee(5555, "JumboJets", 55));
//		return "{id : 1}";
		return employeeList;
	}
	
	
}