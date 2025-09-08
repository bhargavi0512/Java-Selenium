package stepdefinitions;

import core.BaseTest;
import utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Hooks extends BaseTest {

    @Before
    public void setUp() {

        config = new ConfigReader();
        String browser = config.getProperty("browser");
        String url = config.getProperty("saucedemo.url");

        WebDriver localDriver;

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();

            // ✅ Disable Chrome password manager & change password prompts
            ChromeOptions options = new ChromeOptions();
            Map<String, Object> prefs = new HashMap<>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            prefs.put("profile.password_manager_leak_detection", false);
            options.setExperimentalOption("prefs", prefs);

            options.addArguments("--disable-save-password-bubble");
            options.addArguments("--disable-features=PasswordManagerOnboarding");
            options.addArguments("--disable-features=PasswordChange");
            options.addArguments("--disable-features=PasswordCheck");

            localDriver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            localDriver = new FirefoxDriver();
        } else {
            throw new RuntimeException("Browser not supported: " + browser);
        }

        localDriver.manage().window().maximize();
        localDriver.manage().timeouts().implicitlyWait(
                Duration.ofSeconds(Long.parseLong(config.getProperty("implicit.wait")))
        );
        localDriver.get(url);

        setDriver(localDriver);
    }

    @After
    public void tearDown() {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }
}