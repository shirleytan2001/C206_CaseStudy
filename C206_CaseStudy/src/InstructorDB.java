import java.util.ArrayList;

public class InstructorDB {
	
	public static ArrayList<Instructor> instructorList = new ArrayList <Instructor>();

	public static void addInstructor(Instructor in) {
		
		instructorList.add(in);
	}

	public static void delInstructor(Instructor in) {
		
		instructorList.remove(in);
		
	}
	public static void updateInstructor(Instructor instructor) {
		instructorList.set(0, instructor);
	}
}
