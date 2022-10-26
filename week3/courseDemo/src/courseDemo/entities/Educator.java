package courseDemo.entities;

public class Educator {
	
	private int id;
	private String educatorFirstName;
	private String educatorLastName;
	
	public Educator() {
		
	}
	
	public Educator(int id, String educatorFirstName, String educatorLastName) {
		this.id = id;
		this.educatorFirstName = educatorFirstName;
		this.educatorLastName = educatorLastName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEducatorFirstName() {
		return educatorFirstName;
	}


	public void setEducatorFirstName(String educatorFirstName) {
		this.educatorFirstName = educatorFirstName;
	}


	public String getEducatorLastName() {
		return educatorLastName;
	}


	public void setEducatorLastName(String educatorLastName) {
		this.educatorLastName = educatorLastName;
	}
	
	

}
