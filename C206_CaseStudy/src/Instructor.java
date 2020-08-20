
public class Instructor {
	

	private String instructorName;
	private String instructorEmail;
	private String instructorPassword;
	
	public Instructor(String instructorName, String instructorEmail, String instructorPassword) {
		this.instructorName = instructorName;
		this.instructorEmail = instructorEmail;
		this.instructorPassword = instructorPassword;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String getInstructorEmail() {
		return instructorEmail;
	}
	public void setInstructorEmail(String instructorEmail) {
		this.instructorEmail = instructorEmail;
	}
	public String getInstructorPassword() {
		return instructorPassword;
	}
	public void setInstructorPassword(String instructorPassword) {
		this.instructorPassword = instructorPassword;
	}
}

