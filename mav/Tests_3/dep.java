package Tests_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class dep {

    WebDriver driver;

    @Test
    public void openGoogle() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        System.out.println("Opening Google...");
        
        Assert.fail("Forcing failure in openGoogle ❌");
    }

    @Test(dependsOnMethods = "openGoogle",alwaysRun=true)
    public void searchGoogle() {
        
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("TestNG Soft Dependency Example");
            searchBox.submit();
            Assert.fail("Forcing failure in openGoogle ");
      
    }

    @Test(dependsOnMethods = {"openGoogle", "searchGoogle"},alwaysRun=true)
    public void validateTitle() {
       
            String title = driver.getTitle();
            System.out.println("Page title: " + title);
            Assert.assertTrue(title.contains("TestNG"), "Title check failed ❌");
        }
    

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        
            driver.quit();
        
    }
}