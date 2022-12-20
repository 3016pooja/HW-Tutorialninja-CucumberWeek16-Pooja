package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(LaptopsAndNotebooksPage.class.getName());

    public LaptopsAndNotebooksPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText= "Laptops & Notebooks")
    WebElement laptopsandNotebooksclick ;
//By laptopsandNotebooksclick = By.linkText("Laptops & Notebooks");


    @CacheLookup
    @FindBy(linkText= "Show All Laptops & Notebooks")
    WebElement showAllLaptopsandBooksclick ;
//By showAllLaptopsandBooksclick=By.linkText("Show All Laptops & Notebooks");

    @CacheLookup
    @FindBy(id= "input-sort")
    WebElement shortAllPrice ;



    @CacheLookup
    @FindBy(linkText= "Price (High > Low)")
    WebElement verifyTextofPrice ;


    @CacheLookup
    @FindBy(xpath= "//a[text()='MacBook']")
    WebElement macBookselect ;


    @CacheLookup
    @FindBy(xpath= "//h1[contains(text(),'MacBook')]")
    WebElement macbookText ;


    @CacheLookup
    @FindBy(id= "button-cart")
    WebElement addtoCart ;

    @CacheLookup
    @FindBy(xpath= "//div[@class='alert alert-success alert-dismissible']")
    WebElement verifyMessage ;

    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartClic ;
//By shoppingCartClic=By.xpath("//a[contains(text(),'shopping cart')]");

    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'Shopping Cart')]")
    WebElement shopingCartText ;
//By shopingCartText=By.xpath("//a[contains(text(),'Shopping Cart')]");

    @CacheLookup
    @FindBy(xpath= "//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
    WebElement prodcutNameMacbook ;
//By prodcutNameMacbook=By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");

@FindBy(xpath= "//tbody/tr[1]/td[4]/div[1]/input[1]")
WebElement changeQty ;
    //By changeQty=By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");

    @CacheLookup
    @FindBy(xpath= "//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]")
    WebElement updateclick ;
//By updateclick=By.xpath("//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]");

    @CacheLookup
    @FindBy(xpath= "div[@class='alert alert-success alert-dismissible']")
    WebElement verifyTextForUpadte ;
//By verifyTextForUpadte=By.xpath("div[@class='alert alert-success alert-dismissible']");

    @CacheLookup
    @FindBy(xpath= "//tbody/tr[1]/td[6]")
    WebElement totalPrice ;
// totalPrice=By.xpath("//tbody/tr[1]/td[6]");

    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'Checkout')]")
    WebElement checkOut ;
// checkOut=By.xpath("//a[contains(text(),'Checkout')]");

    @CacheLookup
    @FindBy(xpath= "//h1[contains(text(),'Checkout')]")
    WebElement checkOutTxt ;
//By checkOutTxt=By.xpath("//h1[contains(text(),'Checkout')]");

    @CacheLookup
    @FindBy(xpath= "//h2[contains(text(),'New Customer')]")
    WebElement NewCustomer ;
//By NewCustomer=By.xpath("//h2[contains(text(),'New Customer')]");

    @CacheLookup
    @FindBy(xpath= "//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]")
    WebElement gusestCheckOut ;
//By gusestCheckOut=By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]");


    @CacheLookup
    @FindBy(xpath= "//input[@id='button-account']")
    WebElement continueTab ;


    @CacheLookup
    @FindBy(id= "input-payment-firstname")
    WebElement firstName ;

    @CacheLookup
    @FindBy(id= "input-payment-lastname")
    WebElement lastName ;

    @CacheLookup
    @FindBy(id= "input-payment-email")
    WebElement emailIdField ;

    @CacheLookup
    @FindBy(id= "input-payment-telephone")
    WebElement telePhoneNumberField ;

    @CacheLookup
    @FindBy(id= "input-payment-address-1")
    WebElement addressField ;
//By addressField=By.id("input-payment-address-1");

    @CacheLookup
    @FindBy(id= "input-payment-city")
    WebElement cityField ;
//By cityField=By.id("input-payment-city");

    @CacheLookup
    @FindBy(id= "input-payment-postcode")
    WebElement posrcodeField ;
//By posrcodeField=By.id("input-payment-postcode");

    @CacheLookup
    @FindBy(id= "input-payment-country")
    WebElement countryFromDeopdown ;
//By countryFromDeopdown=By.id("input-payment-country");

    @CacheLookup
    @FindBy(id= "input-payment-zone")
    WebElement zone ;
//By zone=By.id("input-payment-zone");

    @CacheLookup
    @FindBy(id= "button-guest")
    WebElement continueButton ;
//By continueButton=By.id("button-guest");

    @CacheLookup
    @FindBy(name= "comment")
    WebElement addComment ;
//By addComment=By.name("comment");

    @CacheLookup
    @FindBy(name= "agree")
    WebElement tearmsAndCondition ;
//By tearmsAndCondition=By.name("agree");

    @CacheLookup
    @FindBy(id= "button-payment-method")
    WebElement continueButton2 ;
//By continueButton2=By.id("button-payment-method");

    @CacheLookup
    @FindBy(xpath= "//div[@class='alert alert-danger alert-dismissible']")
    WebElement warningMeassage ;
//By warningMeassage=By.xpath("//div[@class='alert alert-danger alert-dismissible']");



public void mouseHoverOnLaptopandNotebook(){

    mouseHoverToElementAndClick(laptopsandNotebooksclick);
    log.info("Clicking on register link : " + laptopsandNotebooksclick.toString());

}

    public void showallLaptopsAndBook(){

        mouseHoverToElementAndClick(showAllLaptopsandBooksclick);
        log.info("Clicking on register link : " + showAllLaptopsandBooksclick.toString());

    }

    //1.3 Select Sort By "Price (High > Low)"
    public void sortByHighTOLow(){
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // Select sort by Price (High > Low)
        selectByVisibleTextFromDropDown(shortAllPrice, "Price (High > Low)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
    }
      //   1.4 Verify the Product price will arrange in High to Low order.
    public String verifyTextofPriceArranged(){
    return getTextFromElement(verifyTextofPrice);
    }
   //2. 4 Select Product “MacBook”
    public void selectMacbook(){

        mouseHoverToElementAndClick(macBookselect);
        log.info("Clicking on register link : " + macBookselect.toString());

    }
   // 2.5 Verify the text “MacBook”
    public String verifyTxtMacBook(){

        String message=getTextFromElement(macbookText);
        log.info("Clicking on register link : " + macbookText.toString());

        return message;

    }
           // 2.6 Click on ‘Add To Cart’ button
    public void clikconAddToCart(){

        clickOnElement(addtoCart);
        log.info("Clicking on register link : " + addtoCart.toString());

    }
   // 2.7 Verify the message “Success: You have added MacBook to your shopping cart!”

    public String verifytextMessage(){

        String message=getTextFromElement(verifyMessage);
        log.info("Clicking on register link : " + verifyMessage.toString());

        return message;
    }

    public void clickonShoppingCart(){

        clickOnElement(shoppingCartClic);
        log.info("Clicking on register link : " + shoppingCartClic.toString());

    }
//2.9 Verify the text "Shopping Cart"
    public String verifyShoppingCart1(){

        String message=getTextFromElement(shopingCartText);
        log.info("Clicking on register link : " + shopingCartText.toString());

        return message;

    }

           // 2.10 Verify the Product name "MacBook"
    public String verifyProdcutNameMacbook() {

        String message=getTextFromElement(prodcutNameMacbook);
        log.info("Clicking on register link : " + prodcutNameMacbook.toString());

        return message;
    }
    //2.11 Change Quantity "2"
    public void sendTextToChangeQty(){
        driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]")).clear();
        sendTextToElement(changeQty, "2");
        log.info("Clicking on register link : " + changeQty.toString());
    }
public void clickOnUpdateBtton(){

    clickOnElement(updateclick);
    log.info("Clicking on register link : " + updateclick.toString());
}
    public String verifyMessageForShoppingCart(){
    return getTextFromElement(verifyTextForUpadte);
    }

    public String verifyTotal(){

        String message=getTextFromElement(totalPrice);
        log.info("Clicking on register link : " + totalPrice.toString());
        return message;
    }

    public void clickOnCheckout(){

        clickOnElement(checkOut);
        log.info("Clicking on register link : " + checkOut.toString());
    }
   // 2.16 Verify the text “Checkout”
   public String verifyTextCheckOut(){

       String message=getTextFromElement(checkOutTxt);
       log.info("Clicking on register link : " + checkOutTxt.toString());
       return message;
   }
            //2.17 Verify the Text “New Customer”
            public String verifyTextNewCustomer() {
                return getTextFromElement(NewCustomer);
            }
           // 2.18 Click on “Guest Checkout” radio button
    public void clickOnGusetCheckOut(){
        clickOnElement(gusestCheckOut);
        log.info("Clicking on register link : " + gusestCheckOut.toString());
    }

//2.19 Click on “Continue” tab
    public void clickonContinueTab(){
    clickOnElement(continueTab);
        log.info("Clicking on register link : " + continueTab.toString());
    }
public void sendTextOnFirstNameField(String username){
    sendTextToElement(firstName,username);
    log.info("Clicking on register link : " + firstName.toString());

}
    public void sendTextOnLastNameField(String  lasna) {
    sendTextToElement(lastName, lasna);
        log.info("Clicking on register link : " + lastName.toString());


    }
public void sendTextToEmailField(String email){
    sendTextToElement(emailIdField,email);
    log.info("Clicking on register link : " + emailIdField.toString());


}
public void sendTextToTelephoneNumber(String number){
    sendTextToElement(telePhoneNumberField,number);
    log.info("Clicking on register link : " + telePhoneNumberField.toString());


}
public void sendTextToAdress(String add){
    sendTextToElement(addressField,add);
    log.info("Clicking on register link : " + addressField.toString());

}
public void sendTextToCityField(String  town){
    sendTextToElement(cityField,town);
    log.info("Clicking on register link : " + cityField.toString());


}
public void sendTextToPostCode(String  zipcode){
    sendTextToElement(posrcodeField,zipcode);
    log.info("Clicking on register link : " + posrcodeField.toString());


}
   public void selectCountry(){
       selectByVisibleTextFromDropDown(countryFromDeopdown,"Aaland Islands");
       log.info("Clicking on register link : " + countryFromDeopdown.toString());


   }
   public void selectZone(){
       selectByVisibleTextFromDropDown(zone,"--- None --- ");
       log.info("Clicking on register link : " + zone.toString());


   }
    public void clikcOnContiuneBtton(){
    clickOnElement(continueButton);
        log.info("Clicking on register link : " + continueButton.toString());

    }
    public void addingCommentOnOrder(){
        sendTextToElement(addComment,"Please consider my order ASAP");
        log.info("Clicking on register link : " + addComment.toString());

    }

   public void checkOnTearmsAndConditions(){
       clickOnElement(tearmsAndCondition);
       log.info("Clicking on register link : " + tearmsAndCondition.toString());

   }

    public void clikcOnContinueButton2(){

    clickOnElement(continueButton2);
        log.info("Clicking on register link : " + continueButton2.toString());

    }

    public String verifyWarningMessage(){
    String message=getTextFromElement(warningMeassage);
        log.info("Clicking on register link : " + warningMeassage.toString());

        return message;
    }


}
