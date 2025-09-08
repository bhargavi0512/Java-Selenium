package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.*;
import pages.InventoryPage;
import pages.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;

public class LoginSteps extends BaseTest {

    LoginPage loginPage;
    InventoryPage inventoryPage;

    @Given("User is on Login page")
    public void user_is_on_login_page() throws InterruptedException {
        loginPage = new LoginPage(getDriver());
        Thread.sleep(1000);
    }

    @Then("Login page title should be {string}")
    public void login_page_title_should_be(String expectedTitle) throws InterruptedException {
        String actualTitle = loginPage.getTitle();
        System.out.println("Page Title: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
        Thread.sleep(1000);
    }

    @Then("Logo should be displayed")
    public void logo_should_be_displayed() throws InterruptedException {
        Assert.assertTrue(loginPage.isLogoDisplayed());
        System.out.println("Logo is Displayed");
        Thread.sleep(1000);
    }

    @Then("Username and Password fields should be visible")
    public void username_and_password_fields_should_be_visible() throws InterruptedException {
        boolean usernameVisible = loginPage.isUsernameDisplayed();
        boolean passwordVisible = loginPage.isPasswordDisplayed();

        System.out.println("Username field visible: " + usernameVisible);
        System.out.println("Password field visible: " + passwordVisible);

        Assert.assertTrue(usernameVisible);
        Assert.assertTrue(passwordVisible);
        Thread.sleep(1000);

    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) throws InterruptedException {
        System.out.println("Entering Username: " + username);
        System.out.println("Entering Password: " + password);
        loginPage.login(username, password);
        Thread.sleep(1000);

    }

    @When("Clicks login")
    public void clicks_login() {
        // already done in login()
    }

    @Then("Inventory page should be displayed")
    public void inventory_page_should_be_displayed() throws InterruptedException {
        inventoryPage = new InventoryPage(getDriver());
        Assert.assertTrue(inventoryPage.isInventoryPageDisplayed());
        Thread.sleep(1000);
        System.out.println("Inventory page displayed successfully!");
    }

    @Then("Error message {string} should be shown")
    public void error_message_should_be_shown(String expected) throws InterruptedException {
        String actualError = loginPage.getErrorMessage();
        System.out.println("Error Message Displayed: " + actualError);
        Assert.assertTrue(actualError.contains(expected));
        Thread.sleep(1000);
    }

    @Then("Login button should be visible and enabled")
    public void login_button_should_be_visible_and_enabled() throws InterruptedException {
        WebElement loginBtn = getDriver().findElement(By.id("login-button"));
        System.out.println("Login Button Visible: " + loginBtn.isDisplayed());
        System.out.println("Login Button Enabled: " + loginBtn.isEnabled());
        Assert.assertTrue(loginBtn.isDisplayed());
        Assert.assertTrue(loginBtn.isEnabled());
        Thread.sleep(1000);
    }

    @Then("Placeholder text of Username should be {string}")
    public void placeholder_text_of_username_should_be(String expected) throws InterruptedException {
        String placeholder = getDriver().findElement(By.id("user-name")).getAttribute("placeholder");
        System.out.println("Username Placeholder: " + placeholder);
        Assert.assertEquals(placeholder, expected);
        Thread.sleep(1000);
    }

    @Then("Placeholder text of Password should be {string}")
    public void placeholder_text_of_password_should_be(String expected) throws InterruptedException {
        String placeholder = getDriver().findElement(By.id("password")).getAttribute("placeholder");
        System.out.println("Password Placeholder: " + placeholder);
        Assert.assertEquals(placeholder, expected);
        Thread.sleep(1000);
    }

    @Then("Login button text should be {string}")
    public void login_button_text_should_be(String expected) throws InterruptedException {
        String buttonText = getDriver().findElement(By.id("login-button")).getAttribute("value");
        System.out.println("Login Button Text: " + buttonText);
        Assert.assertEquals(buttonText, expected);
        Thread.sleep(1000);
    }

    @Then("Inventory page should be displayed with broken images")
    public void inventory_page_with_broken_images() throws InterruptedException {
        getDriver().findElement(By.id("inventory_container"));
        List<WebElement> images = getDriver().findElements(By.cssSelector(".inventory_item_img img"));
        for (WebElement img : images) {
            boolean loaded = (Boolean) ((JavascriptExecutor) getDriver())
                    .executeScript("return arguments[0].complete && arguments[0].naturalWidth > 0", img);
            System.out.println("Image Loaded: " + loaded);
            Assert.assertTrue(loaded, "Broken image found!");
            Thread.sleep(1000);
        }
    }

    @Then("Inventory page should load within 5 seconds")
    public void inventory_page_should_load_within_5_seconds() throws InterruptedException {
        long start = System.currentTimeMillis();
        getDriver().findElement(By.id("inventory_container"));
        long end = System.currentTimeMillis();
        System.out.println("Page Load Time: " + (end - start) + " ms");
        Assert.assertTrue((end - start) <= 5000, "Page took longer than 5 seconds");
        Thread.sleep(1000);
    }

    @Given("User navigates directly to inventory page without login")
    public void user_navigates_directly_to_inventory_page_without_login() throws InterruptedException {
        getDriver().get("https://www.saucedemo.com/inventory.html");
        Thread.sleep(1000);
        System.out.println("Navigated directly to inventory page without login");
    }

    @Then("User should be redirected to Login page")
    public void user_should_be_redirected_to_login_page() throws InterruptedException {
        String currentUrl = getDriver().getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        Assert.assertTrue(currentUrl.contains("saucedemo.com/"),
                "User was not redirected to login page");
        Thread.sleep(1000);
    }
}