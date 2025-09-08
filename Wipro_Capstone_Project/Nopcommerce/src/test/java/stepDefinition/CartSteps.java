package stepDefinition;

import org.testng.Assert;

import hooks.RegisterHooks;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.CartPage;

public class CartSteps {

    WebDriver driver;
    CartPage cartPage;

    // Dependency injection (Hooks will set driver)
    public CartSteps() {
        this.driver = RegisterHooks.driver; 
        this.cartPage = new CartPage(driver);

    }

    @When("I navigate to the {string} category")
    public void i_navigate_to_category(String category) {
        if (category.equalsIgnoreCase("Jewelry")) {
            cartPage.clickJewelry();
        }
    }

    @When("I add {string} to the cart")
    public void i_add_product_to_cart(String productName) throws InterruptedException {
        if (productName.equalsIgnoreCase("Flower Girl Bracelet")) {
            cartPage.addFlowerGirlBraceletToCart();
            Thread.sleep(1000);
        }
    }

    @When("I go to the shopping cart")
    public void i_go_to_the_shopping_cart() throws InterruptedException {
        cartPage.openShoppingCart();
        Thread.sleep(1000);
    }

    @Then("I should see {string} in the cart")
    public void i_should_see_product_in_the_cart(String productName) throws InterruptedException {
        Assert.assertTrue(cartPage.isProductInCart());
        Thread.sleep(1000);
    }

    @Given("{string} is already in the cart")
    public void product_is_already_in_the_cart(String productName) throws InterruptedException {
        cartPage.clickJewelry();
        cartPage.addFlowerGirlBraceletToCart();
        cartPage.openShoppingCart();
        Assert.assertTrue(cartPage.isProductInCart());
        Thread.sleep(1000);
    }

    @When("I remove {string} from the cart")
    public void i_remove_product_from_the_cart(String productName) throws InterruptedException {
        cartPage.removeProductFromCart();
        Thread.sleep(1000);
    }

    @Then("I should not see {string} in the cart")
    public void i_should_not_see_product_in_the_cart(String productName) throws InterruptedException {
        Assert.assertFalse(cartPage.isProductInCart());
        Thread.sleep(1000);
    }
}
