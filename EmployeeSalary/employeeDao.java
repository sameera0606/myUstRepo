package EmployeeSalary;

import java.util.ArrayList;
import java.util.List;



public class employeeDao {

	
public List<model> getModels(){
		
		
		List<model> emp=new ArrayList<>();
		emp.add(new model(100,"sam",20000));
		emp.add(new model(100,"savina",30000));
		//emp.add(new model(100,"athira",40000));
		//emp.add(new model(100,"sameera",30000));
		
		
		return emp;
	}
}
