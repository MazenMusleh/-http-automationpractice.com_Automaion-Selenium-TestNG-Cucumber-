package PageObjectModel_cucumber_tests.stepDefinitions.Site2;

import PageObjectModel.Open_Edge_Site2_Pages.HomePage;
import PageObjectModel.Open_Edge_Site2_Pages.Signinpage;
import PageObjectModel.Open_Edge_Site2_Pages.myaccount;
import PageObjectModel_cucumber_tests.stepDefinitions.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class Site2_LoginStepDef {

    HomePage homePage=new HomePage(Hooks.driver);
    Signinpage signInPage=new Signinpage(Hooks.driver);
    myaccount myaccountpage = new myaccount(Hooks.driver);
    SoftAssert soft_assert=new SoftAssert();

    @Given("navigate to the site")
    public void navigateToTheSite(){
        Hooks.driver.navigate().to("http://automationpractice.com/index.php");
    }

    @And("click on Signin button")
    public void clickOnSigninButton() {
        homePage.clicksigninbutn();
    }

    @When("insert valid Email Address")
    public void insertValidEmailAddress() {
        signInPage.insertEmailForSignIn("m.123@gmail.com");
    }

    @And("insert valid password")
    public void insertValidPassword() {
        signInPage.insertPassword("m.123@gmail.com");
    }

    @And("click on Sign in buttonn")
    public void clickOnSignInButtonn() {
        signInPage.clickSignIn();
    }

    @Then("Sign Up successfull must appeaer my account")
    public void signUpSuccessfullMustAppeaerMyAccount() {
        soft_assert.assertTrue(myaccountpage.isorderhistorydisplayed());
        soft_assert.assertTrue(myaccountpage.welcomemsgdisplayed());
        soft_assert.assertAll();
    }

    @When("insert Invalid Email Address")
    public void insertInvalidEmailAddress() {
        signInPage.insertEmailForSignIn("m.12mail.com");
    }

    @And("insert Invalid password")
    public void insertInvalidPassword() {
        signInPage.insertPassword("m.123@ssl.com");
    }

    @Then("Sign in alart must appeaer")
    public void signInAlartMustAppeaer() {
        soft_assert.assertTrue(signInPage.alartFieldInSignIn());
    }
}
