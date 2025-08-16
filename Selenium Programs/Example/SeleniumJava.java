package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumJava {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://eaapp.somee.com");
		//driver.manage().window().fullscreen();
		
		//click the Login Link
		
		//By locator = By.id("loginLink"); //1.Identify the login link by ID
		
		By lnkLogin = By.linkText("Login");
		
		WebElement element=driver.findElement(lnkLogin); //2.Pass this locator to a webDriver which can help me to do the operation on UI
		
		element.click(); //3.Click operation 
		
		//Entering a userName
				
		WebElement txtUserNameElement = driver.findElement(By.name("UserName"));
		
		txtUserNameElement.sendKeys("adminpro");
		
		//Enter a PassWord
				
		driver.findElement(By.name("Password")).sendKeys("Mounica@12");
			
		//Log In
		
		driver.findElement(By.id("loginIn")).click();
		
		//Click Employee List 
		
		driver.findElement(By.linkText("Employee List")).click();
		
//		driver.findElement(By.linkText("Create")).click();
//		
//		driver.findElement(By.name("Name")).sendKeys("User");
	
		driver.findElement(By.linkText("Log off")).click();



				
		

	}

}
