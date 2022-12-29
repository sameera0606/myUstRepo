package EmployeeSort;

import java.util.List;




public class sortService {

	public static void main(String[] args) {
		List<model> emp= new sortDao().getModels();
		
		for (int i=0;i<emp.size();i++) {
			for(int j=i+1;j<emp.size();j++) {
				if(emp.get(i).getId()>emp.get(j).getId()) {
					model temp= emp.get(i);
					emp.set(i, emp.get(j));
					emp.set(j, temp);
				}
			}
		}
		System.out.println(emp);		
}
	}