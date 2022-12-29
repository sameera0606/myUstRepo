package panCardValidation;

import java.util.List;

import Employee.EmployeeDao;


public class panService {

	public static void main(String[] args) {
		
		List<model> lists=new panDao().getModels();
	}
		
public static void getModels(String lists) {
	
	if(lists.matches("[A-Z] {5} [0-9] {4} [A-Z] {1}")) {
		
		System.out.println("valid");
	}
	else
		System.out.println("invalid");

	}

}
