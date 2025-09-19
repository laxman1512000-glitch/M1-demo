package Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {
	
	@Test
	public void strictLevelComparisonSoftAssertion()
	{
		String expectedValue="Selenium";
		String acutalValue="Selenium";
		SoftAssert s=new SoftAssert();
		s.assertEquals(acutalValue, expectedValue);
		s.assertFalse(acutalValue.equals(expectedValue));
		System.out.println("Soft assertion strict level validation sucessful");
		s.assertAll();		
	}
	@Test
	public void containsLevelComparisonSoftAssertion()
	{
		String expectdValue="ava";
		String acutalVaule="java";
		SoftAssert s=new SoftAssert();
		s.assertTrue(acutalVaule.contentEquals(expectdValue));
		System.out.println("soft assertion contains level validation sucessful");
		s.assertAll();

		
	}

}
