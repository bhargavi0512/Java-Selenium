package Day3_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bharg\\OneDrive\\Desktop\\Wipro(Java Selenium)\\geckodriver-v0.36.0-win64\\geckodriver.exe");
		 
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.google.com");
        
        // Print title
      System.out.println("Page Title: " + driver.getTitle());
   // Close browser
       // driver.quit();
        
        driver.close();

	}

}
