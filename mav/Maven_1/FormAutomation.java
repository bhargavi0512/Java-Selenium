package Maven_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");
        
        driver.findElement(By.id("firstName")).sendKeys("Bhargavi");
        driver.findElement(By.id("lastName")).sendKeys("Prasanna");
        driver.findElement(By.id("userEmail")).sendKeys("munnyreddy05@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
        driver.findElement(By.id("userNumber")).sendKeys("9100863490");
        
        driver.findElement(By.id("dateOfBirthInput")).click();
        driver.findElement(By.className("react-datepicker__month-select")).click();
         
        driver.findElement(By.xpath("//option[text()='October']")).click();
        Thread.sleep(3000);
         
        driver.findElement(By.className("react-datepicker__year-select")).click();
         
        driver.findElement(By.xpath("//option[text()='2002']")).click();
        Thread.sleep(3000);
         
        driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[4]")).click();
        //driver.findElement(By.id("dateOfBirthInput")).sendKeys("18 May 2003");
        //driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("History");
        WebElement sub = driver.findElement(By.id("subjectsInput"));
        sub.sendKeys("History");
        sub.sendKeys(Keys.DOWN,Keys.ENTER);
        
        driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\bharg\\OneDrive\\Pictures\\1341419.png");
        driver.findElement(By.id("currentAddress")).sendKeys("Vijayawada");
        
        WebElement state=driver.findElement(By.id("react-select-3-input"));         
        state.sendKeys("Rajasthan");
        state.sendKeys(Keys.DOWN,Keys.ENTER);

        
        WebElement city = driver.findElement(By.id("react-select-4-input"));
        city.sendKeys("Jaipur");
        city.sendKeys(Keys.DOWN,Keys.ENTER);
        
        driver.findElement(By.id("submit")).click();
        
        System.out.println("Successful");

        
       driver.quit();

	}

}
