package com.tutorialsninja.pages;


import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
        @CacheLookup
        @FindBy(linkText = "Desktops")
        WebElement desktopClick;
        //By desktopClick=By.linkText("Desktops");
        @CacheLookup
        @FindBy(linkText = "Show All Desktops")
        WebElement showAllTheDesktopsClick;
        @CacheLookup
        @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
        WebElement verifyText;
        @CacheLookup
        @FindBy(linkText = "Laptops & Notebooks")
        WebElement laptopsAndNotebooksClick;

        @CacheLookup
        @FindBy(linkText = "Show All Laptops & Notebooks")
        WebElement showAllLaptopsAndNotebooksClick;
        @CacheLookup
        @FindBy(xpath = "//h2[text()='Laptops & Notebooks']")
        WebElement verifyText1;
        @CacheLookup
        @FindBy(linkText = "Components")
        WebElement Componentsclick;
        //By Componentsclick = By.linkText("Components");
        @CacheLookup
        @FindBy(linkText = "Show All Components")
        WebElement showallComponents;
        // By showallComponents = By.linkText("Show All Components");
        @CacheLookup
        @FindBy(xpath = "//h2[contains(text(),'Components')]")
        WebElement verifytext2;

        // By verifytext2 = By.xpath("//h2[contains(text(),'Components')]");


        public void mouseHoverOnDesktop () {
            mouseHoverToElementAndClick(desktopClick);
            log.info("Clicking on register link : " + desktopClick.toString());

        }
        public void clickOnShowAllTheDesktops () {
            clickOnElement(showAllTheDesktopsClick);
            log.info("Clicking on register link : " + showAllLaptopsAndNotebooksClick.toString());

        }
        public String verifyText () {
            String message = getTextFromElement(verifyText);
            log.info("Clicking on register link : " + verifyText.toString());
            return message;

        }
        public void mouseHoverOnLaptopAndNoteBooks () {
            mouseHoverToElementAndClick(laptopsAndNotebooksClick);
            log.info("Clicking on register link : " + laptopsAndNotebooksClick.toString());

        }
        public void clickOnShowAllLaptopsAndNoteBooksClick () {
            clickOnElement(showAllLaptopsAndNotebooksClick);
            log.info("Clicking on register link : " + showAllLaptopsAndNotebooksClick.toString());

        }
        public String verifyText1 () {
            String message = getTextFromElement(verifyText1);
            log.info("Clicking on register link : " + verifyText1.toString());

            return message;
        }
        public void mouseHoverOnComponents () {
            mouseHoverToElementAndClick(Componentsclick);
            log.info("Clicking on register link : " + Componentsclick.toString());


        }

        public void clickOnShowAllComponents () {
            clickOnElement(showallComponents);
            log.info("Clicking on register link : " + showallComponents.toString());

        }

        public String VerifyText2 () {
            String message = getTextFromElement(verifytext2);
            log.info("Clicking on register link : " + verifytext2.toString());

            return message;

    }
}
