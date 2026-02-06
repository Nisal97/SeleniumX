package function;

import pages.HomePage;
import org.openqa.selenium.WebDriver;

public class Home {

    private HomePage homePage;

    public Home(WebDriver driver) {
        this.homePage = new HomePage(driver);
    }

    public void clickSignInSignUpButton(){
        homePage.clickLoginPage();
        System.out.println("Navigating to Signup / Login Page");
    }
}
