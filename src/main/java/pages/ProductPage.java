package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    // Logo Swag Labs
    @FindBy(xpath = "//*[@id='header_container']/div[1]/div[2]/div")
    private WebElement swagLabLogo;

    // Tombol Add to Cart untuk Sauce Labs Backpack
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartBackpackButton;

    // Icon keranjang di kanan atas
    @FindBy(id = "shopping_cart_container")
    private WebElement cartIcon;

    public void verifySwagLabLogoIsDisplayed() {
        Assert.assertTrue(swagLabLogo.isDisplayed(), "Swag Lab logo is not displayed");
    }

    public void verifyCartIsDisplayed() {
        Assert.assertTrue(swagLabLogo.isDisplayed(), "Swag Lab logo is not displayed");
    }

    public void clickAddToCartBackpack() {
        addToCartBackpackButton.click();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }
}
