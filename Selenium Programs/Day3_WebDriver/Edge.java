package Day3_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\bharg\\OneDrive\\Desktop\\Wipro(Java Selenium)\\edgedriver_win64\\msedgedriver.exe");
		 
        WebDriver driver = new EdgeDriver();
        
        driver.get("https://www.google.com");
        
        // Print title
      System.out.println("Page Title: " + driver.getTitle());
   // Close browser
       // driver.quit();
        
        driver.close();
  }

}
