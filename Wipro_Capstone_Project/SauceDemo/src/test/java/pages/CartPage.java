package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class CartPage {

    WebDriver driver;

    // Locators
    private By cartIcon = By.id("shopping_cart_container");
    private By cartBadge = By.className("shopping_cart_badge");
    private By cartItems = By.cssSelector(".cart_item .inventory_item_name");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // ✅ Open Cart
    public void openCart() {
        driver.findElement(cartIcon).click();
    }

    // ✅ Add product to cart (from inventory list)
    public void addProduct(String productName) {
        String addButtonXpath = "//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button";
        driver.findElement(By.xpath(addButtonXpath)).click();
    }

    // ✅ Get badge count
    public String getCartBadgeCount() {
        if (driver.findElements(cartBadge).isEmpty()) {
            return "0";
        }
        return driver.findElement(cartBadge).getText();
    }

    // ✅ Get items inside cart
    public List<String> getCartItems() {
        return driver.findElements(cartItems).stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    // ✅ Remove product
    public void removeProduct(String productName) {
        String removeButtonXpath = "//div[text()='" + productName + "']/ancestor::div[@class='cart_item']//button";
        driver.findElement(By.xpath(removeButtonXpath)).click();
    }

    // ✅ Cart empty check
    public boolean isCartEmpty() {
        return driver.findElements(cartItems).isEmpty();
    }
}