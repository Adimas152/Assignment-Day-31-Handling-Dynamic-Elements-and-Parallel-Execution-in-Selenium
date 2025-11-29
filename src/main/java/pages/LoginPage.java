package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user-name")
    private WebElement usernameTextField;

    @FindBy(id = "password")
    private WebElement passwordTextField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public void verifyLoginButtonIsDisplayed() {
        Assert.assertTrue(loginButton.isDisplayed(), "Login button is not displayed");
    }

    public void inputUsernameTextField(String username) {
        usernameTextField.clear();
        usernameTextField.sendKeys(username);
    }

    public void inputPasswordTextField(String password) {
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
