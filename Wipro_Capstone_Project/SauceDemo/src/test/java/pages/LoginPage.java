package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // Locators
    private By logo = By.className("login_logo");
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("h3[data-test='error']");
    private By errorIcon = By.cssSelector("div.input_error svg");
    private By errorCloseButton = By.cssSelector("button.error-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public String getTitle() {
        return driver.getTitle();        
    }

    public boolean isLogoDisplayed() {
        return driver.findElement(logo).isDisplayed();
    }

    public boolean isUsernameDisplayed() {
        return driver.findElement(usernameField).isDisplayed();
    }

    public boolean isPasswordDisplayed() {
        return driver.findElement(passwordField).isDisplayed();
    }

    public boolean isLoginButtonEnabled() {
        return driver.findElement(loginButton).isEnabled();
    }

    public String getUsernamePlaceholder() {
        return driver.findElement(usernameField).getAttribute("placeholder");
    }

    public String getPasswordPlaceholder() {
        return driver.findElement(passwordField).getAttribute("placeholder");
    }

    public String getLoginButtonText() {
        return driver.findElement(loginButton).getAttribute("value");
    }

    public void login(String username, String password) {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public boolean isErrorIconVisible() {
        return driver.findElements(errorIcon).size() > 0;
    }

    public void clearError() {
        driver.findElement(errorCloseButton).click();
    }
}