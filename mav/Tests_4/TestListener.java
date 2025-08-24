package Tests_4;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Tests_4.ItestListenerClass.class)
public class TestListener {
	@Test
	public void TestMethod1(){
		System.out.println("i am in TestMethod1");
	}
	@Test
	public void TestMethod2(){
		System.out.println("i am in TestMethod2");
		Assert.assertTrue(false);
	}
	@Test(timeOut=1000)
	public void TestMethod3() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("i am in TestMethod3");
	}
	@Test(dependsOnMethods="TestMethod3")
	public void TestMethod4(){
		System.out.println("i am in TestMethod4");
	}
 
}