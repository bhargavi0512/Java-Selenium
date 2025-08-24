package Tests_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dependency_facebook {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void facebook() {
        driver.get("https://www.facebook.com/");

	}
	
	@Test(dependsOnMethods = { "facebook" })
    public void Login() {
		driver.findElement(By.id("email")).sendKeys("munnyreddy05@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Munny@12");
        driver.findElement(By.name("login")).click();


	}

}
