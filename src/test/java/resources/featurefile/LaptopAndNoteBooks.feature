@regression
Feature: Login Test
  As user I want to login into nop commerce website
  @smoke
Scenario: User verify Products Price Display High To Low Successfully
  Given I am on laptop and noteboks page
  When I click on show all laptops and notebooks click
  Then I sort by high to low

@sanity
  Scenario Outline: User should Place Order Successfully
    Given I am on laptop and noteboks page
    When I click on show all laptops and notebooks click
    And I sort by high to low
    And I select Macbook
    And I verify the text Macbook
    And I click on add to cart
    And I verify the meesage added macbook on shopping cart
    And I click on shopping cart for macbook
#    And I verify text shopping cart for macbook
    And I send text to chang qty
    And I click on update button
    And I verify total
    And I click on chek out button
    And I verify text checkout
    And I click on guest check out button
    And I click on continue Tab
    And I send text to first name field "<firstname>"
    And I send text to last name field "<lastname>"
    And I send text to email  field "<email>"
    And I send text to telephone num field "<phone>"
    And I send text to address  field "<Address>"
    And I send text to city name field "<city>"
    And I send text to postcode field "<postcode>"
    And I send text to country field "<Nation>"
   And I send text to Zone field "<zone>"
  And I click on Continue button
  And I add comment on order
  And I click on tearms and condition
  And I click on continue button second
  Then I verify warning message

    Examples:
    |firstname |lastname|email                   |phone     |Address   |city   |postcode |Nation|zone   |
    |rajvia     |Bhatt   |girshma3@gmail.com     |0246987466|25 romley |chennai|wd45hg   |India |south |





