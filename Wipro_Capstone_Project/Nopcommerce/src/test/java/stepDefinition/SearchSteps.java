package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import hooks.RegisterHooks;
import pages.LoginPage;   // your existing login page
import pages.SearchPage;

public class SearchSteps {

    WebDriver driver = RegisterHooks.driver;  // your Hooks driver
    LoginPage loginPage = new LoginPage(driver);
    SearchPage searchPage = new SearchPage(driver);

    @Given("I am logged in with valid email {string} and password {string}")
    public void i_am_logged_in_with_valid_email_and_password(String email, String password) {
        loginPage.clickLoginLink();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

        // optional: print success message
        System.out.println("✅ Logged in with: " + email);
    }

    @When("I search for {string}")
    public void i_search_for(String productName) {
        searchPage.searchProduct(productName);
    }

    @Then("I should see search results for {string}")
    public void i_should_see_search_results_for(String productName) {
        searchPage.printResults(productName);
    }
}

