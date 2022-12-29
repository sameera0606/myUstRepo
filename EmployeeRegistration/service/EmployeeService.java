package com.ust.EmployeeRegistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.EmployeeRegistration.model.Employee;
import com.ust.EmployeeRegistration.repository.EmployeeRepository;

@Service
public class EmployeeService {

 

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee emp) {
        return employeeRepository.save(emp);

    }
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

 

    public Employee getEmployeeById(int empId) {
        return employeeRepository.findById(empId).orElse(null);

    }

 

    public Employee updateEmployee(Employee emp) {
        Employee employee =new Employee();
        Optional<Employee> updateEmployee = employeeRepository.findByEmpId(emp.getEmpId());

 

        if(updateEmployee.isPresent()) {
            employee.setEmpId(emp.getEmpId());
            employee.setDomain(emp.getDomain());
            employee.setEmailId(emp.getEmailId());
            employee.setEmpName(emp.getEmpName());
            employee.setExperience(emp.getExperience());
            employee.setLocation(emp.getLocation());
        }

 

        else
            new Employee();

 

        return employeeRepository.save(employee);
    }

 

    public String deleteEmployeeById(int empId) {
        employeeRepository.deleteById(empId);
        return "Employee deleted";
    }

 

}