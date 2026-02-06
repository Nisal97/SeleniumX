package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);   // ✅ mandatory
    }

    protected By loginButton = By.xpath("//a[contains(text(),' Signup / Login')]");

    public void clickLoginPage(){
        driver.findElement(loginButton).click();
    }
}
