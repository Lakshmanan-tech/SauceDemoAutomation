package saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import saucedemo.pages.CheckoutPage;
import saucedemo.pages.LoginPage;
import saucedemo.pages.ProductPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutProduct() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername(properties.getProperty("username"));
        loginPage.enterPassword(properties.getProperty("password"));
        loginPage.clickLogin();

        ProductPage productPage = new ProductPage(driver);

        productPage.addBackpackToCart();
        productPage.clickCart();

        CheckoutPage checkoutPage = new CheckoutPage(driver);

        checkoutPage.clickCheckout();

        checkoutPage.enterFirstName("Lakshmanan");
        checkoutPage.enterLastName("Test");
        checkoutPage.enterPostalCode("600001");

        checkoutPage.clickContinue();

        checkoutPage.clickFinish();

        String message = checkoutPage.getSuccessMessage();

        Assert.assertEquals(
                message,
                "Thank you for your order!");
    }
}