package PageObjectModel_cucumber_tests.stepDefinitions.Site2;

import PageObjectModel.Open_Edge_Site2_Pages.*;
import PageObjectModel_cucumber_tests.stepDefinitions.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class Site2_SignupStepDef {
    SoftAssert soft_assert=new SoftAssert();
    HomePage homePage = new HomePage(Hooks.driver);
    Signinpage signinpage = new Signinpage(Hooks.driver);
    completedatapage regesterpage = new completedatapage(Hooks.driver);
    myaccount myaccountpage = new myaccount(Hooks.driver);
    wrongdatawarning alertpage = new wrongdatawarning(Hooks.driver);

    @Given("user navigate to HOMEPAGE")
    public void userNavigateToHOMEPAGE() {
        Hooks.driver.navigate().to("http://automationpractice.com/index.php");
    }

    @And("user click on sign in button")
    public void userClickOnSignInButton() {
        homePage.clicksigninbutn();
    }

    @And("user type his email")
    public void UserTypeHisEmail() {
        signinpage.setemaill("mohamedmen3m@gmail.com");
    }

    @And("user type his Email")
    public void userTypeHisEmail() { signinpage.setemaill("men3emmohamed@gmail.com");
    }

    @When("user click on create an account button Button")
    public void userClickOnCreateAnAccountButtonButton() {
        signinpage.clickcreate();
    }

    @And("user insert personal data.")
    public void userInsertPersonalData() {
        regesterpage.choosegendermale();
        regesterpage.signupnewsteller();
        regesterpage.signupofferr();
        regesterpage.setinformations("mazen","alaaelsin", "secrest","1","12","2014");
    }


    @And("user insert address data")
    public void userInsertAddressData() {
        regesterpage.setaddressinformations("mezoo","jehad","amit","nasrcity","makram","cairo","6","11223","21","noinfoo","24095700","0111234456","jdjhgjjhjg");
    }

    @And("user insert invalid address data")
    public void userInsertInvalidAddressData() {
        regesterpage.setaddressinformations("mezoo","jehad","amit","nasrdfcity","madfkram","cairo","6","11223","21","noinfoo","dgdgdg","dgfgdfg","jdjhgjjhjg");
    }

    @And("user click on register button")
    public void userClickOnRegisterButton() {
        regesterpage.clickonregester();
    }

    @Then("user signed up successfully")
    public void userSignedUpSuccessfully() {
        soft_assert.assertTrue(myaccountpage.isorderhistorydisplayed());
        soft_assert.assertTrue(myaccountpage.welcomemsgdisplayed());
        soft_assert.assertAll();
    }

    @Then("user could not signed up to the site")
    public void userCouldNotSignedUpToTheSite() {
        soft_assert.assertTrue(alertpage.isalertdisplayed());
        soft_assert.assertAll();
    }

}
