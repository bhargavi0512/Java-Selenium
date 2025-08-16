package Day5_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookAppointment_360 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://360homedecor.uk/book-appointment");
		Thread.sleep(1000);
		
		  WebElement branchdropDown = driver.findElement(By.id("choose_branch"));

	        Select select = new Select(branchdropDown);
            select.selectByValue("marquis_manor");
            Thread.sleep(2000);
            
            WebElement styledropdown = driver.findElement(By.id("choose_style"));
            Select select1 = new Select(styledropdown);
            select1.selectByValue("luxury");
            Thread.sleep(2000);
            
            
		driver.findElement(By.id("first_name")).sendKeys("Bhargavi");
        Thread.sleep(2000);

		driver.findElement(By.id("last_name")).sendKeys("Prasanna");
        Thread.sleep(2000);

		driver.findElement(By.id("apt_city")).sendKeys("Vijayawada");
        Thread.sleep(2000);

		driver.findElement(By.id("phone_number")).sendKeys("9701411507");
        Thread.sleep(2000);

		driver.findElement(By.id("email")).sendKeys("munnyreddy05@gmail.com");
        Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"layoutFiles\"]")).sendKeys("C:\\Users\\bharg\\OneDrive\\Pictures\\1341419.png");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"appointment_form\"]/div[10]/button")).click();
        //Thread.sleep(2000);
        
        System.out.println("Booked Successfully");
		
        //driver.quit();

	}

}
