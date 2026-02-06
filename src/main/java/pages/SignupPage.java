package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage extends BasePage{

    public SignupPage(WebDriver driver) {
        super(driver);
    }

//    protected By mrTitleRadioButton = By.id("id_gender1");
    protected By mrTitleRadioButton = By.xpath("//input[@id='id_gender1']//parent::div");
    protected By mrsTitleRadioButton = By.id("id_gender2");

    public void selectTitle(String title){
        if(title.equalsIgnoreCase("Mr")){
            driver.findElement(mrTitleRadioButton).click();
        }else if(title.equalsIgnoreCase("Mrs")){
            driver.findElement(mrsTitleRadioButton).click();
        }else {
            throw new IllegalArgumentException("Invalid gender title provided: " + title +". Expected 'Mr' or 'Mrs'.");
        }
    }
}
