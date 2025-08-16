package Day4_selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\bharg\\eclipse-workspace\\Java_Selenium\\JavaSelenium\\src\\personal.properties");
        prop.load(fis);

        //String url = prop.getProperty("url");
        String email = prop.getProperty("facebook.email");
        String password = prop.getProperty("facebook.password");

       //System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\OneDrive\\Desktop\\Wipro(Java Selenium)\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys(password);

        driver.findElement(By.name("login")).click();

        Thread.sleep(5000); 
        System.out.println("Facebook login successful");

        driver.quit();

	}

}
