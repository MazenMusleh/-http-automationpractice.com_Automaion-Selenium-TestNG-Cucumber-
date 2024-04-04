package PageObjectModel.Open_Edge_Site2_Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver setDriver) {
        driver = setDriver;
    }

    By signinbutn = By.className("login");

    public void clicksigninbutn(){
        driver.findElement(signinbutn).click();
    }

}
