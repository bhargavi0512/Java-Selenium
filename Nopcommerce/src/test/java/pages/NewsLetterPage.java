package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsLetterPage {

    WebDriver driver;

    public NewsLetterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "newsletter-email")  // change according to your site
    WebElement emailField;

    @FindBy(id = "newsletter-subscribe-button") // change according to your site
    WebElement subscribeButton;

    @FindBy(xpath = "//div[@class='result']") // success or error message container
    WebElement message;

    private void pause(int sec) {
        try { Thread.sleep(sec*1000); } catch(Exception e) {}
    }

    public void enterEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
        pause(1);
    }

    public void clickSubscribe() {
        subscribeButton.click();
        pause(2);
    }

    public boolean isMessageDisplayed() {
        return driver.findElements(By.xpath("//div[@class='result']")).size() > 0;
    }

    public String getMessage() {
        if (isMessageDisplayed()) return message.getText();
        return "";
    }
}
