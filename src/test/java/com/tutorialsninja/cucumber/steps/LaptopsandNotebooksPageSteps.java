package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LaptopsandNotebooksPageSteps {
    @Then("^I sort by high to low$")
    public void iSortByHighToLow() {
       new LaptopsAndNotebooksPage().sortByHighTOLow();
    }

    @And("^I select Macbook$")
    public void iSelectMacbook() {
        new LaptopsAndNotebooksPage().selectMacbook();
    }

    @And("^I verify the text Macbook$")
    public void iVerifyTheTextMacbook() {
        String  expectedMessage = "MacBook";
        String actualMessage =  new LaptopsAndNotebooksPage().verifyTxtMacBook();
        Assert.assertEquals("Verify the Text", expectedMessage, actualMessage);
    }

    @And("^I click on add to cart$")
    public void iClickOnAddToCart() {
        new LaptopsAndNotebooksPage().clikconAddToCart();
    }

    @And("^I verify the meesage added macbook on shopping cart$")
    public void iVerifyTheMeesageAddedMacbookOnShoppingCart() {

        String expectedMessage="MacBook";
        String actualMessage =  new LaptopsAndNotebooksPage().verifyTxtMacBook();
        Assert.assertEquals("Verify the Text", expectedMessage, actualMessage);

    }

    @And("^I click on shopping cart button$")
    public void iClickOnShoppingCartButton() {
        new LaptopsAndNotebooksPage().clikconAddToCart();
    }

    @And("^I verify text shopping cart for macbook$")
    public void iVerifyTextShoppingCartForMacbook() {
        String expectedMessage="Success: You have added MacBook to your shopping cart!\n" +
                "×";
        String actualMessage =  new LaptopsAndNotebooksPage().verifytextMessage();
        Assert.assertEquals("Verify the Text", expectedMessage, actualMessage);


    }
    @And("^I click on shopping cart for macbook$")
    public void iClickOnShoppingCartForMacbook() {
        new LaptopsAndNotebooksPage().clickonShoppingCart();
    }

    @And("^Iverify text product name macbook$")
    public void iverifyTextProductNameMacbook() {
        String expectedMessage="MacBook";
        String actualMessage =  new LaptopsAndNotebooksPage().verifyProdcutNameMacbook();
        Assert.assertEquals("Verify the Text", expectedMessage, actualMessage);

    }

    @And("^I send text to chang qty$")
    public void iSendTextToChangQty() {
        new LaptopsAndNotebooksPage().sendTextToChangeQty();
    }

    @And("^I click on update button$")
    public void iClickOnUpdateButton() {
        new LaptopsAndNotebooksPage().clickOnUpdateBtton();
    }

    @And("^I verify total$")
    public void iVerifyTotal() {
        new LaptopsAndNotebooksPage().verifyTotal();
    }

    @And("^I click on chek out button$")
    public void iClickOnChekOutButton() {
new LaptopsAndNotebooksPage().clickOnCheckout();
    }

    @And("^I verify text checkout$")
    public void iVerifyTextCheckout() {
        String expectedMessage="Checkout";
        String actualMessage =  new LaptopsAndNotebooksPage().verifyTextCheckOut();
        Assert.assertEquals("Verify the Text", expectedMessage, actualMessage);

    }

    @And("^I click on guest check out button$")
    public void iClickOnGuestCheckOutButton() {
        new LaptopsAndNotebooksPage().clickOnGusetCheckOut();
    }

    @And("^I click on continue Tab$")
    public void iClickOnContinueTab() {
        new LaptopsAndNotebooksPage().clickonContinueTab();
    }


    @And("^I send text to first name field \"([^\"]*)\"$")
    public void iSendTextToFirstNameField(String firstname)   {
        new LaptopsAndNotebooksPage().sendTextOnFirstNameField(firstname);
    }

    @And("^I send text to last name field \"([^\"]*)\"$")
    public void iSendTextToLastNameField(String lastname)   {
        new LaptopsAndNotebooksPage().sendTextOnLastNameField(lastname);
    }

    @And("^I send text to email  field \"([^\"]*)\"$")
    public void iSendTextToEmailField(String email)   {
        new LaptopsAndNotebooksPage().sendTextToEmailField(email);
    }

    @And("^I send text to telephone num field \"([^\"]*)\"$")
    public void iSendTextToTelephoneNumField(String number)   {
        new LaptopsAndNotebooksPage().sendTextToTelephoneNumber(number);
    }

    @And("^I send text to address  field \"([^\"]*)\"$")
    public void iSendTextToAddressField(String address)   {
        new LaptopsAndNotebooksPage().sendTextToAdress(address);
    }

    @And("^I send text to city name field \"([^\"]*)\"$")
    public void iSendTextToCityNameField(String city)   {
        new LaptopsAndNotebooksPage().sendTextToCityField(city);
    }

    @And("^I send text to postcode field \"([^\"]*)\"$")
    public void iSendTextToPostcodeField(String postcode)   {
        new LaptopsAndNotebooksPage().sendTextToPostCode(postcode);
    }

    @And("^I send text to country field \"([^\"]*)\"$")
    public void iSendTextToCountryField(String contry)   {
        new LaptopsAndNotebooksPage().selectCountry();
    }

    @And("^I send text to Zone field \"([^\"]*)\"$")
    public void iSendTextToZoneField(String arg0)   {
        new LaptopsAndNotebooksPage().selectZone();
    }

    @And("^I click on Continue button$")
    public void iClickOnContinueButton() {
        new LaptopsAndNotebooksPage().clikcOnContiuneBtton();
    }

    @And("^I add comment on order$")
    public void iAddCommentOnOrder() {
        new LaptopsAndNotebooksPage().addingCommentOnOrder();
    }

    @And("^I click on tearms and condition$")
    public void iClickOnTearmsAndCondition() {
        new LaptopsAndNotebooksPage().checkOnTearmsAndConditions();
    }

    @And("^I click on continue button second$")
    public void iClickOnContinueButtonSecond() {
        new LaptopsAndNotebooksPage().clikcOnContinueButton2();
    }

    @Then("^I verify warning message$")
    public void iVerifyWarningMessage() {
        String expectedMessage="Warning: Payment method required!\n" +
                "×";
        String actualMessage = new LaptopsAndNotebooksPage().verifyWarningMessage();
        Assert.assertEquals("Verify the Text", expectedMessage, actualMessage);

    }


}
