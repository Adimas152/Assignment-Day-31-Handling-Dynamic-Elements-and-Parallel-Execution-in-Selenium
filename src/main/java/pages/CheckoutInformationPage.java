package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutInformationPage extends BasePage {

    public CheckoutInformationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    private WebElement firstNameTextField;

    @FindBy(id = "last-name")
    private WebElement lastNameTextField;

    @FindBy(id = "postal-code")
    private WebElement postalCodeTextField;

    @FindBy(id = "continue")
    private WebElement continueButton;

    public void inputFirstName(String firstName) {
        firstNameTextField.clear();
        firstNameTextField.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        lastNameTextField.clear();
        lastNameTextField.sendKeys(lastName);
    }

    public void inputPostalCode(String postalCode) {
        postalCodeTextField.clear();
        postalCodeTextField.sendKeys(postalCode);
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}
