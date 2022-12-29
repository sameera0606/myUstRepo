package com.ust.EmployeeRegistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ust")
public class Employee {
	@Id
	@GeneratedValue
	private int id;

	private String empId;
	private String empName;
	private String location;
	private String domain;
	private String emailId;
	private int experience;

	public Employee() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Employee(int id, String empId, String empName, String location, String domain, String emailId,
			int experience) {
		// super();
		this.id = id;
		this.empId = empId;
		this.empName = empName;
		this.location = location;
		this.domain = domain;
		this.emailId = emailId;
		this.experience = experience;
	}

}
