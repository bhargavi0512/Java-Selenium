package Day3_WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class EdgeInfo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\bharg\\OneDrive\\Desktop\\Wipro(Java Selenium)\\edgedriver_win64\\msedgedriver.exe");

		
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				
				Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
				
				System.out.println("Browser Name: "+ caps.getBrowserName());
				System.out.println("Browser Version: "+ caps.getBrowserVersion());
		        System.out.println("Platform: "+ caps.getPlatformName());
		        
		        driver.quit();


	}

}
