package Day4_selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\bharg\\eclipse-workspace\\Java_Selenium\\JavaSelenium\\src\\personal.properties");
        props.load(fis);
        
        String yahooEmail = props.getProperty("yahoo.email");
        String yahooPass = props.getProperty("yahoo.password");

        
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.get("https://login.yahoo.com/");
        driver.findElement(By.id("login-username")).sendKeys(yahooEmail);
        driver.findElement(By.id("login-signin")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("login-passwd")).sendKeys(yahooPass);
        driver.findElement(By.id("login-signin")).click();
        Thread.sleep(3000);
        
        //System.out.println("Login Successful");
        
        driver.quit();

	}

}
