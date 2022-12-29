package EmployeeSalary;

import java.util.List;

public class salaryPfService {
	
		public static void main(String[] args) {
			List<model> emp= new employeeDao().getModels();
			
			
			
			for(model e:emp) {
				if(0< e.getSalary() && 25000> e.getSalary()) {
					System.out.println(e.getId()+" "+e.getName()+" Actual salary : "+e.getSalary()
					+" "+ "PF Amount: " +e.getSalary()*5/100 +"  "+ "In hand salary :" + e.getSalary()*95/100);
				}
				
				else if (25000 <e.getSalary() && 25000> e.getSalary()) {
					System.out.println(e.getId()+" "+e.getName()+" Actual salary : "+e.getSalary()
					+ "PF Amount: " +e.getSalary()*7/100 + "In hand salary :" + e.getSalary()*93/100);
				}
					
				}
			}
			
			
		

		}




