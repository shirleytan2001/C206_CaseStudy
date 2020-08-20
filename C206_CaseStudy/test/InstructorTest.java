import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InstructorTest {
	
	private Instructor in1; 
	private Instructor in2; 

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
		
		//Test that Instructor arraylist is 2 
		InstructorDB.addInstructor(in1);
		InstructorDB.addInstructor(in2);
		assertEquals("Test that Instructor arraylist is 2", 2 , InstructorDB.instructorList.size());
		
		//when
		InstructorDB.instructorList.add(in1);
		InstructorDB.instructorList.add(in2);
		
		//then
		assertEquals(InstructorDB.instructorList.size(), 2);
		assertEquals(InstructorDB.instructorList.get(0), in1);
		assertEquals(InstructorDB.instructorList.get(1), in2);;
	}	
	@Test
	public void deleteInstructorTest() {
		
		//Test that the size of Instructor list is 0 after deleting a Instructor 
		assertEquals("Test that the size of Instructor list is 0 after deleting a Instructor" , 0 , InstructorDB.instructorList.size());
		
	}
		
	}



