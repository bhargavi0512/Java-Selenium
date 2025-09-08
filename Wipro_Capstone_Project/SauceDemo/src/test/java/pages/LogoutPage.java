package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class LogoutPage {
    WebDriver driver;
    WebDriverWait wait;

    // Locators
    private By menuButton = By.id("react-burger-menu-btn");
    private By logoutLink = By.id("logout_sidebar_link");
    //private By cartLink = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    private By continueShoppingButton = By.xpath("//*[@id=\"continue-shopping\"]");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(menuButton)).click();
    }

    public void clickLogout() {
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click();
    }
    
   /* public void opencart() {
    	wait.until(ExpectedConditions.elementToBeClickable(cartLink)).click();
    }*/

    public void clickContinueShopping() {
        wait.until(ExpectedConditions.elementToBeClickable(continueShoppingButton)).click();
    }
}