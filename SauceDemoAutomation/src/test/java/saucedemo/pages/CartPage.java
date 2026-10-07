package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    By productName = By.className("inventory_item_name");
    By removeButton = By.id("remove-sauce-labs-backpack");
    By cartItem = By.className("cart_item");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductName() {
        return driver.findElement(productName).getText();
    }

    public void removeBackpack() {
        driver.findElement(removeButton).click();
    }

    public boolean isProductDisplayed() {
        return driver.findElements(cartItem).size() > 0;
    }
}
