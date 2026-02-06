package function;

import org.openqa.selenium.WebDriver;
import pages.SignupPage;

public class Signup {

    private SignupPage signupPage;

    public Signup(WebDriver driver){
        this.signupPage = new SignupPage(driver);
    }

    public void selectTitle(String title){
        signupPage.selectTitle(title);
    }
}
