package panCardValidation;

import java.util.ArrayList;
import java.util.List;



public class panDao {

	public List<model> getModels(){
		
		
		List<model> emp=new ArrayList<>();
		emp.add(new model("sam","12345JUOEY"));
		emp.add(new model("savina","1234567890"));
		emp.add(new model("sam","12342VVOEY"));
		return emp;
}
}