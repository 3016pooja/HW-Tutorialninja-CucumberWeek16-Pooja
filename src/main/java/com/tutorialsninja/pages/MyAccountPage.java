package com.tutorialsninja.pages;


import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccount;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement register;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement returningCustomerText;


    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstNameRegister;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastNameRegister;

    @CacheLookup
    @FindBy(id = "input-email")
    //WebElement emailIdRegister ;
    By emailIdRegister = By.id("input-email");

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneNumberRegister;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordRegister;
//By passwordRegister=By.id("input-password");

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPasswordRegister;
//By confirmPasswordRegister=By.id("input-confirm");

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]")
    WebElement radioButtonYes;
//By radioButtonYes=By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]");


    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
    WebElement privacyPolicyChekcBox;
//By privacyPolicyChekcBox= By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]");


    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButtonclick;
    //body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]
//By continueButtonclick=By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accontCreatedText;
//By accontCreatedText=By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton3;
//By continueButton3=By.xpath("//a[contains(text(),'Continue')]");

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]")
    WebElement MyAccountLink;
//By MyAccountLink=By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]");

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]")
    WebElement logoutButton;
//By logoutButton=By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;
//By accountLogoutText=By.xpath("//h1[contains(text(),'Account Logout')]");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton4;
//By continueButton4=By.xpath("//a[contains(text(),'Continue')]");

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement clearEmailField;
//By clearEmailField=By.id("input-email");



    @CacheLookup
    @FindBy(id = "input-password")
    WebElement yourPassword;

//By yourPassword=By.id("input-password");

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement loginButton16;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement myAccountText1;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]")
    WebElement myAccountLinkClick1;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]")
    WebElement accountLogout1;
//By accountLogout1= By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText1;
//By accountLogoutText1=By.xpath("//h1[contains(text(),'Account Logout')]");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonLast;
//By continueButtonLast=By.xpath("//a[contains(text(),'Continue')]");


    // 1.1 Clickr on My Account Link.
    public void clickOnMyAccount1() {
        clickOnElement(myAccount);
        log.info("Clicking on register link : " + myAccount.toString());

    }

    public void clikcOnRegister() {
        clickOnElement(register);
        log.info("Clicking on register link : " + register.toString());

    }

    //1.3 Verify the text “Register Account”.
    public String verifyTextRegisterAccount() {
        String message = getTextFromElement(register);
        log.info("Clicking on register link : " + register.toString());

        return message;
    }

    //2.2 click on login
    public void clikOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on register link : " + loginButton.toString());

    }

    //2.3 Verify the text “Returning Customer”.
    public String verifyTextReturningCustomer() {
        String message = getTextFromElement(returningCustomerText);
        log.info("Clicking on register link : " + returningCustomerText.toString());

        return message;
    }

    //3. 3 Enter First Name
    public void EnterYourFirstName(String frstname) {
        sendTextToElement(firstNameRegister, frstname);
        log.info("Clicking on register link : " + firstNameRegister.toString());

    }

    //3.4 Enter Last Name
    public void EnterYourLastName(String lastname) {

        sendTextToElement(lastNameRegister, lastname);
        log.info("Clicking on register link : " + lastNameRegister.toString());

    }

    //3.5 Enter Email
    public void EnterYourEmailId() {
        sendTextToElement(emailIdRegister, "ppatel125@gmail.com");
        log.info("Clicking on register link : " + emailIdRegister.toString());

    }

    //3.6 Enter Telephone
    public void EnterYourTelephoneNumber() {

        sendTextToElement(telephoneNumberRegister, "0750024589");
        log.info("Clicking on register link : " + telephoneNumberRegister.toString());

    }

    //3.7 Enter Password
    public void EnterYourPassword() {

        sendTextToElement(passwordRegister, "screw35678");
        log.info("Clicking on register link : " + passwordRegister.toString());

    }

    //3.8 Enter Password Confirm
    public void EnterYourConfirmPassword() {

        sendTextToElement(confirmPasswordRegister, "screw35678");
        log.info("Clicking on register link : " + confirmPasswordRegister.toString());

    }

    public void clikOnYesRadioButton() {
        clickOnElement(radioButtonYes);
        log.info("Clicking on register link : " + radioButtonYes.toString());

    }

    public void clickOnPrivacyPolicy() {
        clickOnElement(privacyPolicyChekcBox);
        log.info("Clicking on register link : " + privacyPolicyChekcBox.toString());

    }

    public void clickOnButtonContine() {
        clickOnElement(continueButtonclick);
        log.info("Clicking on register link : " + continueButtonclick.toString());

    }

    //3.12 Verify the message “Your Account Has Been Created!”
    public String verifyYourAccountCreatedText() {
        String message = getTextFromElement(accontCreatedText);
        log.info("Clicking on register link : " + accontCreatedText.toString());

        return message;

    }

    public void clickTheButtonContine3() {

        clickOnElement(continueButton3);
        log.info("Clicking on register link : " + continueButton3.toString());

    }

    public void clickOnMyAccountLink() {
        clickOnElement(MyAccountLink);
        log.info("Clicking on register link : " + MyAccountLink.toString());

    }

    //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
    public void clickOnLogout() {
        clickOnElement(logoutButton);
        log.info("Clicking on register link : " + loginButton.toString());

    }

    // 3.16 Verify the text “Account Logout”
    public String verifyAccountLogoutText() {
        String message = getTextFromElement(accountLogoutText);
        log.info("Clicking on register link : " + accountLogoutText.toString());

        return message;
    }

    //3.17 Click on Continue button
    public void clickOnContinueButton4() {
        clickOnElement(continueButton4);
        log.info("Clicking on register link : " + continueButton4.toString());

    }

   // public void clearemailAddress() {

        //emailaddress.sendKeys("dreammmumbai123@gmail.com");


  /*  public void clearemailAddress(){
        WebElement emailaddress = driver.findElement((By) clearEmailField);
        emailaddress.clear();
        emailaddress.sendKeys("dreammmumbai123@gmail.com");}*/

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement emailid;

  // 4.3 Enter Email address
    public void EnterEmailAdress(){
       sendTextToElement(emailid,"ppatel125@gmail.com");
    }
    //4.4 enter password
    public void enterYourRegisterPassword(){

        sendTextToElement(yourPassword,"screw35678");
        log.info("Clicking on register link : " + yourPassword.toString());

    }
    //4.6 Click on Login button
    public void clickOnAccountLoginButton(){
        clickOnElement(loginButton16);
    }
    //4.7 Verify text “My Account”
    public String verifyMyaccountText1(){
        String message=getTextFromElement(myAccountText1);
        log.info("Clicking on register link : " + myAccountText1.toString());

        return message;

    }
    // //4.8 Click on My Account Link.
    public void clickOnMyAccountLink1(){
        clickOnElement(myAccountLinkClick1);
        log.info("Clicking on register link : " + myAccountLinkClick1.toString());

    }
//4.9 pass the parameter “Logout”
    public void clickOnParameterLogout(){
        clickOnElement(accountLogout1);
    }
    // 4.10 Verify the text “Account Logout”
           public String verifyMyaccountLogoutText1(){

               String message=getTextFromElement(accountLogoutText1);
               log.info("Clicking on register link : " + accountLogoutText1.toString());

               return message;
           }
           //4.11 Click on Continue button
    public void clickOnContinueButtonInEnd(){

        clickOnElement(continueButtonLast);
        log.info("Clicking on register link : " + continueButtonLast.toString());

    }

}