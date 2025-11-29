package tests;

import core.BaseTest;
import core.DriverManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutTest extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(CheckoutTest.class);

    @Test
    public void test_002_suksesCheckout() {
        log.info("Test Checkout Started");

        // STEP 1: Login
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        loginPage.inputUsernameTextField("standard_user");
        loginPage.inputPasswordTextField("secret_sauce");
        loginPage.clickLoginButton();

        // STEP 2: Di halaman produk, add to cart + buka cart
        ProductPage productPage = new ProductPage(DriverManager.getDriver());
        productPage.verifyCartIsDisplayed();
        productPage.clickAddToCartBackpack();
        productPage.clickCartIcon();

        // STEP 3: Cart -> klik Checkout
        CartPage cartPage = new CartPage(DriverManager.getDriver());
        cartPage.clickCheckoutButton();

        // STEP 4: Isi form "Your Information"
        CheckoutInformationPage infoPage = new CheckoutInformationPage(DriverManager.getDriver());
        infoPage.inputFirstName("Adimas");
        infoPage.inputLastName("Sutrisno");
        infoPage.inputPostalCode("12345");
        infoPage.clickContinueButton();

        // STEP 5: Overview -> Finish
        CheckoutOverviewPage overviewPage = new CheckoutOverviewPage(DriverManager.getDriver());
        overviewPage.clickFinishButton();

        // STEP 6: Verify Thank you message
        CheckoutCompletePage completePage = new CheckoutCompletePage(DriverManager.getDriver());
        completePage.verifyThankYouMessageIsDisplayed();
        Assert.assertEquals(completePage.getThankYouMessageText(), "Thank you for your order!",  "Teks Thank you tidak sesuai");
        log.info("Test Checkout Finished Successfully");
    }
}
