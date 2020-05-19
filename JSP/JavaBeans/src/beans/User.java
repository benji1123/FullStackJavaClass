package beans;

public class User{
	private String fName;
	private String lName;
	
	public User() {
		fName = "Jane";
		lName = "Doe";
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
}