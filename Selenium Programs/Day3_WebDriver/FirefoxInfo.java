package Day3_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxInfo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bharg\\OneDrive\\Desktop\\Wipro(Java Selenium)\\geckodriver-v0.36.0-win64\\geckodriver.exe");

		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		
		System.out.println("Browser Name: "+ caps.getBrowserName());
		System.out.println("Browser Version: "+ caps.getBrowserVersion());
        System.out.println("Platform: "+ caps.getPlatformName());
        
        driver.quit();


	}

}
