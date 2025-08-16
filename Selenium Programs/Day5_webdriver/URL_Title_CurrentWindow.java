package Day5_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;

public class URL_Title_CurrentWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\OneDrive\\Desktop\\Wipro(Java Selenium)\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        
        driver.get("https://github.com/");
        
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        String currentwindow = driver.getWindowHandle();
        
        System.out.println("Url page:" +url);
        System.out.println("Title of page:"+title);
        System.out.println("current window ID:"+currentwindow);
        
       
        System.out.println("Successful");
        
        driver.quit();

	}

}
