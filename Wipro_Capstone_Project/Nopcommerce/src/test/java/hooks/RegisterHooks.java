package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterHooks {
    public static WebDriver driver;
    public static String baseUrl = "https://demo.nopcommerce.com/register"; // AUT URL

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl); // Open URL before each scenario
    }

    @After
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }
}
