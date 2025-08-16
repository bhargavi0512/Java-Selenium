package Day2_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\OneDrive\\Desktop\\Wipro(Java Selenium)\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          
          //driver.get("https://www.github.com");
                    
          driver.navigate().to("https://www.google.com");
          
          driver.manage().window().fullscreen();

          
          System.out.println("Page Title: " + driver.getTitle());
          
          System.out.println("URL: " + driver.getCurrentUrl());

          //System.out.println("Page Title: " + driver.getPageSource());
          
          for(var handle:driver.getWindowHandles()) {
        	          	  
			  System.out.println("Current Handle:" +handle);
          }

          
          driver.close();

	}

}
