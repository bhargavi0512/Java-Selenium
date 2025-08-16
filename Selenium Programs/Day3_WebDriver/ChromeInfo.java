package Day3_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeInfo {

	public static void main(String[] args) {
		
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\OneDrive\\Desktop\\Wipro(Java Selenium)\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		
		System.out.println("Browser Name: "+ caps.getBrowserName());
		System.out.println("Browser Version: "+ caps.getBrowserVersion());
        System.out.println("Platform: "+ caps.getPlatformName());
        
        driver.quit();


	}

}
