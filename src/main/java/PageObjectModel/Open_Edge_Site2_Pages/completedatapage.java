package PageObjectModel.Open_Edge_Site2_Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class completedatapage {
    WebDriver driver;


    public completedatapage(WebDriver setDriver) {
        driver = setDriver;
    }

    By gendermale = By.id("id_gender1");
    By genderfemale = By.id("id_gender2");
    By firstname = By.id("customer_firstname");
    By lasttname = By.id("customer_lastname");
    //By settemail = By.id("email");
    By passwordd = By.id("passwd");
    By days = By.id("days");
    By months = By.id("months");
    By years = By.id("years");
    By newsletter = By.id("newsletter");
    By offerr = By.id("optin");
    By addfirstname = By.id("firstname");
    By addlasttname = By.id("lastname");
    By companyy = By.id("company");
    By address1 = By.id("address1");
    By address2 = By.id("address2");
    By city = By.id("city");
    By statee = By.id("id_state");
    By postcodee = By.id("postcode");
    By countryy = By.id("id_country");
    By infoo = By.id("other");
    By homephonee = By.id("phone");
    By mobilephonee = By.id("phone_mobile");
    By aliasaddresss = By.id("alias");
    By regesterbutn = By.id("submitAccount");

    public void choosegendermale(){
        driver.findElement(gendermale).click();
    }
    public void choosegenderfemale(){
        driver.findElement(genderfemale).click();
    }
    public void setinformations(String firstnamme,String lastname, String password, String dayss,String monthss,String yearss){
        driver.findElement(firstname).sendKeys(firstnamme);
        driver.findElement(lasttname).sendKeys(lastname);
        //driver.findElement(settemail).sendKeys(email);
        driver.findElement(passwordd).sendKeys(password);
        Select select = new Select(driver.findElement(days));
        select.selectByValue(dayss);
        Select select2 = new Select(driver.findElement(months));
        select2.selectByValue(monthss);
        Select select3 = new Select(driver.findElement(years));
        select3.selectByValue(yearss);
    }

    public void signupnewsteller (){
        driver.findElement(newsletter).click();
    }

    public void signupofferr (){
        driver.findElement(offerr).click();
    }

    public void setaddressinformations(String firstnamme,String lastname,String company, String addresss1, String addresss2,String cityy,String state,String zip,String country,String info,String phone,String mobile,String alias){
        driver.findElement(addfirstname).sendKeys(firstnamme);
        driver.findElement(addlasttname).sendKeys(lastname);
        driver.findElement(companyy).sendKeys(company);
        driver.findElement(address1).sendKeys(addresss1);
        driver.findElement(address2).sendKeys(addresss2);
        driver.findElement(city).sendKeys(cityy);
        Select select5 = new Select(driver.findElement(statee));
        select5.selectByValue(state);
        Select select6 = new Select(driver.findElement(countryy));
        select6.selectByValue(country);
        driver.findElement(infoo).sendKeys(info);
        driver.findElement(homephonee).sendKeys(phone);
        driver.findElement(mobilephonee).sendKeys(mobile);
        driver.findElement(postcodee).sendKeys(zip);
        driver.findElement(aliasaddresss).sendKeys(alias);
    }

    public void clickonregester(){
        driver.findElement(regesterbutn).click();
    }
}
