package Tests_2;
import org.testng.annotations.*;


public class CommandLineDemo
{
 
	@Parameters({"browser", "url"})
    @Test
    public void testApp(String browser, String url) {
        System.out.println("Browser: " + browser);
        System.out.println("URL: " + url);
	
}
}