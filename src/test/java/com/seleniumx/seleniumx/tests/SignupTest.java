package com.seleniumx.seleniumx.tests;

import com.seleniumx.seleniumx.base.BaseTest;
import function.Signup;
import function.SignupLogin;
import org.testng.annotations.Test;

public class SignupTest extends BaseTest {

    @Test
    public void enterInitialDetails(){
        SignupLogin signupLogin = new SignupLogin(driver);

        driver.get("https://automationexercise.com/login");
        signupLogin.signUpWithNameAndEmail("Test123","test123@qa.com");
    }

    @Test
    public void enterSignUpDetails(){
        Signup signup = new Signup(driver);

        signup.selectTitle("Mr");
    }
}
