package JETBLUE_Object_Pages;

import Reusable_Classes.Reusable_Actions_POM_Loggers;
import Reusable_Classes.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class jetBlue_CheckOutPage extends Reusable_Annotation_Class {
    // define local logger ExtentText
    ExtentTest logger;
// create constructor for static when call the page object class to test
// class and name it as the page object class

    public jetBlue_CheckOutPage(WebDriver driver) {

        //page factory function for page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotation_Class.logger;
    }// end of constructor

    // define webElements using @find by
    @FindBy(xpath = "//*[@id='auto-flight-quickest-or-lowest-0']")
    WebElement flightTimeButton;
    @FindBy(xpath = "//*[@id='auto-flight-card1']")
    WebElement returningFlightTimeButton;


    @FindBy(xpath = "//*[text()=' Switch to Blue ']")
    WebElement switchToBlueButton;
    @FindBy(xpath = "//*[text()=' Next: Checkout ']")
    WebElement checkOutButton;


    public void clickOnSearchFlightTimeButton() {
        Reusable_Actions_POM_Loggers.clickAction(driver, flightTimeButton, logger, "time Button ");
    }// end of click method
    public void clickOnSearchReturnFlightTimeButton() {
        Reusable_Actions_POM_Loggers.clickAction(driver, returningFlightTimeButton, logger, "time Button ");
    }// end of click method
    public void clickOnSwitchToBlueButton() {
        Reusable_Actions_POM_Loggers.clickAction(driver, switchToBlueButton, logger, "switch to Button ");
    }// end of click method
    public void clickOnCheckOutButton() {
        Reusable_Actions_POM_Loggers.clickAction(driver, checkOutButton, logger, "check out Button ");
    }// end of click method



}// end of java class
