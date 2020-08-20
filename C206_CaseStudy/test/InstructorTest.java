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
		
		//Test that the size of category list is 1 after adding a category
		InstructorDB.addInstructor(in1);
		assertEquals("Test that the size of category list is 1 after adding a category", 1, InstructorDB.instructorList.size());
		
		//Test that the first element in instructor list is the same as the Instructor object added.
		assertSame("Test that the first element in instructor list is the same as the Instructor object added.", in1, InstructorDB.instructorList.get(0));
	}
	@Test
	public void ViewAllInstructorTest() {
		
		//Test if the list is not null but empty
		assertNotNull("Test if the list is not null but empty", InstructorDB.instructorList);
		
		//Test if the of Instructor viewed from the InstructorDB is empty 
		
		
	}


	}

