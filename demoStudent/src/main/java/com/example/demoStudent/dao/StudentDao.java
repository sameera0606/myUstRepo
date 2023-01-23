package com.example.demoStudent.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Retry.Topic;
import org.springframework.stereotype.Service;

import com.example.demoStudent.model.StudentModel;

@Service
public class StudentDao {

	/*List<StudentModel> student= new ArrayList<StudentModel>();

	public void createStudents() {
        student = List.of(
                new StudentModel(1, "sameera", "ece"),
                new StudentModel(2, "savina","cse"),
                new StudentModel(3, "ganesh","civil" )
        );
    } */
	 private List<StudentModel> stu = new ArrayList<>(Arrays.asList(

	            new StudentModel(1, "SAMEERA", "ECE"),
	            new StudentModel(2, "Savina", "cse"),
	            new StudentModel(3, "ganesh", "civil")
	            

	    ));
	 
	 public StudentModel getById(int id) {
		 for (int i = 0; i < stu.size(); i++)  {
			 if (stu.get(i).getId() == (id))  {
				 return stu.get(i);
	 }
		 }
			 return null;
	 	 
	 }

	public List<StudentModel> getAllStudents() {
		return stu;
	}

	
}
