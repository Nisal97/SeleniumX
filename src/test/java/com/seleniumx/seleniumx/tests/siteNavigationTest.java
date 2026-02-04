package com.seleniumx.seleniumx.tests;

import com.seleniumx.seleniumx.base.BaseTest;
import org.testng.annotations.Test;
import function.Home;

public class siteNavigationTest extends BaseTest {

    @Test
    public void siteNavigation(){
        driver.get("https://automationexercise.com/");
        Home.clickSignInSignUpButton();
    }

}
