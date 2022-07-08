package JetBlue_PageObject;

import Reusable_Classes.Reusable_Actions_POM_Loggers;
import Reusable_Classes.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JetBlue_verifyFare extends Reusable_Annotation_Class {
    // define local logger ExtentText
    ExtentTest logger;
// create constructor for static when call the page object class to test
// class and name it as the page object class

    public JetBlue_verifyFare(WebDriver driver) {

        //page factory function for page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotation_Class.logger;
    }// end of constructor

    // define webElement


    @FindBy(xpath = "//*[@data-qaid='fromAirport']")
    WebElement clickDepartingArea;
    @FindBy(xpath = "//*[@id='jb-autocomplete-5-search']")
    WebElement sendDepartingArea;
    @FindBy(xpath = "//*[@class='in-area']")
    WebElement clickOnFirstResult;
    @FindBy(xpath = "//*[@id='jb-autocomplete-6-search']")
    WebElement sendDestinationArea;
    @FindBy(xpath = "//li[@id='jb-autocomplete-6-option-item-0']")
    WebElement clickOnFirstResultOfDestination;
    @FindBy(xpath = "//*[text()=' Explore fares ']")
    WebElement ExploreFare;
    @FindBy(xpath = "//*[@id='bff-calendar-2022-5']")
    WebElement Fares;


    //click on book button

    //click on best fare finder button

    //click on departing button
    public void click_DepartingArea() {
        Reusable_Actions_POM_Loggers.clickAction(driver, clickDepartingArea, logger, "departing click");
    }
    //send new york
    public void send_DepartingArea(String userValue) {
        Reusable_Actions_POM_Loggers.sendKeysAction(driver, clickDepartingArea,userValue, logger, "send value");
    }
    // click on the first result of the search result
    public void clickOnDepartingFirstResult() {
        Reusable_Actions_POM_Loggers.clickAction(driver, clickOnFirstResult,logger, "click result");
    }
    // send value on the destination
    public void Send_DestinationArea(String userValue) {
        Reusable_Actions_POM_Loggers.sendKeysAction(driver, sendDestinationArea,userValue,logger, "send value");
    }
    // click on the destinations first result
    public void clickOnFirstResult_DestinationArea() {
        Reusable_Actions_POM_Loggers.clickAction(driver, clickOnFirstResultOfDestination, logger, "click destination user result");
    }
    // click on explore fare
    public void click_ExploreFare() {
        Reusable_Actions_POM_Loggers.clickAction(driver, ExploreFare, logger, "click explore fare");
    }
// get different fares
    public void Different_Fares() {
       String Diff_Fares = Reusable_Actions_POM_Loggers.getTextAction(driver, Fares, logger, "click explore fare");
        System.out.println("Different fares of June 2022 are: " + Diff_Fares);
    }





}// end of verifyFare class
