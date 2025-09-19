package Practice;


import org.testng.Assert;
import org.testng.annotations.Test;


public class RetryAnalyzerPractice {
	int i=0;
	@Test(retryAnalyzer = GenericUtility.RetryAnalyzerImplementation.class)
	public void demo()
	{
		i++;
		System.out.println("hello");
		if(i<3)
			Assert.fail();
			

	}
	}
	


