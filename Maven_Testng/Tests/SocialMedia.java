package Tests;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.*;

public class SocialMedia {
	
	 WebDriver driver;
	    SoftAssert softAssert;

	    @BeforeClass
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	        softAssert = new SoftAssert();
	    }

	    @Test(priority = 0)
	    public void loginTest() throws InterruptedException, IOException {
	    	
	    	Properties prop = new Properties();
	        FileInputStream fis = new FileInputStream("C:\\Users\\bharg\\eclipse-workspace\\Java_Selenium\\JavaSelenium\\src\\personal.properties");
	        prop.load(fis);
	        String email = prop.getProperty("facebook.email");
	        String password = prop.getProperty("facebook.password");
	        
	       
	        WebElement emailField = driver.findElement(By.id("email"));
	        emailField.sendKeys(email);

	        WebElement passwordField = driver.findElement(By.id("pass"));
	        passwordField.sendKeys(password);

	        driver.findElement(By.name("login")).click();

	        Thread.sleep(5000); 
	        softAssert.assertTrue(driver.getCurrentUrl().contains("facebook"), "Login failed!");
	    }
	    
	    @Test(priority = 1)
	    public void createPost() throws InterruptedException {
	    	driver.findElement(By.xpath("//*[@id=\"mount_0_0_uu\"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[4]/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/a/div[1]/div/svg/g/image")).click();
	    	driver.findElement(By.xpath("//*[@id=\"mount_0_0_uu\"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/span[2]/span")).sendKeys("C:\\Users\\bharg\\OneDrive\\Pictures\\lord-shiva-minimalist-laptop-wallpaper-1080p.jpg");
	    	driver.findElement(By.xpath("//*[@id=\"mount_0_0_uu\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[2]/div/div/div")).click();
	    	Thread.sleep(2000);
	         }
	    @AfterClass
	    public void tearDown() {
	    	softAssert.assertAll();
	    	driver.quit();
	    }


}
