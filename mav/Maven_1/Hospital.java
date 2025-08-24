package Maven_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Hospital {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	        String phone = "9110375200";
 
			WebDriverManager.chromedriver().setup();

	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
 
	      
	        driver.get("https://www.fortishealthcare.com/doctors?location=all");
	        driver.findElement(By.id("locations")).sendKeys("Gurgaon");
	        driver.findElement(By.xpath("//*[@id=\"block-fortisbottomnavigationblock\"]/nav/div/ul/li[2]/a")).click();
	        Thread.sleep(2000);
	        
	        
	        driver.findElement(By.xpath("//*[@id=\"block-fortis-content\"]/div/div/div/ul/li[1]/div[1]/div/div[2]/div[1]/div/div[1]"));
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//*[@id=\"block-fortis-content\"]/div/div/div/ul/li[1]/div[2]/a[2]")).click();
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//*[@id=\"slot-booking\"]/div/div[1]/div[2]/button[1]")).click();
	        Thread.sleep(2000);

	        
	        driver.findElement(By.xpath("//*[@id=\"slot-booking\"]/div/div[2]/div[2]/div/div/div/div[2]/div/div/span[2]")).click();
	        Thread.sleep(2000);

	        
	        driver.findElement(By.xpath("//*[@id=\"slot-booking\"]/div/div[3]/div[1]/div[2]/ul/li[8]")).click();
	        Thread.sleep(2000);

	        
	        driver.findElement(By.xpath("//*[@id=\"slot-booking\"]/div/div[4]/button")).click();
	        Thread.sleep(2000);
	        
            driver.findElement(By.xpath("//*[@id=\"slot-booking\"]/div/div[5]/div/div/div/div[2]/input")).sendKeys(phone);
	        Thread.sleep(2000);

            
            driver.findElement(By.xpath("//*[@id=\"slot-booking\"]/div/div[5]/div/div/button")).click();
	        Thread.sleep(4000);
	        
	        driver.findElement(By.xpath("//*[@id=\"slot-booking\"]/div/div[5]/div/div/button")).click();
	        Thread.sleep(5000);
	        
	        System.out.println("Appointment Booked successfully");

	        driver.quit();
	}
}
	        
 