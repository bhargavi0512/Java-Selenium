package Maven_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title:" +driver.getTitle());
		System.out.println("CurrentUrl:" +driver.getCurrentUrl());
		System.out.println("windowhandle:" +driver.getWindowHandle());
		driver.quit();

	}

}
