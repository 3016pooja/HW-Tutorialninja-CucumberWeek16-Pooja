package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.pages.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyAccountSteps {
    @Given("^I click on my Account$")
    public void iClickOnMyAccount() {
        new MyAccountPage().clickOnMyAccount1();
    }

    @When("^I click on register button$")
    public void iClickOnRegisterButton() {
        new MyAccountPage().clikcOnRegister();
    }
    @Then("^I navigate to my register page$")
    public void iNavigateToMyRegisterPage() {
    }


    @When("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new MyAccountPage().clikOnLoginButton();
    }

    @Then("^I verify the text returning customer$")
    public void iVerifyTheTextReturningCustomer() {
        String expectedMessage="Returning Customer";
        String actualMessage = new MyAccountPage().verifyTextReturningCustomer();
        Assert.assertEquals("Verify the Text", expectedMessage, actualMessage);
    }

    @And("^I enter firstname\"([^\"]*)\"$")
    public void iEnterFirstname(String firstname) {
      new MyAccountPage().  EnterYourFirstName(firstname);
    }

    @And("^I enter lastname\"([^\"]*)\"$")
    public void iEnterLastname(String lastname) {
        new MyAccountPage().EnterYourLastName(lastname);
    }

    @And("^I enter emailid\"([^\"]*)\"$")
    public void iEnterEmailid(String email){
        new MyAccountPage().EnterYourEmailId();

    }

    @And("^I enter phoneNumber\"([^\"]*)\"$")
    public void iEnterPhoneNumber(String arg0)  {
        new MyAccountPage().EnterYourTelephoneNumber();
    }

    @And("^I enter Password\"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new MyAccountPage().EnterYourPassword();
    }

    @And("^I enter Confirm password\"([^\"]*)\"$")
    public void iEnterConfirmPassword(String conpassw)  {
        new MyAccountPage().EnterYourConfirmPassword();
    }

    @And("^I click on radion button$")
    public void iClickOnRadionButton() {
        new MyAccountPage().clikOnYesRadioButton();
    }

    @And("^I click on privacy policy box$")
    public void iClickOnPrivacyPolicyBox() {
        new MyAccountPage().clickOnPrivacyPolicy();
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new MyAccountPage().clickOnButtonContine();
    }

    @And("^I verify the text account created$")
    public void iVerifyTheTextAccountCreated() {
        String expectedMessage="Your Account Has Been Created!";
        String actualMessage = new MyAccountPage().verifyYourAccountCreatedText();
        Assert.assertEquals("Verify the Text", expectedMessage, actualMessage);

    }

    @And("^I click on continue button third$")
    public void iClickOnContinueButtonThird() {
        new MyAccountPage().clickTheButtonContine3();
    }

    @And("^I click on my account link$")
    public void iClickOnMyAccountLink() {
        new MyAccountPage().clickOnMyAccountLink();
    }

    @And("^I click on logout$")
    public void iClickOnLogout() {
        new MyAccountPage().clickOnLogout();
    }

    @And("^I verify text AccountLogout$")
    public void iVerifyTextAccountLogout() {
        String expectedMessage="Account Logout";
        String actualMessage =  new MyAccountPage().verifyAccountLogoutText();
        Assert.assertEquals("Verify the Text", expectedMessage, actualMessage);

    }

    @And("^I click on continue button fourth$")
    public void iClickOnContinueButtonFourth() {
        new MyAccountPage().clickOnContinueButton4();
    }

    @And("^I clear email address$")
    public void iClearEmailAddress() {
        new MyAccountPage().EnterEmailAdress();
    }

    @And("^I enter register password$")
    public void iEnterRegisterPassword() {
        new MyAccountPage().enterYourRegisterPassword();
    }

    @And("^I click on account login button$")
    public void iClickOnAccountLoginButton() {
        new MyAccountPage().clickOnAccountLoginButton();
    }

    @And("^I verify my accoutn text$")
    public void iVerifyMyAccoutnText() {
        String expectedMessage="My Account";
        String actualMessage =  new MyAccountPage().verifyMyaccountText1();
        Assert.assertEquals("Verify the Text", expectedMessage, actualMessage);

    }

    @And("^I click on my account link one$")
    public void iClickOnMyAccountLinkOne() {
        new MyAccountPage().clickOnMyAccountLink1();
    }

    @And("^I click on parameter logout$")
    public void iClickOnParameterLogout() {
        new MyAccountPage().clickOnParameterLogout();
    }

    @And("^I verify my account logout text$")
    public void iVerifyMyAccountLogoutText() {
        String expectedMessage="Account Logout";
        String actualMessage =   new MyAccountPage().verifyMyaccountLogoutText1();
        Assert.assertEquals("Verify the Text", expectedMessage, actualMessage);

    }

    @Then("^I click on continue button in end$")
    public void iClickOnContinueButtonInEnd() {
        new MyAccountPage().clickOnContinueButtonInEnd();
    }


}
