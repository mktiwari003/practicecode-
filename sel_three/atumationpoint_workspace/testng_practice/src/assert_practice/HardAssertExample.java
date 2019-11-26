package assert_practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

	@Test
	public void test1() {
		try {

			Assert.assertTrue(2 < 1);
			System.out.println("Assertion Failed in Test 1");

			Assert.assertFalse(1 > 0);
			System.out.println("Assertion Failed in Test 1");

			Assert.assertEquals("Sample", "Sample");
			System.out.println("Assertion Failed in Test 1");

		} catch (AssertionError ae) {
			ae.printStackTrace();
		}
	}

	@Test
	public void test2() {
		try {
			Assert.assertTrue(2 > 1);
			System.out.println("Assertion Failed in Test 2");
			Assert.assertFalse(1 < 0);
			System.out.println("Assertion Failed in Test 2");
			Assert.assertEquals("Sample", "Sample");
			System.out.println("Assertion Failed in Test 2");
		} catch (AssertionError ae) {
			ae.printStackTrace();
		}
	}

}
