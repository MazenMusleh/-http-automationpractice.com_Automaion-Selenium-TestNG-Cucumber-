package PageObjectModel_tests.test_cases_Site2;

import PageObjectModel.Open_Edge_Site2_Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Open_Edge2 {
    WebDriver driver;
    SoftAssert soft_assert;

    HomePage homePage;
    Signinpage signinpage;
    completedatapage regesterpage ;
    myaccount myaccountpage;
    wrongdatawarning alertpage;



    @BeforeMethod
    public void Open_Browser(){
        WebDriverManager.edgedriver().setup();

        driver=new EdgeDriver();

        soft_assert=new SoftAssert();

        homePage = new HomePage(driver);
        signinpage = new Signinpage(driver);
        regesterpage = new completedatapage(driver);
        myaccountpage = new myaccount(driver);
        alertpage = new wrongdatawarning(driver);


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("http://automationpractice.com/index.php");

    }

    @Test()
    public void loginvalid_pattern(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("row")));
        homePage.clicksigninbutn();
        signinpage.setemaill("jehad11299@gmail.com");
        signinpage.clickcreate();
        regesterpage.choosegendermale();
        regesterpage.signupnewsteller();
        regesterpage.signupofferr();
        regesterpage.setinformations("mazen","alaaelsin", "secrest","1","12","2014");
        regesterpage.setaddressinformations("mezoo","jehad","amit","nasrcity","makram","cairo","6","11223","21","noinfoo","24095700","0111234456","jdjhgjjhjg");
        regesterpage.clickonregester();
        soft_assert.assertTrue(myaccountpage.isorderhistorydisplayed());
        soft_assert.assertTrue(myaccountpage.welcomemsgdisplayed());
        soft_assert.assertAll();
    }

    @Test()
    public void logininvalid_pattern(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("row")));
        homePage.clicksigninbutn();
        signinpage.setemaill("jehad2@gmail.com");
        signinpage.clickcreate();
        regesterpage.choosegendermale();
        regesterpage.signupnewsteller();
        regesterpage.signupofferr();
        regesterpage.setinformations("mazen","alaaelsin", "secrest","1","12","2014");
        regesterpage.setaddressinformations("mezoo","jehad","amit","nasrdfcity","madfkram","cairo","6","11223","21","noinfoo","dgdgdg","dgfgdfg","jdjhgjjhjg");
        regesterpage.clickonregester();
        soft_assert.assertTrue(alertpage.isalertdisplayed());
        soft_assert.assertAll();
    }

    @AfterMethod
    public void quitDriver() throws InterruptedException{
        System.out.println("method to quit driver after execution");
        Thread.sleep(2500);
        driver.quit();
    }}

