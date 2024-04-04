package PageObjectModel_cucumber_tests.stepDefinitions.Site2;

import PageObjectModel.Open_Edge_Site2_Pages.*;
import PageObjectModel_cucumber_tests.stepDefinitions.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class Site2_ForgetPassStepDef {
    SoftAssert soft_assert=new SoftAssert();
    HomePage homePage = new HomePage(Hooks.driver);
    Signinpage signinpage = new Signinpage(Hooks.driver);

    forgetpassword forgetpass = new forgetpassword(Hooks.driver);

    @Given("navigate to the site .")
    public void NavigateToTheSite(){
        Hooks.driver.navigate().to("http://automationpractice.com/index.php");
    }

    @And("click on Signin button .")
    public void clickOnSigninButton() {
        homePage.clicksigninbutn();
    }

    @And("click on forgot password")
    public void clickOnForgotPassword() {
        signinpage.clickForgotPassword();
    }

    @When("enter the valid email address")
    public void enterTheValidEmailAddress() {
        forgetpass.insertEmailAddress("m.123@gmail.com");
    }

    @Then("valid Alert")
    public void validAlert() {
        soft_assert.assertTrue(forgetpass.ValidAlert());
    }

    @When("enter the INvalid email address")
    public void enterTheINvalidEmailAddress() {
        forgetpass.insertEmailAddress("m.123@il.com");
    }

    @Then("Invalid Alert")
    public void invalidAlert() {
        soft_assert.assertTrue(forgetpass.InvalidAlert());
    }

    @And("click on RetriveButton")
    public void clickOnRetriveButton() {
        forgetpass.clickOnRetrivePasswordButton();
    }
}
