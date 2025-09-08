package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import hooks.RegisterHooks;


public class LoginSteps {
	
	WebDriver driver;
    LoginPage loginPage;

    public LoginSteps() {
        this.driver = RegisterHooks.driver;  // Use driver from Hooks
        loginPage = new LoginPage(driver);
    }


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        loginPage.clickLoginLink();
    }

    @When("I enter {string} and {string}")
    public void i_enter_and(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }

    @When("I click on login")
    public void i_click_on_login() {
        loginPage.clickLoginButton();
    }

 
}
