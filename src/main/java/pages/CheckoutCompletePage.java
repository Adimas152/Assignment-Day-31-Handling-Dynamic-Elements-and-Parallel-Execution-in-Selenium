package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckoutCompletePage extends BasePage {

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[text()='Thank you for your order!']")
    private WebElement thankYouMessage;

    public void verifyThankYouMessageIsDisplayed() {
        Assert.assertTrue(
                thankYouMessage.isDisplayed(),
                "Thank you message is not displayed"
        );
    }

    public String getThankYouMessageText() {
        return thankYouMessage.getText();
    }
}
