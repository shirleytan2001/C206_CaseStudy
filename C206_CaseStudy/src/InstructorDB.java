import java.util.ArrayList;

public class InstructorDB {
	
	public static ArrayList<Instructor> instructorList = new ArrayList <Instructor>();

	public static void addInstructor(Instructor in) {
		
		instructorList.add(in);
		
	}

}