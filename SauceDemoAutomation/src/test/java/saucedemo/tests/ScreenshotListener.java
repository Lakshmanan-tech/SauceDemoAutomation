package saucedemo.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.apache.commons.io.FileUtils;

public class ScreenshotListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {

        BaseTest baseTest = (BaseTest) result.getInstance();

        TakesScreenshot screenshot =
                (TakesScreenshot) baseTest.driver;

        File source = screenshot.getScreenshotAs(OutputType.FILE);

        File destination = new File(
                "screenshots/" + result.getName() + ".png");

        try {
            FileUtils.copyFile(source, destination);
            System.out.println(
                    "Screenshot saved: " + destination.getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
