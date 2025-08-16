package Day4_selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\bharg\\eclipse-workspace\\Java_Selenium\\JavaSelenium\\src\\personal.properties");
        props.load(fis);
        
        String instaUser = props.getProperty("instagram.user");
        String instaPass = props.getProperty("instagram.password");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.get("https://www.instagram.com/accounts/login/");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys(instaUser);
        driver.findElement(By.name("password")).sendKeys(instaPass);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(10000);
        
        System.out.println("Login Successful");
        
        driver.quit();

	}

}
