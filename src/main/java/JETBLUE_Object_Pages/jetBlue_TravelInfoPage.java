package JETBLUE_Object_Pages;

import Reusable_Classes.Reusable_Actions_POM_Loggers;
import Reusable_Classes.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class jetBlue_TravelInfoPage extends Reusable_Annotation_Class {
    ExtentTest logger;

    public jetBlue_TravelInfoPage(WebDriver driver) {
        //page factory function for page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotation_Class.logger;
    }// end of constructor

    //

    @FindBy(xpath = "//*[@class='nmt5']")
    WebElement BagInfo;

    public void getTextBagInfo() {
        String BagInformation = Reusable_Actions_POM_Loggers.getTextAction(driver, BagInfo, logger," info");
        System.out.println(BagInformation);
    }

}// end of travel info class
