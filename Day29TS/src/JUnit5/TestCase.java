
package JUnit5;

import org.junit.jupiter.api.*;


public class TestCase {
	@Test
	public void test() {
		System.out.println("Java langauge");
	}
	@BeforeAll
	static void beforeAll() {
		System.out.println("Executed once before all test methods in this class");
	}
	@BeforeEach
	public void beforeEach() {
		System.out.println("Executed before each test method in this class");
	}
	 @DisplayName("Test method2 with condition")
	  @Test
	  void testMethod2() {
	    System.out.println("**--- Test method2 executed ---**");
	  }

	  @Test
	  @Disabled("implementation pending")
	  void testMethod3() {
		  System.out.println("**--- Test method3 executed ---**");
	  }

	  @AfterEach
	  void afterEach() {
	    System.out.println("**--- Executed after each test method in this class ---**");
	  }

	  @AfterAll
	  static void afterAll() {
	    System.out.println("**--- Executed once after all test methods in this class ---**");
	  }
	
}
