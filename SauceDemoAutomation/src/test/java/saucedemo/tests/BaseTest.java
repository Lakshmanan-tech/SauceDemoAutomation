package saucedemo.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    WebDriver driver;

    static Properties properties = new Properties();

    @BeforeSuite
    public void beforeSuite() throws IOException {

        FileInputStream file = new FileInputStream(
                "src/test/resources/config.properties");

        properties.load(file);

        System.out.println("=== SauceDemo Test Suite Started ===");
    }

    @BeforeTest
    public void beforeTest() {

        System.out.println("=== SauceDemo Tests Started ===");
    }

    @BeforeClass
    public void setUpClass() {

        driver = new ChromeDriver();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void setUpMethod() {

        driver.get(properties.getProperty("url"));
    }

    @AfterClass
    public void tearDownClass() {

        driver.quit();
    }
}