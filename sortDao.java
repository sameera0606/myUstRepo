package EmployeeSort;

import java.util.ArrayList;
import java.util.List;


public class sortDao {

	
public List<model> getModels(){
		
		
		List<model> emp=new ArrayList<>();
		emp.add(new model(10,"sam"));
		emp.add(new model(1,"savina"));
		emp.add(new model(18,"athira"));
		emp.add(new model(2,"sameera"));
		
		
		return emp;
	}
}
