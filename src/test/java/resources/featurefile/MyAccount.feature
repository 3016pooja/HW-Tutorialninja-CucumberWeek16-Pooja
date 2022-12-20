@regression
Feature: Login Test
  As user I want to login into nop commerce website

  @smoke
Scenario: User Should Navigate To Register Page Successfully
  Given  I click on my Account
  When I click on register button
    Then I navigate to my register page


@sanity
  Scenario: User Should Navigate To Login Page Successfully
    Given  I click on my Account
    When  I click on Login Button
    Then I verify the text returning customer
@regression
    Scenario Outline: User Register Account Successfully
      Given  I click on my Account
      When  I click on register button
      And I enter firstname"<firstname>"
      And I enter lastname"<lastname>"
      And I enter emailid"<email>"
      And I enter phoneNumber"<number>"
      And I enter Password"<passowrd>"
      And I enter Confirm password"<confpassword>"
      And I click on radion button
      And I click on privacy policy box
      And I click on continue button
      And I verify the text account created
      And I click on continue button third
      And I click on my account link
      And I click on logout
      And I verify text AccountLogout
      And I click on continue button fourth

      Examples:
        |firstname |lastname|email               |number     |passowrd |confpassword|
        |messi   |Bhatt   |ppatel125@gmail.com   |0246987466|screw35678|22235678|

      Scenario: User Should Login And Logout Successfully
        Given  I click on my Account
        When  I click on Login Button
       And I clear email address
        And I enter register password
        And I click on account login button
        And I verify my accoutn text
        And I click on my account link one
        And I click on parameter logout
        And I verify my account logout text
        Then I click on continue button in end


