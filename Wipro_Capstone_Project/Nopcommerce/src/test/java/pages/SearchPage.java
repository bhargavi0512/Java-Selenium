package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    WebDriver driver;

    // Search box and button
    @FindBy(id = "small-searchterms")
    WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"small-search-box-form\"]/button")
    WebElement searchButton;

    // Product titles in search results
    @FindBy(xpath = "//h2[@class='product-title']/a")
    List<WebElement> productTitles;

    // "No products found" message
    @FindBy(xpath = "//div[@class='no-result']")
    WebElement noResultsMsg;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Simple pause utility
    private void pause(int sec) {
        try { Thread.sleep(sec * 1000); } catch(Exception e) {}
    }

    // Enter product name and search
    public void searchProduct(String productName) {
        searchBox.clear();
        searchBox.sendKeys(productName);
        searchButton.click();
        pause(2);  // wait for results to load
       
    }

    // Print search results or no result message
    public void printResults(String productName) {
        try {
            if (!productTitles.isEmpty()) {
                System.out.println(" Results found for: " + productName);
                for (WebElement title : productTitles) {
                    System.out.println(" - " + title.getText());
                }
            } else if (noResultsMsg.isDisplayed()) {
                System.out.println("❌ " + noResultsMsg.getText() + " (Product: " + productName + ")");
            } else {
                System.out.println(" Could not find results for: " + productName);
            }
        } catch (Exception e) {
            System.out.println(" Error while checking results for: " + productName);
        }
    }
}
