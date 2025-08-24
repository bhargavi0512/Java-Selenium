package Tests_4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Tests_3.RetryAnalyzer;
@Listeners(Tests_4.datalistener.class)
public class datap {
	
	
    @DataProvider(name = "numbers")
    public Object[][] getData() {
        return new Object[][] {
            {2, 3, 5},
            {5, 7, 12},
            {10, 20, 30}
        };
    }
 
    @Test(dataProvider = "numbers", retryAnalyzer=RetryAnalyzer.class)
    public void addNumbers(int a, int b, int exsum) {
        int sum = a + b;
        System.out.println("Checking: " + a + " + " + b + " = " + sum);
        Assert.assertEquals(sum, exsum, "Sum is not matching!");
    }
}
 
 
 
 
 
