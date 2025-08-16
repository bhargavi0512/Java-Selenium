package Day4_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.PageLoadStrategy;

public class Chrome_Page_Load {

	public static void main(String[] args) {
		
       //System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\OneDrive\\Desktop\\Wipro(Java Selenium)\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		
		//WebDriver driver = new ChromeDriver();
		
		ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	    WebDriver driver = new ChromeDriver(chromeOptions);
	    
	    driver.get("https://www.google.com");

	}

}
