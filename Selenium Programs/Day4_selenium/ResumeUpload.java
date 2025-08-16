package Day4_selenium;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ResumeUpload {

	public static void main(String[] args)
			throws InterruptedException 
	{
         //System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\OneDrive\\Desktop\\Wipro(Java Selenium)\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();	        
	            driver.get("https://login.naukri.com/nLogin/Login.php");

	            driver.findElement(By.id("usernameField")).sendKeys("bhargaviprasanna0512@gmail.com");
	            driver.findElement(By.id("passwordField")).sendKeys("Bhargavi@12");
	            driver.findElement(By.xpath("//button[@type='submit']")).click();	            
	            Thread.sleep(5000);
	            
	            driver.get("https://www.naukri.com/mnjuser/profile");	                       
	            Thread.sleep(5000);	  
	            
	            File resumeFile = new File("C:\\Users\\bharg\\OneDrive\\Documents\\Bhargavi Prasanna CV.pdf");   
	            WebElement fileInput = driver.findElement(By.id("attachCV")); 
	            
	            fileInput.sendKeys(resumeFile.getAbsolutePath());
	            Thread.sleep(5000);  
	            
	            System.out.println("Uploaded successfully");
	            
	            driver.quit();
	  
	}
}

