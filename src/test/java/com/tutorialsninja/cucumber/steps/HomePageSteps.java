package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageSteps {
    @When("^I click on show all desktops and click$")
    public void iClickOnShowAllDesktopsAndClick() {
        new HomePage().clickOnShowAllTheDesktops();
    }

    @Then("^I verify on the page successfully$")
    public void iVerifyOnThePageSuccessfully() {
        String  expectedMessage = "Desktops";
        String actualMessage = new HomePage().verifyText();
        Assert.assertEquals("Verify the Text", expectedMessage, actualMessage);

    }

    @Given("^I am on laptop and noteboks page$")
    public void iAmOnLaptopAndNoteboksPage() {
       new HomePage(). mouseHoverOnLaptopAndNoteBooks();
    }

    @When("^I click on show all laptops and notebooks click$")
    public void iClickOnShowAllLaptopsAndNotebooksClick() {
        new HomePage().clickOnShowAllLaptopsAndNoteBooksClick();
    }

    @Then("^I verify the  text all the laptops and note books$")
    public void iVerifyTheTextAllTheLaptopsAndNoteBooks() {
        String  expectedMessage = "Laptops & Notebooks";
        String actualMessage = new HomePage().verifyText1();
        Assert.assertEquals("Verify the Text", expectedMessage, actualMessage);
    }

    @Given("^I am on Components Page$")
    public void iAmOnComponentsPage() {
        new HomePage().mouseHoverOnComponents();
    }

    @When("^I am click on show all components$")
    public void iAmClickOnShowAllComponents() {
        new HomePage().clickOnShowAllComponents();
    }


    @Then("^I verify the text components$")
    public void iVerifyTheTextComponents() {
        String  expectedMessage = "Components";
        String actualMessage =  new HomePage().VerifyText2();
        Assert.assertEquals("Verify the Text", expectedMessage, actualMessage);

    }
}
