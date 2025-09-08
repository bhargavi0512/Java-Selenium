package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.*;
import pages.CheckoutPage;

import org.testng.Assert;

public class CheckoutSteps extends BaseTest {

    CheckoutPage checkoutPage;

    @When("User clicks on checkout button")
    public void user_clicks_on_checkout_button() throws InterruptedException {
        checkoutPage = new CheckoutPage(getDriver());
        checkoutPage.clickCheckout();
        Thread.sleep(1000);
    }

    @When("User enters checkout details {string} {string} {string}")
    public void user_enters_checkout_details(String firstName, String lastName, String postalCode) throws InterruptedException {
        checkoutPage.enterCheckoutDetails(firstName, lastName, postalCode);
        Thread.sleep(1000);
    }

    @When("User clicks continue")
    public void user_clicks_continue() throws InterruptedException {
        checkoutPage.clickContinue();
        Thread.sleep(1000);
    }

    @Then("Checkout overview page should be displayed")
    public void checkout_overview_page_should_be_displayed() throws InterruptedException {
        Assert.assertTrue(checkoutPage.isOverviewDisplayed(), "Checkout overview not displayed!");
        Thread.sleep(1000);
    }

    @When("User clicks finish")
    public void user_clicks_finish() throws InterruptedException {
        checkoutPage.clickFinish();
        Thread.sleep(1000);
    }

    @Then("Order confirmation message should be displayed")
    public void order_confirmation_message_should_be_displayed() throws InterruptedException {
        Assert.assertTrue(checkoutPage.isConfirmationDisplayed(), "Order confirmation not displayed!");
        Thread.sleep(1000);
    }

    @When("User clicks cancel")
    public void user_clicks_cancel() throws InterruptedException {
        checkoutPage.clickCancel();
        Thread.sleep(1000);
    }

    @Then("User should be redirected back to the cart page")
    public void user_should_be_redirected_back_to_the_cart_page() throws InterruptedException {
        Assert.assertTrue(getDriver().getCurrentUrl().contains("cart.html"), "Not redirected to cart page!");
        Thread.sleep(1000);
    }
}