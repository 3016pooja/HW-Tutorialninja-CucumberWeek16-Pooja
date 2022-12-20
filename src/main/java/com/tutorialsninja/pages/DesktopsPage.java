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

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(linkText= "Desktops")
    WebElement desktopClick ;
   // By desktopClick = By.linkText("Desktops");
    @CacheLookup
    @FindBy(linkText= "Show All Desktops")
    WebElement showAllTheDesktopsClick ;
   // By showAllTheDesktopsClick = By.linkText("Show All Desktops");
    @CacheLookup
    @FindBy(id= "input-sort")
    WebElement desktopSortBy ;

   // By desktopSortBy = By.id("input-sort");
    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'HP LP3065')]")
    WebElement selectHPProduct ;
  //  By selectHPProduct = By.xpath("//a[contains(text(),'HP LP3065')]");
    @CacheLookup
    @FindBy(xpath= "//h1[contains(text(),'HP LP3065')]")
    WebElement verifyTextHP ;
   // By verifyTextHP = By.xpath("//h1[contains(text(),'HP LP3065')]");

    @CacheLookup
    @FindBy(name= "quantity")
    WebElement sendQty ;
  //  By sendQty=By.name("quantity");

    @CacheLookup
    @FindBy(id= "button-cart")
    WebElement clikOnAddToCart ;
   // By clikOnAddToCart=By.id("button-cart");
    @CacheLookup
    @FindBy(css= "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement verifyMessage ;
    @CacheLookup
    @FindBy(xpath= "//body/div[2]/div[1]/div[1]/div[1]/button[1]")
    WebElement closeSideButton ;
    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'shopping cart')]")
    WebElement ShoppingCart ;
    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'Shopping Cart')]")
    WebElement shoppingCartText ;
    @CacheLookup
    @FindBy(xpath= "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName ;
    //By productName=By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    @CacheLookup
    @FindBy(xpath= "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDateTxt ;
    @CacheLookup
    @FindBy(xpath= "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement modelTxt ;
    @CacheLookup
    @FindBy(xpath= "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement totalPriceText ;
   // By totalPriceText=By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");

    @CacheLookup
    @FindBy(xpath= "//select[@id='input-sort']")
    WebElement nameztoa ;

    public void sortByNameZtoA1(String s){

        selectByVisibleTextFromDropDown(nameztoa,"Name (Z - A)");
        log.info("Clicking on login link : " + nameztoa.toString());

    }
    public void sortByNameZtoA() {
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        // Select sort by Name Z - A
        selectByVisibleTextFromDropDown(desktopSortBy, "Name (Z - A)");

        products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        //Assert.assertEquals(originalProductsName, afterSortByZToAProductsName,"Product not sorted into Z to A order");
    }
    public void sorybyAtoZ1(String st){

        selectByVisibleTextFromDropDown(nameztoa,"Name (A - Z)");
        log.info("Clicking on login link : " + nameztoa.toString());
    }


    //2.1Mouse hover on Desktops
    public void mouseHoverOnDesktops() {
        mouseHoverToElementAndClick(desktopClick);
        log.info("Clicking on login link : " + desktopClick.toString());
    }

    //2.2 Click on “Show All Desktops
    public void mouseHoverOnShowAllDesktops() {
        mouseHoverToElementAndClick(showAllTheDesktopsClick);
        log.info("Clicking on login link : " + showAllTheDesktopsClick.toString());
    }

    //2.3 Select Sort By position "Name: A to Z"
    public void sortByNameAtoZ() {
        selectByVisibleTextFromDropDown(desktopSortBy, "Name (A - Z)");
        log.info("Clicking on login link : " + desktopSortBy.toString());
    }

    //  2.4 Select product “HP LP3065”
    public void selectHPLaptop() {
        clickOnElement(selectHPProduct);
        log.info("Clicking on login link : " + selectHPProduct.toString());
    }

    //2.5 Verify the Text "HP LP3065"
    public String verifyTheTextForHpLaptop() {
        String message=getTextFromElement(verifyTextHP);
        log.info("Clicking on login link : " + verifyTextHP.toString());
        return message;
    }

    //2.6 Select Delivery Date "2022-11-30"
    public void selectDeliveryDate() {
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
    }
    //2.7  Enter Qty "1” using Select class.
    public void sendQty(String qty){
        sendTextToElement(sendQty," ");
        log.info("Clicking on login link : " + sendQty.toString());


    }
   // 2.8	Click on “Add to Cart” button
    public void clickOnAddTOcartBtton(){
        clickOnElement(clikOnAddToCart);
        log.info("Clicking on login link : " + clikOnAddToCart.toString());
    }
    public String verifYMessageSuceessfullyAdded(){
       // Assert.assertTrue("Product not added to cart",
               // getTextFromElement(By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible"))
                        //.contains("Success: You have added HP LP3065 to your shopping cart!");
       // clickOnElement(By.xpath("//a[contains(text(),'shopping cart')]"));
        String message=getTextFromElement(verifyMessage);
        log.info("Clicking on login link : " + verifyMessage.toString());
        return message;

    }
    public void clickOncloseButton(){
        clickOnElement(closeSideButton);
        log.info("Clicking on login link : " + closeSideButton.toString());
    }

public void clikconShoppinCart(){//2.10
    clickOnElement(ShoppingCart);
    log.info("Clicking on login link : " + ShoppingCart.toString());
}
public String verifyTxtShopingCart(){//2.11
    String message=getTextFromElement(shoppingCartText);
    log.info("Clicking on login link : " + shoppingCartText.toString());
    return message;


}
//2.12Verify the Product name "HP LP3065"
public String verifyProductNamee() {
    String message=getTextFromElement(productName);
    log.info("Clicking on login link : " + productName.toString());
    return message;



}
    // 2.13	Verify the Delivery Date "2022-11-30"
    public String verifyDelviertDate(){
        String message=getTextFromElement(deliveryDateTxt);
        log.info("Clicking on login link : " + deliveryDateTxt.toString());
        return message;

    }
    // 2.14	Verify the Model "Product21"
    public String verifyModel(){
        String message=getTextFromElement(modelTxt);
        log.info("Clicking on login link : " + modelTxt.toString());
        return message;

    }
    // 2.15	Verify the Todat "£74.73"
    public String verifyTotalPrice(){
        String message=getTextFromElement(totalPriceText);
        log.info("Clicking on login link : " + totalPriceText.toString());
        return message;
    }


}
