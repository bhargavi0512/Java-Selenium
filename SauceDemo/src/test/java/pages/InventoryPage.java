package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class InventoryPage {
    WebDriver driver;
    WebDriverWait wait;

    // Locators
    private By inventoryContainer = By.id("inventory_container");
    private By menuButton = By.id("react-burger-menu-btn");
    private By logoutLink = By.id("logout_sidebar_link");
    private By sortDropdown = By.className("product_sort_container");
    private By productNames = By.className("inventory_item_name");
    private By productPrices = By.className("inventory_item_price");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isInventoryPageDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(inventoryContainer)).isDisplayed();
    }

    // ✅ Filter / Sorting
    public boolean isFilterDropdownVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sortDropdown)).isDisplayed();
    }

    public List<String> getFilterOptions() {
        Select select = new Select(driver.findElement(sortDropdown));
        return select.getOptions().stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public void selectSortOption(String option) {
        Select select = new Select(driver.findElement(sortDropdown));
        select.selectByVisibleText(option);
    }

    public List<String> getProductNames() {
        return driver.findElements(productNames).stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public List<Double> getProductPrices() {
        return driver.findElements(productPrices).stream()
                .map(e -> Double.parseDouble(e.getText().replace("$", "")))
                .collect(Collectors.toList());
    }
}