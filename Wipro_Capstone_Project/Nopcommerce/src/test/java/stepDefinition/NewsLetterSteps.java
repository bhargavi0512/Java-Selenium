package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.NewsLetterPage;
import hooks.RegisterHooks;

public class NewsLetterSteps {

    WebDriver driver = RegisterHooks.driver;
    NewsLetterPage newsletterPage = new NewsLetterPage(driver);

    @Given("I am on the newsletter section")
    public void i_am_on_the_newsletter_section() {
        // Assuming newsletter section is on the home page
        // Scroll to newsletter section if needed
        System.out.println("User is on Newsletter section");
    }

    @When("I enter {string} in the newsletter field")
    public void i_enter_in_the_newsletter_field(String email) {
        newsletterPage.enterEmail(email);
    }

    @When("I click on subscribe button")
    public void i_click_on_subscribe_button() {
        newsletterPage.clickSubscribe();
    }

    @Then("subscription should be successful or show error")
    public void subscription_should_be_successful_or_show_error() {
        if (newsletterPage.isMessageDisplayed()) {
            String msg = newsletterPage.getMessage();
            System.out.println("Message Displayed: " + msg);
        } else {
            System.out.println("No message displayed");
        }
    }
}
