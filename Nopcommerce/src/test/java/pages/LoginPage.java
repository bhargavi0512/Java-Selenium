package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

//    @FindBy(xpath = "//div[@class='message-error']")
//    WebElement errorMessage;

    // Utility wait
    private void pause(int seconds) {
        try { Thread.sleep(seconds * 1000); } 
        catch (InterruptedException e) { e.printStackTrace(); }
    }

    // Actions
    public void clickLoginLink() {
        loginLink.click();
        pause(1);
    }

    public void enterEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
        pause(1);
    }

    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        pause(1);
    }

    public void clickLoginButton() {
        loginButton.click();
        pause(2);
    }
}