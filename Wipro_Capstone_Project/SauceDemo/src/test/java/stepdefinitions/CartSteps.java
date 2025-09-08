package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.*;
import pages.CartPage;

import org.testng.Assert;

import java.util.List;

public class CartSteps extends BaseTest {

    CartPage cartPage;

    @When("User adds {string} to the cart")
    public void user_adds_to_the_cart(String productName) throws InterruptedException {
        cartPage = new CartPage(getDriver());
        cartPage.addProduct(productName);
        Thread.sleep(1000);
    }

    @When("User adds products:")
    public void user_adds_products(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        cartPage = new CartPage(getDriver());
        for (String product : dataTable.asList()) {
            cartPage.addProduct(product);
            Thread.sleep(1000);
        }
    }

    @When("User opens the cart")
    public void user_opens_the_cart() throws InterruptedException {
        cartPage = new CartPage(getDriver());
        cartPage.openCart();
        Thread.sleep(1000);
    }

    @Then("Cart badge should show {string}")
    public void cart_badge_should_show(String expectedCount) throws InterruptedException {
        cartPage = new CartPage(getDriver());
        String actualBadge = cartPage.getCartBadgeCount();
        System.out.println("Cart badge: " + actualBadge);
        Assert.assertEquals(actualBadge, expectedCount, "Cart badge count mismatch!");
        Thread.sleep(1000);
    }

    @Then("Cart should contain {string}")
    public void cart_should_contain(String productName) throws InterruptedException {
        List<String> items = cartPage.getCartItems();
        System.out.println("Items in cart: " + items);
        Assert.assertTrue(items.contains(productName),
                "Cart does not contain " + productName);
        Thread.sleep(1000);
    }

    @When("User removes {string} from the cart")
    public void user_removes_from_the_cart(String productName) throws InterruptedException {
        cartPage.removeProduct(productName);
        Thread.sleep(1000);
    }

    @Then("Cart should be empty")
    public void cart_should_be_empty() throws InterruptedException {
        Assert.assertTrue(cartPage.isCartEmpty(), "Cart is not empty!");
        Thread.sleep(1000);
    }
}