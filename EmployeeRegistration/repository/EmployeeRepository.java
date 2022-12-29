package com.ust.EmployeeRegistration.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.EmployeeRegistration.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

 

    Optional<Employee> findByEmpId(String empId);

 

    

 

}