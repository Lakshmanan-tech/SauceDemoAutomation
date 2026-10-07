package saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import saucedemo.pages.LoginPage;
import saucedemo.pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void addProductToCart() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername(properties.getProperty("username"));
        loginPage.enterPassword(properties.getProperty("password"));
        loginPage.clickLogin();

        ProductPage productPage = new ProductPage(driver);

        productPage.addBackpackToCart();

        String cartCount = productPage.getCartCount();

        Assert.assertEquals(cartCount, "1");
    }
}