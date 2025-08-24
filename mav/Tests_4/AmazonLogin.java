package Tests_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class AmazonLogin {
	 private static final Logger log = LogManager.getLogger(AmazonLogin.class);
	    WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        log.info("Launching Chrome browser");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        log.info("Navigating to Amazon");
	        driver.get("https://www.amazon.in/");
	    }

	    @Test
	    public void loginTest() {
	        try {
	            log.info("Clicking on Sign in button");
	            driver.findElement(By.id("nav-link-accountList")).click();

	            log.debug("Entering email/phone");
	            WebElement email = driver.findElement(By.id("ap_email_login"));
	            email.sendKeys("9110375200");  
	            driver.findElement(By.id("continue")).click();
	            
	            log.debug("Entering password");
	            WebElement password = driver.findElement(By.id("ap_password"));
	            password.sendKeys("Munny@12");      
	            driver.findElement(By.id("signInSubmit")).click();

	           log.info("Login attempted successfully");
	        } catch (Exception e) {
	            log.error("Login failed! Error: " + e.getMessage());
	        }
	    }

	    @AfterClass
	    public void tearDown() {
	        log.info("Closing browser");
	        driver.quit();
	    }
}