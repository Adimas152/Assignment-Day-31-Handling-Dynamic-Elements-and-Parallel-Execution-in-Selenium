package tests;

import core.BaseTest;
import core.DriverManager;
import pages.LoginPage;
import pages.ProductPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @Test
    public void test_001_suksesLogin() {
        log.info("Test Login Started");

        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        loginPage.verifyLoginButtonIsDisplayed();
        loginPage.inputUsernameTextField("standard_user");
        loginPage.inputPasswordTextField("secret_sauce");
        loginPage.clickLoginButton();

        ProductPage productPage = new ProductPage(DriverManager.getDriver());
        productPage.verifyCartIsDisplayed();

        log.info("Test Login Finished Successfully");
    }
}
