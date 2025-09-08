package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(id = "gender-male")
    WebElement maleRadio;

    @FindBy(id = "gender-female")
    WebElement femaleRadio;

    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @FindBy(id = "LastName")
    WebElement lastNameField;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @FindBy(id = "register-button")
    WebElement registerButton;

    // Utility wait
    private void pause(int seconds) {
        try { Thread.sleep(seconds * 1000); } 
        catch (InterruptedException e) { e.printStackTrace(); }
    }

    // Methods
    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("Male")) maleRadio.click();
        else if (gender.equalsIgnoreCase("Female")) femaleRadio.click();
        pause(1);
    }

    public void enterFirstName(String fname) {
        firstNameField.clear();
        firstNameField.sendKeys(fname);
        pause(1);
    }

    public void enterLastName(String lname) {
        lastNameField.clear();
        lastNameField.sendKeys(lname);
        pause(1);
    }

    public void enterEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
        pause(1);
    }

    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        pause(1);
    }

    public void enterConfirmPassword(String cpassword) {
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(cpassword);
        pause(1);
    }

    public void clickRegister() {
        registerButton.click();
        pause(2);
    }
}
