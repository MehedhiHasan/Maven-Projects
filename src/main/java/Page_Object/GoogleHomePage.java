package Page_Object;

import Reusable_Classes.Reusable_Actions_POM_Loggers;
import Reusable_Classes.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleHomePage extends Reusable_Annotation_Class {
    // declare the extentTest for each page object class
    ExtentTest logger;
    //create constructor method that will reference the same name as your class. so you can make your
    // page object class methods static when you call it in your test class
    public  GoogleHomePage(WebDriver driver){
        //page factory function for page object
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotation_Class.logger;
    }// end of constructor class
// define webElements using @find by
    @FindBy(xpath = "//*[@name='q']")
    WebElement searchField;
    @FindBy(xpath ="//*[@name ='btnK']")
    WebElement GoogleSearchButton;
    // for multiple elements
    @FindBy(xpath = "//*[@name='links']")
    List<WebElement> listLinks;

    public void clickLinksByIndex(){
        Reusable_Actions_POM_Loggers.clickAction(driver,listLinks.get(0),logger,"linkClicked");
    }// end of link

    public void searchUserValue(String uservalue){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver,searchField,uservalue,logger,"Search Field");
    }//end of search field method

    public void submitOnGoogleSearch(){
        Reusable_Actions_POM_Loggers.submitAction(driver,GoogleSearchButton,logger,"Google Search Button");
    }//end of google search button

//    public void sear



}// end of class
