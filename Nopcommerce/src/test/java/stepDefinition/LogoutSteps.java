package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.LogoutPage;
import org.testng.Assert;

import hooks.RegisterHooks;

public class LogoutSteps {

    WebDriver driver = RegisterHooks.driver;  
    LoginPage loginPage = new LoginPage(driver);
    LogoutPage logoutPage = new LogoutPage(driver);

    // Background step for login
    @Given("I am logged in with {string} and {string}")
    public void i_am_logged_in_with(String email, String password) {
        loginPage.clickLoginLink();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        // verify login success
        Assert.assertTrue(driver.getPageSource().contains("Log out"));
    }

    @When("I click on logout")
    public void i_click_on_logout() {
        logoutPage.clickLogout();
        System.out.println("Successfully logged out");
    }

    @Then("I should be logged out successfully")
    public void i_should_be_logged_out_successfully() {
        // verify logout success
        Assert.assertTrue(driver.getPageSource().contains("Log in"));
    }
}
