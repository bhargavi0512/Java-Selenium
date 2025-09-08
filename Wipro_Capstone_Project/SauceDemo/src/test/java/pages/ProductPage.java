package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    // Locators
    private By addBackpackBtn = By.id("add-to-cart-sauce-labs-backpack");
    private By addBikeLightBtn = By.id("add-to-cart-sauce-labs-bike-light");
    private By cartIcon = By.className("shopping_cart_link");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addBackpack() {
        driver.findElement(addBackpackBtn).click();
    }

    public void addBikeLight() {
        driver.findElement(addBikeLightBtn).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}