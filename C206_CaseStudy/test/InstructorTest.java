import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InstructorTest {
	
	private Instructor in1; 
	private Instructor in2;
	private Instructor in3; 

	@Before
	public void setUp() throws Exception {
		in1 = new Instructor("Shirley","shirleytan11@gmail.com", "19048222");
		in2 = new Instructor ("Glen","xianyang01@gmail.com","1111222");
		
	}

	@After
	public void tearDown() throws Exception {
		in1 = null;
		in2 = null;
		InstructorDB.instructorList.clear();
	}

	@Test
	public void test() {
		
		//Test that instructor list is not null
		assertNotNull("Test that instructor list is not null",InstructorDB.instructorList);
		
		//Test that the instructor list size is 0 before adding any instructors
		assertEquals("Test that the instructor list size is 0 before adding any instructors",0 ,InstructorDB.instructorList.size());
		
		//Test that the size of instructor list is 1 after adding a instructor
		InstructorDB.addInstructor(in1);
		assertEquals("Test that the size of instructor list is 1 after adding a instructor", 1, InstructorDB.instructorList.size());
		
		//Test that the first element in instructor list is the same as the Instructor object added.
		assertSame("Test that the first element in instructor list is the same as the Instructor object added.", in1, InstructorDB.instructorList.get(0));
	}
	@Test
	public void viewAllInstructorTest() {
		
		//Test if the list is not null but empty
		assertNotNull("Test if the list is not null but empty", InstructorDB.instructorList);
		
		//Test if the list of Instructor list is empty
		assertEquals("Test if the Instructot list is empty", 0 , InstructorDB.instructorList.size());
		
		//Test that Instructor list is viewable 
		InstructorDB.addInstructor(in1);
		InstructorDB.addInstructor(in2);
		assertEquals("Test that Instructor list is 2", 2 , InstructorDB.instructorList.size());
		
		//Test that the first element in instructor  list is the same as the Instructor object added
		assertSame("Test that the first element in instructor list is the same as the Instructor object added", in1, InstructorDB.instructorList.get(0));
		
	}	
	@Test
	public void deleteInstructorTest() {
		
		//Test if the instructor list is empty 
		assertEquals("Test that if the instructor list is empty" , 0 , InstructorDB.instructorList.size());
		
		//Test that instructor list is not null
		assertNotNull("Test that instructor list is not null", InstructorDB.instructorList);
		
		//Test that instructor list size is 1 after deleting an instructor
		InstructorDB.delInstructor(in1);
		assertEquals("Test that instructor list size is 1 after deleting an instructor", 0, InstructorDB.instructorList.size());
		
	}
	@Test
	public void updateInstructorTest() {
		//add instructor into list
		InstructorDB.addInstructor(in1);
		InstructorDB.addInstructor(in2);
		in3 = new Instructor ("Lucas", "lucas123456@gmail.com","123456");
		InstructorDB.updateInstructor(in3);
		assertSame(in3,InstructorDB.instructorList.get(0));
				
		//Test that instructor list is not null
		assertNotNull("Test that instructor list is not null", InstructorDB.instructorList);
		
	}
	
}



