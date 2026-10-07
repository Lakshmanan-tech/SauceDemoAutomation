package saucedemo.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import saucedemo.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLogin() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername(properties.getProperty("username"));

        loginPage.enterPassword(properties.getProperty("password"));

        loginPage.clickLogin();

        String pageTitle = driver.findElement(
                By.className("title"))
                .getText();

        Assert.assertEquals(pageTitle, "Products");
    }
}