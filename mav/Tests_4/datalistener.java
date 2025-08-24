package Tests_4;

import org.testng.IDataProviderListener;
import org.testng.IDataProviderMethod;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
 
public class datalistener implements IDataProviderListener {
 
    @Override
    public void beforeDataProviderExecution(IDataProviderMethod dataProviderMethod, ITestNGMethod method, ITestContext iTestContext) {
    	 log("Commencing", dataProviderMethod, method);
    	System.out.println("before");
        }
 
    private void log(String string, IDataProviderMethod dataProviderMethod, ITestNGMethod method) {
		// TODO Auto-generated method stub
		
	}
 
	@Override
    public void afterDataProviderExecution(IDataProviderMethod dataProviderMethod, ITestNGMethod method, ITestContext iTestContext) {
        System.out.println("after");
       log("Completed", dataProviderMethod, method);
    }
}
 