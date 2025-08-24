package Tests_4;


import org.testng.annotations.Test;
 
public class Visualizer {
	@Test
	public void Method1() {
		System.out.println("Running Method 1");
	}
    @Test(dependsOnMethods="Method1")
    public void Method2() {
    	System.out.println("Running Method 2");
    }
 
}
 
 
 

 
 

 