package PageObjectModel.Open_Edge_Site2_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class forgetpassword {

    WebDriver driver;

    public forgetpassword(WebDriver setDriver) {
        driver = setDriver;
    }

    By emailAddressTextField= By.id("email");
    By retrievePasswordButton=By.cssSelector("button[class='btn btn-default button button-medium']");
    By validForgotAlert=By.cssSelector("p[class='alert alert-success']");
    By InvalidForgotPassAlert=By.cssSelector("div[class='alert alert-danger']");

    public void insertEmailAddress(String Email){
        driver.findElement(emailAddressTextField).sendKeys(Email);
    }
    public void clickOnRetrivePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
    }
    public boolean ValidAlert(){
        return driver.findElement(validForgotAlert).isDisplayed();
    }
    public boolean InvalidAlert(){
        return driver.findElement(InvalidForgotPassAlert).isDisplayed();
    }
}
