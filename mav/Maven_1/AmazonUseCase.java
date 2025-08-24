package Maven_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonUseCase {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\bharg\\eclipse-workspace\\Java_Selenium\\JavaSelenium\\src\\personal.properties");
        props.load(fis);
        
            
        String phonenumber = props.getProperty("amazon.phonenumber");
        String password = props.getProperty("amazon.password");
        //String searchItem1 = props.getProperty("searchItem1"); 

        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("ap_email_login")).sendKeys(phonenumber);
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();
       
        List<String> products = new ArrayList<>();
        products.add("laptop");
        products.add("watch");
        products.add("phone");
        for (String product : products) {
            
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.clear();
            searchBox.sendKeys(product);
            driver.findElement(By.id("nav-search-submit-button")).click();
            driver.findElement(By.cssSelector("#a-autoid-3-announce")).click();
            Thread.sleep(3000);
            
        }
        
        System.out.println("Products added to cart successfully");
       
        driver.quit();


	}

}
