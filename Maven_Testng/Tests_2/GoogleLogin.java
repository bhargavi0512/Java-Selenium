package Tests_2;	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class GoogleLogin {
		
	WebDriver driver;
		
		@BeforeClass
		public void setup() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		@Test
		public void login() {
			driver.get("https://www.google.com");
		    System.out.println("Title:" +driver.getTitle());
		    System.out.println("CurrentUrl:" +driver.getCurrentUrl());
			System.out.println("windowhandle:" +driver.getWindowHandle());
		}
		
		@AfterClass
		public void teardown() {
		driver.quit();
		}


}
