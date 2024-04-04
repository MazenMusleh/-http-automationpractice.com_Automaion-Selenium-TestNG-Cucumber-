package PageObjectModel.Open_Edge_Site2_Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class wrongdatawarning {

    WebDriver driver;

    public wrongdatawarning(WebDriver setDriver) {
        driver = setDriver;
    }

    By alertt = By.cssSelector("div[class='alert alert-danger']");

    public boolean isalertdisplayed (){
       return driver.findElement(alertt).isDisplayed();
    }
}
