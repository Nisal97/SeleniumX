package com.seleniumx.seleniumx.tests;

import com.seleniumx.seleniumx.base.BaseTest;
import function.SignupLogin;
import org.testng.annotations.Test;

public class SignUpLoginTest extends BaseTest {

    @Test
    public void signUp(){
        SignupLogin signupLogin = new SignupLogin(driver);

        driver.get("https://automationexercise.com/login");
        signupLogin.signUpWithNameAndEmail("Test123","test123@qa.com");
    }
}
