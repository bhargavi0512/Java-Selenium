package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(linkText = "Log out")
    WebElement logoutLink;

    @FindBy(linkText = "Log in") // optional: to verify after logout
    WebElement loginLink;

    // Utility wait
    private void pause(int seconds) {
        try { Thread.sleep(seconds * 1000); } 
        catch (InterruptedException e) { e.printStackTrace(); }
    }

    // Actions
    public void clickLogout() {
        logoutLink.click();
        pause(2);
    }

    public boolean isLoginLinkDisplayed() {
        return loginLink.isDisplayed();
    }
}
