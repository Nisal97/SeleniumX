package com.seleniumx.seleniumx.base;

import function.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;
    Home home;

    @BeforeClass
    public void setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeDriver(){
        driver.quit();
    }
}
