package com.seleniumx.seleniumx.tests;

import com.seleniumx.seleniumx.base.BaseTest;
import org.testng.annotations.Test;
import function.Home;

public class siteNavigationTest extends BaseTest {

    @Test
    public void siteNavigation(){

        Home HomeFunc = new Home(driver);

        driver.get("https://automationexercise.com/");
        HomeFunc.clickSignInSignUpButton();
    }

}
