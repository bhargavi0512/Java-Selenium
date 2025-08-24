package Maven_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HospitalAppointmentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

      
        driver.get("https://www.practo.com/");
        
        // usecase 1 Login to website
        
        driver.findElement(By.name("Practo login")).click(); 
        
        driver.findElement(By.id("username")).sendKeys("9110375200");
        
        driver.findElement(By.id("password")).sendKeys("Munny@0512");
        
        driver.findElement(By.id("login")).click();
        
        //usecase2 book a appointment
        
        /*driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div/div/div[2]/div/div/div[1]/div/div[1]/div/div/div/a")).click();
        
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[4]/div/div[1]/div/div[11]/div[1]/div/div[2]/div/div/div[2]/div[1]/button")).click();
        
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[4]/div/div[1]/div/div[11]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div[2]/button/span")).click();
        
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[4]/div/div[1]/div/div[11]/div[2]/div/div/div/div[2]/div[2]/div[3]/div[2]/div[9]/span")).click();
        
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div[2]/div[2]/div/div[3]/div[2]/div/div[3]/div/input")).sendKeys("munnyreddy05@gmail.com");
        
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div[2]/div[2]/div/div[6]/div[2]/div[2]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div[2]/div[2]/div/div[6]/div[3]/div[1]/button")).click();*/
        
        //usecase 3 upload a file
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[3]/div[4]/span/span[2]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[3]/div[4]/span/div/div[5]/a/span")).click();
        
        driver.findElement(By.cssSelector("#sideBarAppContainer > div.col-sm-9.col-lg-10.col-xs-12.product-container-wrapper > div.timeline-container-wrapper > div > div.timeline-container-header.separator.hidden-xs > div")).click();
        
        WebElement report = driver.findElement(By.cssSelector("body > div.ReactModalPortal > div > div > div > div.record-upload-preview-box > div"));
        report.click();
        report.sendKeys("C:\\Users\\bharg\\Oracle");
        
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[3]/div[2]")).click();
        
        //usecase 4 payment
        
        
        
        
        //usecase 5 Logout
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[3]/div[4]/span/span[2]")).click();
        
        driver.findElement(By.cssSelector("#root > div > div > div.global-nav-bar > div.practo_GlobalNavigation > div.navbar.desktop.en > div > div.nav-right.text-right > div.nav-items.u-d-trigger.dropdown-toggle.push-droparrow > span > div > div:nth-child(10) > a")).click();

        
        

	}

}