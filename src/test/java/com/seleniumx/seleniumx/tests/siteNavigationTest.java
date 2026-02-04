package com.seleniumx.seleniumx.tests;

import com.seleniumx.seleniumx.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import function.Home;

public class siteNavigationTest extends BaseTest {

    @Test
    public void siteNavigation(){
        driver.get("https://automationexercise.com/");
        Home.clickSignInSignUpButton();
    }

}
