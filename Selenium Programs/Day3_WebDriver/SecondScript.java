package Day3_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SecondScript {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\OneDrive\\Desktop\\Wipro(Java Selenium)\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(2000);
        
        driver.get("https://www.youtube.com");
        Thread.sleep(2000);
        
        driver.get("https://www.github.com");
        Thread.sleep(2000);
        

      System.out.println("Page Title: " + driver.getTitle());
   // Close browser
       // driver.quit();
        
        driver.close();
	}

}
