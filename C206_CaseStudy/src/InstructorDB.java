import java.util.ArrayList;

public class InstructorDB {
	
	public static ArrayList<Instructor> instructorList = new ArrayList <Instructor>();
	
	public static void main(String[] args) {
		
		Instructor in1 = new Instructor("Shirley","shirleytan11@gmail.com", "19048222");
		Instructor in2 = new Instructor ("Glen","xianyang01@gmail.com","1111222");
		
		InstructorDB.addInstructor(in1);
		InstructorDB.addInstructor(in2);
	
		int option = 0;
		
		while (option != 5) {
			
			InstructorDB.menu();
			option = Helper.readInt("Enter option > ");
		
			if(option == 1) {
			
				InstructorDB.viewAllInstructor(instructorList);
			
			} else if (option == 2) {
				
				String instructorName = Helper.readString("Enter Instructor Name > ");
				String instructorEmail = Helper.readString("Enter Instructor Email > ");
				String instructorPassword = Helper.readString("Enter Instructor Password > ");
				
				Instructor newInstructor = new Instructor(instructorName, instructorEmail, instructorPassword);
				
				InstructorDB.addInstructor(newInstructor);
				System.out.println("Instructor added into system.");
			
			} else if (option == 3) {
				
				InstructorDB.viewAllInstructor(InstructorDB.instructorList);
				String instructorName = Helper.readString("Enter Instructor Name to delete: ");
				InstructorDB.delInstructor(instructorName);
				
				boolean exist = false;
				
				for (int i = 0; i < instructorList.size(); i++) {
					if (instructorName.contentEquals(instructorList.get(i).getInstructorName())) {
						instructorList.remove(i);
						System.out.println("Instructor deleted.");
						exist = true;
					}
				}
				if (exist == false) {
					System.out.println("No identified instructor.");
				}
				
			
			} else if (option == 4) {
				
				
			
				
			
			} else if (option == 5) {
			
				System.out.println("Good Bye!");
			}
		
		}
		
	} //end of main class
	
	private static void delInstructor(String instructorName) {
		// TODO Auto-generated method stub
		
	}

	public static void menu() {
		Helper.line(60,"=");
		System.out.println("INSTRUCTOR MENU");
		Helper.line(60,"=");
		System.out.println("1. View all instructors");
		System.out.println("2. Add instructor");
		System.out.println("3. Delete instructor");
		System.out.println("4. Update instrcutor");
		System.out.println("5. Quit");
	}
		
	public static void addInstructor(Instructor newInstructor) {
			
		instructorList.add(newInstructor);
	}
		
	public static void updateInstructor(Instructor instructor) {
		instructorList.set(0, instructor);
		
	}
	
	public static void delInstructor(Instructor in) {
		Helper.line(60, "-");
		System.out.println("Delete Instructor");
		Helper.line(60,"-");
		instructorList.remove(in);
		
	}
	
	public static void viewAllInstructor(ArrayList<Instructor> instructorList) {
		Helper.line(60, "-");
		System.out.println("VIEW ALL INSTRUCTORS");
		Helper.line(60,"-");
		
		String output = String.format("%-10s %-30s %-10s\n", "NAME","EMAIL","PASSWORD");
		for (int i =0; i<instructorList.size(); i++) {
			output += String.format("%-10s %-30s %-10s\n", instructorList.get(i).getInstructorName(),instructorList.get(i).getInstructorEmail(),instructorList.get(i).getInstructorPassword());
		
		}
		System.out.println(output);
	}
	
	public static void addInstructor(ArrayList<Instructor>instructorList) {
		Helper.line(60,"-");
		System.out.println("ADD INSTRUCTOR DETAILS");
		Helper.line(60,"-");
		
		String output = String.format("%-10s %-30s %-10s\n", "NAME","EMAIL","PASSWORD");
		for (int i =0; i<instructorList.size(); i++) {
			output += String.format("%-10s %-30s %-10s\n", instructorList.get(i).getInstructorName(),instructorList.get(i).getInstructorEmail(),instructorList.get(i).getInstructorPassword());
		
		}
		System.out.println(output);
	}
		
		
		
	}

 //end of instructorDB class
