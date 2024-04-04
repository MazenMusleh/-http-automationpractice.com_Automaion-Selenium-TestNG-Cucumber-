package PageObjectModel.Open_Edge_Site2_Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Signinpage {

    WebDriver driver;

    public Signinpage(WebDriver setDriver) {
        driver = setDriver;
    }

    By setmail = By.id("email_create");
    By createbutn = By.id("SubmitCreate");
    By EmailForSignInTextField=By.id("email");
    By passwordTextField=By.id("passwd");
    By signInButton=By.id("SubmitLogin");
    By fieldInSignInAlert=By.cssSelector("div[class='alert alert-danger']");
    By forgotPassword=By.cssSelector("a[href='http://automationpractice.com/index.php?controller=password']");

    public void setemaill (String mail){
        driver.findElement(setmail).sendKeys(mail);
    }

    public void clickcreate(){
        driver.findElement(createbutn).click();
    }

    public void insertEmailForSignIn(String Email){
        driver.findElement(EmailForSignInTextField).sendKeys(Email);
    }
    public void insertPassword(String Pass){
        driver.findElement(passwordTextField).sendKeys(Pass);
    }
    public void clickSignIn(){
        driver.findElement(signInButton).click();
    }
    public boolean alartFieldInSignIn(){
        return driver.findElement(fieldInSignInAlert).isDisplayed();
    }
    public void clickForgotPassword(){
        driver.findElement(forgotPassword).click();
    }
}
