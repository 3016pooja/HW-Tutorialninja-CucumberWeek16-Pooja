package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DesktopSteps {

    @Given("^I am on desktopapge and click$")
    public void iAmOnDesktopapgeAndClick() {
        new HomePage().mouseHoverOnDesktop();
    }

    @When("^I click on show all desktop$")
    public void iClickOnShowAllDesktop() {
        new HomePage().clickOnShowAllTheDesktops();
    }

    @And("^I Select Sort By position Name: Z to A$")
    public void iSelectSortByPositionNameZToA() {
        new DesktopsPage().sortByNameZtoA1("Name (Z - A)");
    }


    @And("^I Select Sort By position Name: A to z$")
    public void iSelectSortByPositionNameAToZ() {
        new DesktopsPage().sorybyAtoZ1("Name (A - Z)");
    }

    @And("^I select HPlaptop$")
    public void iSelectHPlaptop() {
        new DesktopsPage().selectHPLaptop();
    }


    @And("^I verify the text for laptop$")
    public void iVerifyTheTextForLaptop() {
        String expectedMessage = "HP LP3065";
        String actualMessage = new DesktopsPage().verifyTheTextForHpLaptop();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }

    @And("^I select the Delivery Date$")
    public void iSelectTheDeliveryDate() {
        new DesktopsPage().selectDeliveryDate();
    }

    @And("^I send the qty$")
    public void iSendTheQty() {
        new DesktopsPage().sendQty(" ");
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new DesktopsPage(). clickOnAddTOcartBtton();
    }

    @And("^I verify the message product added$")
    public void iVerifyTheMessageProductAdded() {
        String  expectedMessage = "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×";
        String actualMessage = new DesktopsPage().verifYMessageSuceessfullyAdded();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }

    @And("^I click on shopping cart$")
    public void iClickOnShoppingCart() {
        new DesktopsPage().clikconShoppinCart();

    }

    @And("^I verify the text shopping cart$")
    public void iVerifyTheTextShoppingCart() {
        String  expectedMessage = "Shopping Cart";
        String actualMessage = new DesktopsPage().verifyTxtShopingCart();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }

    @And("^I verify the product name$")
    public void iVerifyTheProductName() {
        String  expectedMessage = "HP LP3065";
        String actualMessage = new DesktopsPage().verifyProductNamee();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }

    @And("^I verify the delivery date$")
    public void iVerifyTheDeliveryDate() {
        String  expectedMessage = "Delivery Date: 2011-04-22";
        String actualMessage = new DesktopsPage().verifyDelviertDate();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }

    @And("^I verify the model$")
    public void iVerifyTheModel() {
        String  expectedMessage = "Product 21";
        String actualMessage = new DesktopsPage().verifyModel();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }



    @Then("^I verify the the text price$")
    public void iVerifyTheTheTextPrice() {
        String  expectedMessage = "$122.00";
        String actualMessage = new DesktopsPage().verifyTotalPrice();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }
}
