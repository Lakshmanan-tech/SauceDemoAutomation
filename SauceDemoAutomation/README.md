# SauceDemo Automation Testing Project

## Project Overview

This project is a Selenium WebDriver automation framework developed using Java, TestNG, Maven, and Page Object Model (POM).

The project automates key functionalities of the SauceDemo e-commerce application, including login, product selection, cart validation, and checkout.

## Application

SauceDemo - https://www.saucedemo.com/

## Technologies Used

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* Git & GitHub
* Chrome Browser

## Automated Test Scenarios

### 1. Valid Login

* Login with valid username and password
* Verify Products page is displayed

### 2. Add Product to Cart

* Login to the application
* Add Sauce Labs Backpack to cart
* Verify cart count

### 3. Cart Validation

* Add product to cart
* Verify product name in cart
* Remove product
* Verify product is removed

### 4. Checkout

* Add product to cart
* Proceed to checkout
* Enter customer details
* Complete the order
* Verify order confirmation message

## Framework Structure

SauceDemoAutomation

├── src/test/java
│   └── saucedemo
│       ├── pages
│       │   ├── LoginPage.java
│       │   ├── ProductPage.java
│       │   ├── CartPage.java
│       │   └── CheckoutPage.java
│       │
│       └── tests
│           ├── BaseTest.java
│           ├── LoginTest.java
│           ├── ProductTest.java
│           ├── CartTest.java
│           ├── CheckoutTest.java
│           └── ScreenshotListener.java
│
├── src/test/resources
│   └── config.properties
│
├── screenshots
│   ├── validLogin.png
│   ├── addProductToCart.png
│   ├── verifyCartProduct.png
│   └── checkoutProduct.png
│
├── testng.xml
├── pom.xml
└── README.md


## Key Features

* Page Object Model (POM)
* Selenium WebDriver automation
* TestNG test execution
* Maven project structure
* Configuration using properties file
* Assertions for test validation
* Automatic screenshots after successful tests
* Reusable page classes
* Separate test and page layers

## Test Execution

Run the testng.xml file as a TestNG Suite.

Or run using Maven:

mvn test

## Test Results

All 4 automated test cases are passing successfully.

* Valid Login - PASS
* Add Product to Cart - PASS
* Cart Validation - PASS
* Checkout - PASS

Screenshots are automatically captured for each passed test and stored in the screenshots folder.

## Author

Lakshmanan C

QA / Software Testing Fresher
