package JetBlue_PageObject;

import Reusable_Classes.Reusable_Actions_POM_Loggers;
import Reusable_Classes.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JetBlue_travelInfo extends Reusable_Annotation_Class {
    ExtentTest logger;

    public JetBlue_travelInfo(WebDriver driver) {
        //page factory function for page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotation_Class.logger;
    }// end of constructor

    //
    @FindBy(xpath = "//span[text()='Travel Info']")
    WebElement navTravelInfo;
    @FindBy(xpath = "//a[text()=' Bag Info']")
    WebElement clickBagInfo;
    @FindBy(xpath = "//*[@class='nmt5']")
    WebElement BagInfo;

    public void clickTravelInfo() {
        Reusable_Actions_POM_Loggers.clickAction(driver, navTravelInfo, logger,"Travel info");
    }

    public void clickOnBagInfo() {
        Reusable_Actions_POM_Loggers.clickAction(driver, clickBagInfo, logger,"Bag info");
    }

    public void getTextBagInfo() {
        String BagInformation = Reusable_Actions_POM_Loggers.getTextAction(driver, BagInfo, logger," info");
        System.out.println(BagInformation);
    }


}// end of travel info class
