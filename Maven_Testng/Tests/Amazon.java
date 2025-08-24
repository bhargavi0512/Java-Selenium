package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class Amazon {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	
	@Test(priority = 0)
	public void loginAmazon() throws InterruptedException, IOException {
		
		Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\bharg\\eclipse-workspace\\Java_Selenium\\JavaSelenium\\src\\personal.properties");
        props.load(fis);
        
            
        String phonenumber = props.getProperty("amazon.phonenumber");
        String password = props.getProperty("amazon.password");
		driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("ap_email_login")).sendKeys(phonenumber);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(1000);

	}
	@Test(priority = 1)
	
	public void addToCart() throws InterruptedException {
		List<String> products = new ArrayList<>();
		  products.add("Exo Dishwash Bar");
		  products.add("Soap");
		  products.add("Tooth paste");
		  		  
		  for (String prod : products) {
		  
		  WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		  searchBox.clear();
		  searchBox.sendKeys(prod);
		  driver.findElement(By.id("nav-search-submit-button")).click();
		  Thread.sleep(3000);
		  		  
		  WebElement addToCartBtn = driver.findElement(By.cssSelector("#a-autoid-3-announce"));
		  addToCartBtn.click();
		  Thread.sleep(3000);
		  }
		  
	  }
	
	
	@AfterClass
	public void quit() {
		driver.quit();
	}

}
