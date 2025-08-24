package Tests_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonSimpleTest {
	@DataProvider(name = "products")
    public Object[][] getData() {
        return new Object[][] {
            {"laptop"},
            {"iphone"},
            {"headphones"}
        };
    }

    @Test(dataProvider = "products", retryAnalyzer = RetryAnalyzer.class)
    public void searchAmazon(String productName) throws InterruptedException {
        WebDriver driver = new ChromeDriver();   
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");   

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName, Keys.ENTER);

        Thread.sleep(2000);  
        System.out.println("Searched for: " + productName);

        driver.quit();  
    }
}
