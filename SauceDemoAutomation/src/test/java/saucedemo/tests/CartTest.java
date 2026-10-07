package saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import saucedemo.pages.CartPage;
import saucedemo.pages.LoginPage;
import saucedemo.pages.ProductPage;

public class CartTest extends BaseTest {

    @Test
    public void verifyCartProduct() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername(properties.getProperty("username"));
        loginPage.enterPassword(properties.getProperty("password"));
        loginPage.clickLogin();

        ProductPage productPage = new ProductPage(driver);

        productPage.addBackpackToCart();

        productPage.clickCart();

        CartPage cartPage = new CartPage(driver);

        String productName = cartPage.getProductName();

        Assert.assertEquals(productName, "Sauce Labs Backpack");

        cartPage.removeBackpack();

        boolean productDisplayed =
                cartPage.isProductDisplayed();

        Assert.assertFalse(productDisplayed);
    }
}