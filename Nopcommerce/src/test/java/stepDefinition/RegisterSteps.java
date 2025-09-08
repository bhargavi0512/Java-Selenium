package stepDefinition;

import pages.RegisterPage;

import hooks.RegisterHooks;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class RegisterSteps {

    WebDriver driver;
    RegisterPage registerPage;

    public RegisterSteps() {
        this.driver = RegisterHooks.driver;  // Use driver from Hooks
        registerPage = new RegisterPage(driver);
    }

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        // Hooks already opens the page, so no need to call driver.get()
    }

    @When("I enter {string}, {string}, {string}, {string}, {string}, {string}")
    public void i_enter(String gender, String fname, String lname, String email, String password, String cpassword) {
        registerPage.selectGender(gender);
        registerPage.enterFirstName(fname);
        registerPage.enterLastName(lname);
        registerPage.enterEmail(email);
        registerPage.enterPassword(password);
        registerPage.enterConfirmPassword(cpassword);
    }

    @When("I click on register")
    public void i_click_on_register() {
        registerPage.clickRegister();
    }
}
