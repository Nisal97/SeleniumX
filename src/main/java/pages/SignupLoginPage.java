package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupLoginPage extends BasePage{

    public SignupLoginPage(WebDriver driver) {
        super(driver);
    }

    protected By signUpNameTextBox = By.xpath("//input[@data-qa='signup-name']");
    protected By signupEmailTextBox = By.xpath("//input[@data-qa='signup-email']");
    protected By signUpButton = By.xpath("//button[@data-qa='signup-button']");

    protected By loginEmailTextbox = By.xpath("//input[@data-qa='login-email']");
    protected By loginPasswordTextbox = By.xpath("//input[@data-qa='login-password']");
    protected By loginButton = By.xpath("//button[@data-qa='login-button']");

    protected By accountInfoHeader = By.xpath("//b[contains(text(), 'Enter Account Information')]");

    public void enterSignUpName(String name){
        driver.findElement(signUpNameTextBox).sendKeys(name);
    }

    public void enterSignUpEmail(String email){
        driver.findElement(signupEmailTextBox).sendKeys(email);
    }

    public void clickSignUp(){
        driver.findElement(signUpButton).click();
    }

    public String getPageTitle(){
        String title = driver.getTitle();
        return title;
    }

    public void isHeaderVisible(){
        driver.findElement(accountInfoHeader).isDisplayed();
    }

}
