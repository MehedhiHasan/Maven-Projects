package JETBLUE_Object_Pages;

import Reusable_Classes.Reusable_Actions_POM_Loggers;
import Reusable_Classes.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class jetBlue_VerifyFarePage extends Reusable_Annotation_Class {
    // define local logger ExtentText
    ExtentTest logger;
// create constructor for static when call the page object class to test
// class and name it as the page object class

    public jetBlue_VerifyFarePage(WebDriver driver) {

        //page factory function for page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotation_Class.logger;
    }// end of constructor

    // define webElement
    @FindBy(xpath = "//*[text()=' Explore fares ']")
    WebElement ExploreFare;
    @FindBy(xpath = "//*[@id='bff-calendar-2022-5']")
    WebElement Fares;


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
