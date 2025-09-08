package core;

import org.openqa.selenium.WebDriver;

import utils.ConfigReader;

public class BaseTest {
    protected static WebDriver driver;
    protected static ConfigReader config;

    public static WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        BaseTest.driver = driver;
    }
}