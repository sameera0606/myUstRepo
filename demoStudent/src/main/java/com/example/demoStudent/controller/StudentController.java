package com.example.demoStudent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoStudent.dao.StudentDao;
import com.example.demoStudent.model.StudentModel;
@RequestMapping("/get")
@RestController
public class StudentController {

	@Autowired
	private StudentDao dao ;
	
	
	
	@GetMapping("/all")
	public List<StudentModel> allStudents() {
		 return dao.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public StudentModel getStudent(@PathVariable int id){
		return dao.getById(id);
		
	}
}
