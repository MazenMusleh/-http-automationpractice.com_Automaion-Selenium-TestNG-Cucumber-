package PageObjectModel.Open_Edge_Site2_Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myaccount {
    WebDriver driver;

    public myaccount(WebDriver setDriver) {
        driver = setDriver;
    }

    By orderhistory = By.cssSelector("a[href='http://automationpractice.com/index.php?controller=history'");
    By welcomemsg = By.cssSelector("p[class='info-account']");

    public boolean isorderhistorydisplayed (){
        return driver.findElement(orderhistory).isDisplayed();
    }

    public boolean welcomemsgdisplayed (){
        return driver.findElement(welcomemsg).isDisplayed();
    }
}
