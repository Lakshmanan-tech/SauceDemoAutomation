package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    By backpack = By.id("add-to-cart-sauce-labs-backpack");
    By cartBadge = By.className("shopping_cart_badge");
    By cartLink = By.className("shopping_cart_link");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addBackpackToCart() {
        driver.findElement(backpack).click();
    }

    public String getCartCount() {
        return driver.findElement(cartBadge).getText();
    }

    public void clickCart() {
        driver.findElement(cartLink).click();
    }
}
