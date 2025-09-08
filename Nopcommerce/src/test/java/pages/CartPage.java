package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    // Locators
    By jewelryLink = By.linkText("Jewelry");
    By flowerGirlBraceletAddToCart = By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]");
    By shoppingCartLink = By.xpath("//*[@id='topcartlink']/a/span[1]");
    By cartItem = By.xpath("//td[@class='product']//a[text()='Flower Girl Bracelet']");
    By removeCheckbox = By.xpath("//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr/td[7]/button");

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void clickJewelry() {
        driver.findElement(jewelryLink).click();
    }

    public void addFlowerGirlBraceletToCart() {
        driver.findElement(flowerGirlBraceletAddToCart).click();
    }

    public void openShoppingCart() {
        driver.findElement(shoppingCartLink).click();
    }

    public boolean isProductInCart() {
        return driver.findElements(cartItem).size() > 0;
    }

    public void removeProductFromCart() {
        driver.findElement(removeCheckbox).click();
    }
}
