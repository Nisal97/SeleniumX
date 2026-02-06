package function;

import org.openqa.selenium.WebDriver;
import pages.SignupLoginPage;
import org.testng.Assert;

public class SignupLogin {

    private SignupLoginPage signupLoginPage;

    public SignupLogin(WebDriver driver){
        this.signupLoginPage = new SignupLoginPage(driver);
    }

    public void signUpWithNameAndEmail(String name, String email){
        signupLoginPage.enterSignUpName(name);
        signupLoginPage.enterSignUpEmail(email);
        signupLoginPage.clickSignUp();
        //after redirecting to new page
        signupLoginPage.isHeaderVisible();
    }

}
