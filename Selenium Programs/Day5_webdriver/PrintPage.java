package Day5_webdriver;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;

public class PrintPage {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\OneDrive\\Desktop\\Wipro(Java Selenium)\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://github.com/");
        PrintOptions printOptions = new PrintOptions();
        printOptions.setOrientation(PrintOptions.Orientation.LANDSCAPE);
        PrintOptions.Orientation current_orientation = printOptions.getOrientation();
        System.out.println("current Orientation:"+ current_orientation);
        
        printOptions.setPageRanges("1-5");
        String[] current_range=printOptions.getPageRanges();
        System.out.println(Arrays.toString(current_range));
        //Thread.sleep(50000);
        
        driver.quit();


	}

}
