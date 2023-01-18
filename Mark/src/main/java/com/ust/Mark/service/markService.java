package com.ust.Mark.service;

import java.util.List;

import com.ust.Mark.model.markDao;
import com.ust.Mark.model.marks;

public class markService {

	public static void main(String[] args) {
		List<marks> students = new markDao().getMarks();

		System.out.println("Student with the highest Chemistry grade among all students:");

        int max = 0;
        String names = null;
        for (int i = 0; i < students.size(); i++) {
            if (max == students.get(i).getChemistry()) { 
                names += ", " + students.get(i).getName();
            } else if (max < students.get(i).getChemistry()) {
                       max = students.get(i).getChemistry(); 
                       names = students.get(i).getName(); 
            }
        }
        System.out.println(names);
        System.out.println();
        System.out.println("Student) with the highest Mathematics grade among all students:");

        max = 0;
        names = null;
        for (int i = 0; i < students.size(); i++) {
            if (max == students.get(i).getMathematics()) {
                names += ", " + students.get(i).getName();
            } else if (max < students.get(i).getMathematics()) {
                       max = students.get(i).getMathematics();
                       names = students.get(i).getName(); 
            }
        }
        System.out.println(names);
        System.out.println();
        System.out.println("Student with the highest Physics grade among all students:");


        max = 0;
        names = null;
        for (int i = 0; i < students.size(); i++) {
            if (max == students.get(i).getPhysics()) {
                names += ", " + students.get(i).getName();
            } else if (max < students.get(i).getPhysics()) {
                       max = students.get(i).getPhysics();
                       names = students.get(i).getName(); 
            }
        }
        System.out.println(names);
	}
}