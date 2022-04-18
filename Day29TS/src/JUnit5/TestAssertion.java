package JUnit5;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.*;
import org.junit.jupiter.api.Assertions;

public class TestAssertion {
	@Test
	void testAssertEqual() {
		 assertEquals("ABC", "ABC");
		 assertEquals(20, 20, "optional assertion message");
		 assertEquals(2 + 2, 4);
	}

	@Test
	void testAssertFalse() {
		 assertFalse("FirstName".length() == 10);
		 assertFalse(10 > 20, "assertion message");
	}

	@Test
	void testAssertNull() {
	     String str1 = null;
		 String str2 = "abc";
		 assertNull(str1);
		 assertNotNull(str2);	
	}

	@Test
	void testAssertAll() {
		 String str1 = "abc";
		 String str2 = "pqr";
		 String str3 = "xyz";
		 assertAll("numbers",
		      () -> assertEquals(str1,"abc"),
			  () -> assertEquals(str2,"pqr"),
			  () -> assertEquals(str3,"xyz")
		 );
		 //uncomment below code and understand each assert execution
	     /*assertAll("numbers",
			  () -> assertEquals(str1,"abc"),
			  () -> assertEquals(str2,"pqr1"),
			  () -> assertEquals(str3,"xyz1")
		 );*/
	}

	@Test
	void testAssertTrue() {
		 Assertions.assertTrue("FirstName".startsWith("F"));
		
		 Throwable exception = null;
		assertEquals("Illegal Argument Exception occured", exception.getMessage());
	}

	private void assertTrue(int i) {
		// TODO Auto-generated method stub
		
	}
}
