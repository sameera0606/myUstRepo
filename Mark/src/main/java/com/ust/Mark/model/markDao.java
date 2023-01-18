package com.ust.Mark.model;

import java.util.ArrayList;
import java.util.List;



public class markDao {

	
	 //public static void main(String[] args) {
	public List<marks> getMarks(){

	        marks tom = new marks("Tom", 10, 26, 44);
	        marks jerry = new marks("Jerry", 29, 5, 18);
	        marks sam = new marks("Sam", 6, 9, 8);
	       

	        ArrayList<marks> students = new ArrayList<>();

	        students.add(tom);
	        students.add(jerry);
	        students.add(sam);
	       
	        
			return students;

	    }
	}



