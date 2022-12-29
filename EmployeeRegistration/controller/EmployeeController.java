package com.ust.EmployeeRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.EmployeeRegistration.model.Employee;
import com.ust.EmployeeRegistration.service.EmployeeService;


@RestController
@RequestMapping("api/employee")
public class EmployeeController {

	
	@Autowired
    private EmployeeService employeeService;

    @PostMapping("/register")
    public Employee addEmployees(@RequestBody Employee emp) {
        return employeeService.createEmployee(emp);

    }

    @GetMapping("/ust/Employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getEmployees();

    }

 

    @GetMapping("/Employee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);

    }

    @PutMapping("/update/Employee")
    public Employee updateEmployee(@RequestBody Employee emp) {
        return employeeService.updateEmployee(emp);

    }

    @DeleteMapping("/delete/Employee/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        return employeeService.deleteEmployeeById(id);

    }
}
