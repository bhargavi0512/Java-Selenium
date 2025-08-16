package Day5_webdriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\bharg\\eclipse-workspace\\Java_Selenium\\JavaSelenium\\src\\personal.properties");
        props.load(fis);
        
        String number = props.getProperty("flipkart.phonenumber");
		
		
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/");
        driver.get("https://www.flipkart.com/account/login?ret=/");
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).sendKeys(number);
        Thread.sleep(10000);
        driver.findElement(By.className("LSOAQH")).click();
        List<String> products = new ArrayList<>();
         products.add("laptop");
         products.add("headphones");
         products.add("wireless mouse");
         for (String product : products) 
         {
             WebElement searchBox = driver.findElement(By.name("q"));
             searchBox.clear();
             searchBox.sendKeys(product);
             driver.findElement(By.className("KzDlHZ")).click();
             WebElement firstProduct = driver.findElement(By.cssSelector("a._1fQZEK, a._2rpwqI"));
             firstProduct.click();           
             driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
             
         }
        driver.quit();

	}

}
