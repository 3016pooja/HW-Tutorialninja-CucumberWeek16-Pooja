@regression
Feature: Login Test
  As user I want to login into nop commerce website
@smoke
Scenario: User Should Product Arrange In AlphaBatical Order
  Given I am on desktopapge and click
   When I click on show all desktop
  Then I Select Sort By position Name: Z to A

@sanity
  Scenario: User Should Added To ShoppingCart SuccessFully
  Given I am on desktopapge and click
  When I click on show all desktop
    And I Select Sort By position Name: A to z
  And I select HPlaptop
  And I verify the text for laptop
  And I select the Delivery Date
  And I send the qty
  And I click on add to cart button
  And I verify the message product added
  And I click on shopping cart
  And I verify the text shopping cart
  And I verify the product name
 And I verify the delivery date
  And I verify the model
  Then I verify the the text price


