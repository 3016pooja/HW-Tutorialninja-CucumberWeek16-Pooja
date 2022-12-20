@regression
Feature: Login Test
  As user I want to login into nop commerce website
@smoke
Scenario: User Should Navigate To Desktops Page Successfully
  Given I am on desktopapge and click
   When I click on show all desktops and click
  Then I verify on the page successfully

@sanity
  Scenario: User Should Navigate To Laptops And NotebooksPage Successfully
    Given I am on laptop and noteboks page
    When I click on show all laptops and notebooks click
    Then I verify the  text all the laptops and note books

  Scenario: User Should Navigate To Components Page Successfully
    Given I am on Components Page
    When I am click on show all components
    Then I verify the text components

