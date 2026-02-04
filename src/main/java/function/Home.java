package function;

import pages.HomePage;
import org.openqa.selenium.WebDriver;

public class Home extends HomePage {

    public Home(WebDriver driver) {
        super(driver);// ✅ mandatory
    }

    public static void clickSignInSignUpButton(){
        clickLoginPage();
        System.out.println("Navigating to Signup / Login Page");
    }
}
