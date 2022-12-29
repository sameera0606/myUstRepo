package panCardValidation;

public class model {

	public String name;
	public String panNumber;
	
	public model(String name, String panNumber) {
		super();
		this.name = name;
		this.panNumber = panNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	
}
