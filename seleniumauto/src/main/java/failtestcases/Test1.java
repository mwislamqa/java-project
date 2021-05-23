package failtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(retryAnalyzer = MyRetry.class)
	public void gh() {
		System.out.println("gh ");
		Assert.assertTrue(0>1);
		
	}

}
