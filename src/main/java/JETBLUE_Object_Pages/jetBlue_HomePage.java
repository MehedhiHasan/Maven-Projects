package JETBLUE_Object_Pages;

import Reusable_Classes.Reusable_Actions_POM_Loggers;
import Reusable_Classes.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class jetBlue_HomePage extends Reusable_Annotation_Class {
    // define local logger ExtentText
    ExtentTest logger;
// create constructor for static when call the page object class to test
// class and name it as the page object class

    public jetBlue_HomePage(WebDriver driver) {

        //page factory function for page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotation_Class.logger;
    }// end of constructor

    // define webElements using @find by
    @FindBy(xpath = "//a[text()='Accept All Cookies']")
    WebElement popUp;
    @FindBy(xpath = "//*[text()='Book']")
    WebElement jetBlueBookButton;
    @FindBy(xpath = "//*[text()='Best Fare Finder']")
    WebElement FareFinder;
    @FindBy(xpath = "//span[text() = 'Flights']")
    List<WebElement> flightButton;
    @FindBy(xpath = "//*[text() = ' Roundtrip ']")
    WebElement roundTripDropdown;
    @FindBy(xpath = "//*[text() = ' One-way ']")
    WebElement oneWayButton;
    @FindBy(xpath = "//*[@data-qaid='fromAirport']")
    WebElement clickDepartingArea;
    @FindBy(xpath = "//*[@aria-autocomplete='list']")
    List<WebElement> sendArea;
    @FindBy(xpath = "//*[@class='in-area']")
    WebElement clickOnFirstResult;
    @FindBy(xpath = "//*[@autocorrect='off']") //*[@class="ng-untouched ng-dirty ng-valid"]//*[@autocorrect="off"]
    WebElement sendDestinationArea;
    @FindBy(xpath = "//li[contains(@id,'item-0')]")
    WebElement clickOnFirstResultOfDestination;
    @FindBy(xpath = "//*[@aria-label='Thursday, June 30, 2022']")
    WebElement CheckInDate;
    @FindBy(xpath = "//*[@aria-label='depart Thursday, June 30, 2022']")
    WebElement CheckInDateRoundTrip;
    @FindBy(xpath = "//*[@aria-label='return Saturday, July 30, 2022']")
    WebElement CheckOutDate;
    @FindBy(xpath = "//*[@aria-label='return Saturday, July 30, 2022']")
    WebElement CheckOutDateRoundTrip;
    @FindBy(xpath = "//*[text()='Search flights']")
    WebElement searchFlightButton;
    @FindBy(xpath = "//span[text()='Travel Info']")
    WebElement navTravelInfo;
    @FindBy(xpath = "//a[text()=' Bag Info']")
    WebElement clickBagInfo;


    public void clickOnPopup() {
        Reusable_Actions_POM_Loggers.popUpHandleClick(driver, popUp, logger, "popup");
    }

    public void verifyTitle(String uservalue) {
        Reusable_Actions_POM_Loggers.verifyTittleAction(driver, uservalue, logger);
    }
    public void clickOnNavbar_Book() {
        Reusable_Actions_POM_Loggers.clickAction(driver, jetBlueBookButton, logger, "Navbar_book");
    }//end of method
    public void clickOn_FareFinder() {
        Reusable_Actions_POM_Loggers.clickAction(driver, FareFinder, logger, "finder button");
    }
    public void clickOnFlight() {
        Reusable_Actions_POM_Loggers.clickAction(driver, flightButton.get(2), logger, "flight button");
    }// end of click method

    public void clickOnRoundTripButton() {
        Reusable_Actions_POM_Loggers.clickAction(driver, roundTripDropdown, logger, "roundTripDropdown button");
    }// end of click method

    public void clickOnOneWayButton() {
        Reusable_Actions_POM_Loggers.clickAction(driver, oneWayButton, logger, "oneWayButton ");
    }// end of click method

    public void click_DestinationArea() {
        Reusable_Actions_POM_Loggers.clickAction(driver, sendDestinationArea, logger, "destination click");
    }

    //send new york
    public void send_DepartingArea(String userValue) {
        Reusable_Actions_POM_Loggers.sendKeysAction(driver, sendArea.get(0), userValue, logger, "send value on departing");
    }

    // click on the first result of the search result
    public void clickOnDepartingFirstResult() {
        Reusable_Actions_POM_Loggers.clickAction(driver, clickOnFirstResult, logger, "click result");
    }

    public void click_DepartingArea() {
        Reusable_Actions_POM_Loggers.clickAction(driver, clickDepartingArea, logger, "departing click");
    }

    // send value on the destination
    public void Send_DestinationArea(String userValue) {
        Reusable_Actions_POM_Loggers.sendKeysAction(driver, sendArea.get(1), userValue, logger, "send value destination");
    }

    public void clickOnFirstResult_DestinationArea() {
        Reusable_Actions_POM_Loggers.clickAction(driver, clickOnFirstResultOfDestination, logger, "click destination user result");
    }

    public void clickOnDepartingDate() {
        Reusable_Actions_POM_Loggers.clickAction(driver, CheckInDate, logger, "departing date ");
    }// end of click method

    public void clickOnDestinationDate() {
        Reusable_Actions_POM_Loggers.clickAction(driver, CheckOutDate, logger, "destination date ");
    }// end of click method

    public void clickOnDepartingDateRoundTrip() {
        Reusable_Actions_POM_Loggers.clickAction(driver, CheckInDateRoundTrip, logger, "destination date ");
    }// end of click method

    public void clickOnDestinationDateRoundTrip() {
        Reusable_Actions_POM_Loggers.clickAction(driver, CheckOutDateRoundTrip, logger, "destination date ");
    }// end of click method

    public void clickOnSearchFlightButton() {
        Reusable_Actions_POM_Loggers.clickAction(driver, searchFlightButton, logger, "flight Button ");
    }// end of click method
    public void clickTravelInfo() {
        Reusable_Actions_POM_Loggers.clickAction(driver, navTravelInfo, logger,"Travel info");
    }
    public void clickOnBagInfo() {
        Reusable_Actions_POM_Loggers.clickAction(driver, clickBagInfo, logger,"Bag info");
    }


}// end of java class
