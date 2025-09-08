package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.*;
import pages.InventoryPage;
import pages.LoginPage;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import java.util.*;

public class InventorySteps extends BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;

    @Given("User is logged in with {string} and {string}")
    public void user_is_logged_in_with_and(String username, String password) {
        driver = getDriver();
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        loginPage.login(username, password);
        Assert.assertTrue(inventoryPage.isInventoryPageDisplayed(), "Inventory page not displayed");
    }

    @Then("Inventory page title should be {string}")
    public void inventory_page_title_should_be(String title) throws InterruptedException {
        Assert.assertEquals(driver.getTitle(), title, "Page title mismatch!");
        Thread.sleep(1000);
    }

    @Then("Products should be visible")
    public void products_should_be_visible() throws InterruptedException {
        Assert.assertTrue(inventoryPage.isInventoryPageDisplayed(), "Inventory page not visible");
        Thread.sleep(1000);
    }
    
    @Then("User should be redirected to login page")
    public void user_should_be_redirected_to_login_page() throws InterruptedException {
        Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo.com"), "User not redirected to login page. Current URL: " + driver.getCurrentUrl());
        Thread.sleep(1000);
    }

    // ===== Filter & Sorting =====
    @Then("Filter dropdown should be visible")
    public void filter_dropdown_should_be_visible() throws InterruptedException {
        Assert.assertTrue(inventoryPage.isFilterDropdownVisible(), "Filter dropdown is not visible");
        Thread.sleep(1000);
    }

    @Then("Filter dropdown should have options:")
    public void filter_dropdown_should_have_options(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<String> expectedOptions = dataTable.asList();
        List<String> actualOptions = inventoryPage.getFilterOptions();
        Assert.assertEquals(actualOptions, expectedOptions, "Filter options mismatch!");
        Thread.sleep(1000);
    }

    @When("User selects {string} from filter dropdown")
    public void user_selects_from_filter_dropdown(String option) throws InterruptedException {
        inventoryPage.selectSortOption(option);
        Thread.sleep(1000);
    }

    @Then("Products should be sorted in ascending order")
    public void products_should_be_sorted_in_ascending_order() throws InterruptedException {
        List<String> productNames = inventoryPage.getProductNames();
        List<String> sorted = new ArrayList<>(productNames);
        Collections.sort(sorted);
        Assert.assertEquals(productNames, sorted, "Products are not sorted A-Z");
        Thread.sleep(1000);
    }

    @Then("Products should be sorted in descending order")
    public void products_should_be_sorted_in_descending_order() throws InterruptedException {
        List<String> productNames = inventoryPage.getProductNames();
        List<String> sorted = new ArrayList<>(productNames);
        sorted.sort(Collections.reverseOrder());
        Assert.assertEquals(productNames, sorted, "Products are not sorted Z-A");
        Thread.sleep(1000);
    }

    @Then("Products should be sorted by increasing price")
    public void products_should_be_sorted_by_increasing_price() throws InterruptedException {
        List<Double> prices = inventoryPage.getProductPrices();
        List<Double> sorted = new ArrayList<>(prices);
        Collections.sort(sorted);
        Assert.assertEquals(prices, sorted, "Products not sorted by low-to-high price");
        Thread.sleep(1000);
    }

    @Then("Products should be sorted by decreasing price")
    public void products_should_be_sorted_by_decreasing_price() throws InterruptedException {
        List<Double> prices = inventoryPage.getProductPrices();
        List<Double> sorted = new ArrayList<>(prices);
        sorted.sort(Collections.reverseOrder());
        Assert.assertEquals(prices, sorted, "Products not sorted by high-to-low price");
        Thread.sleep(1000);
    }
}