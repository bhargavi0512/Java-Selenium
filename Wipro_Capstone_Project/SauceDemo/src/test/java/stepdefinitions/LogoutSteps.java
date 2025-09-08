package stepdefinitions;

import core.BaseTest;
import pages.LogoutPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LogoutSteps extends BaseTest {

    LogoutPage logoutPage;

    @When("User clicks on the menu button")
    public void user_clicks_on_the_menu_button() throws InterruptedException {
        logoutPage = new LogoutPage(getDriver());
        logoutPage.openMenu();
        Thread.sleep(1000);
    }

    @When("User clicks on logout")
    public void user_clicks_on_logout() throws InterruptedException {
        logoutPage.clickLogout();
        Thread.sleep(1000);
    }

    @Then("User should be redirected to the login page")
    public void user_should_be_redirected_to_the_login_page() throws InterruptedException {
        Assert.assertTrue(getDriver().getCurrentUrl().contains("saucedemo.com"), "Not redirected to login page!");
        Thread.sleep(1000);

    }
    
    /*@Then("User opens the cart")
    public void User_opens_the_cart() {
    	logoutPage.opencart();
    }*/

    @When("User clicks on continue shopping")
    public void user_clicks_on_continue_shopping() throws InterruptedException {
        logoutPage.clickContinueShopping();
        Thread.sleep(1000);

    }

    @Then("User should be redirected to the inventory page")
    public void user_should_be_redirected_to_the_inventory_page() throws InterruptedException {
        Assert.assertTrue(getDriver().getCurrentUrl().contains("inventory.html"), "Not redirected to inventory page!");
        Thread.sleep(1000);

    }
}