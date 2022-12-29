package EmployeeSalary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class salaryService {

	public static void main(String[] args) {
		List<model> emp= new employeeDao().getModels();
		
		Map<Integer,model> map = new HashMap<>();
		
		for(model e:emp) {
			if(map.containsKey(e.getSalary())) {
				model model = map.get(e.getSalary());
				
				map.put(e.getSalary(), new model(e.getId(),e.getName(),e.getSalary()+model.getSalary()));
			}
			
			else {
				map.put(e.getSalary(), new model(e.getId(),e.getName(),e.getSalary()));
			}
		}
		
		System.out.println();
	}

	}


