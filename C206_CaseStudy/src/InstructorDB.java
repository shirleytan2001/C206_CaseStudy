import java.util.ArrayList;

public class InstructorDB {
	
	private static final int OPTION_UPDATEINSTRUCTORDETAILS = 4;
	private static final int OPTION_DELETEINSTRUCTOR = 3;
	private static final int OPTION_ADDNEWINSTRUCTOR = 2;
	private static final int OPTION_VIEWALLINSTRUCTOR = 1;
	private static final int OPTION_QUIT = 5;
	public static ArrayList<Instructor> instructorList = new ArrayList <Instructor>();
	
	public static void main(String[] args) {
		
		Instructor in1 = new Instructor("Shirley","shirleytan11@gmail.com", "19048222");
		Instructor in2 = new Instructor ("Glen","xianyang01@gmail.com","1111222");
		
		InstructorDB.addInstructor(in1);
		InstructorDB.addInstructor(in2);
	
		int option = 0;
		
		while (option != OPTION_QUIT) {
			
			InstructorDB.menu();
			option = Helper.readInt("Enter option > ");
		
			if(option == OPTION_VIEWALLINSTRUCTOR) {
				
				InstructorDB.viewAllInstructor(instructorList);
			
			} else if (option == OPTION_ADDNEWINSTRUCTOR) {
				
				String instructorName = Helper.readString("Enter Instructor Name > ");
				String instructorEmail = Helper.readString("Enter Instructor Email > ");
				String instructorPassword = Helper.readString("Enter Instructor Password > ");
				
				Instructor newInstructor = new Instructor(instructorName, instructorEmail, instructorPassword);
				
				InstructorDB.addInstructor(newInstructor);
				System.out.println("Instructor added into system.");
			
			} else if (option == OPTION_DELETEINSTRUCTOR) {
				
				InstructorDB.viewAllInstructor(InstructorDB.instructorList);
				String instructorName = Helper.readString("Enter Instructor Name to delete: ");
				
				boolean exist = false;
				
				for (int i = 0; i < instructorList.size(); i++) {
					
					String instructorName2 = instructorList.get(i).getInstructorName();
					if (instructorName.contentEquals(instructorName2)) {
						
						instructorList.remove(i);
						System.out.println("Instructor deleted.");
						exist = true;
					}
				}
				
				if (exist == false) {
					System.out.println("No identified instructor.");
				}
			
			} else if (option == OPTION_UPDATEINSTRUCTORDETAILS) {
				InstructorDB.menu2();
				option = Helper.readInt("Enter element that needed to be changed > ");
				
				if (option == 1) {
					String currentName = Helper.readString("Enter current name > ");
					
					String instructorName = instructorList.get(0).getInstructorName();
					if (currentName.equals(instructorName)) { 
						String newName = Helper.readString ("Enter new name > "); 
						instructorList.get(0).setInstructorName(newName);
						System.out.println("Name updated.");
				}
			}
				if (option == 2) {
					String currentEmail = Helper.readString("Enter current email > ");
					
					String instructorEmail = instructorList.get(0).getInstructorEmail();
					if (currentEmail.contentEquals(instructorEmail)) {
						String newEmail = Helper.readString("Enter new email > ");
						instructorList.get(0).setInstructorEmail(newEmail);
						System.out.println("Email updated.");
					}
				}
				if (option == 3) {
					String user =  Helper.readString("Enter username > ") ; 
					boolean isFound = false; 
					
					for (int i = 0; i <instructorList.size(); i++) { 
						
						String instructorName = instructorList.get(i).getInstructorName();
						if (user.equalsIgnoreCase(instructorName)) {
							String currentPassword = Helper.readString("Enter current password > ");
							
						String instructorPassword = instructorList.get(i).getInstructorPassword();
						if (currentPassword.equals(instructorPassword)) { 
							String newPassword = Helper.readString ("Enter new password > "); 
							instructorList.get(i).setInstructorPassword(newPassword);
							
						}else { 
							
							System.out.println("The password is incorect."); 
							
						}
						
						isFound = true; 
						break;				
						
						}
						
					}
					if (isFound == false) { 
						System.out.println("This  user does not exist."); 
					}
					if (option == 4) {
						System.out.println("Good Bye!");
					}
				}
			
			}  if (option == OPTION_QUIT) {
			
				System.out.println("Good Bye!");
			}
			
	}
}
		
//end of main class
	
	private static void menu2() {
		Helper.line(60,"=");
		System.out.println("DETAILS MENU");
		Helper.line(60,"=");
		System.out.println("1. Change name");
		System.out.println("2. Change email");
		System.out.println("3. Change password");
		System.out.println("4. Quit");
		
	}

	public static void menu() {
		Helper.line(60,"=");
		System.out.println("INSTRUCTOR MENU");
		Helper.line(60,"=");
		System.out.println("1. View all instructors");
		System.out.println("2. Add instructor");
		System.out.println("3. Delete instructor");
		System.out.println("4. Update instructor details");
		System.out.println("5. Quit");
	}
		
	public static void addInstructor(Instructor newInstructor) {
			
		instructorList.add(newInstructor);
	}
		
	public static void updateInstructor(Instructor instructor) {
		Helper.line(60, "-");
		System.out.println("Update Instructor password");
		Helper.line(60,"-");
		instructorList.set(0, instructor);
		
	}
	
	public static void delInstructor(Instructor in) {
		Helper.line(60, "-");
		System.out.println("DELETE INSTRUCTOR ");
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
