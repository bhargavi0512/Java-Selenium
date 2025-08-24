package Tests_3;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RetryWithDataProviderTest {
	
	@DataProvider(name="data")
	public Object[][] getData(){
		return new Object [][] {
			{"Value1"},
			{"Value2"},
			{"Value3"}
		};
	}
	
	@Test(dataProvider="data",retryAnalyzer=RetryAnalyzer.class)
	public void testWithData(String input) {
		Assert.assertTrue(input.contains("2"), "Only value2 shouls pass");
	}

}
