package Page_Object;

import Reusable_Classes.Reusable_Actions_POM_Loggers;
import Reusable_Classes.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class JetBlueHomePage extends Reusable_Annotation_Class {
    // define local logger ExtentText
    ExtentTest logger;
// create constructor for static when call the page object class to test
// class and name it as the page object class

    public JetBlueHomePage(WebDriver driver) {

        //page factory function for page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotation_Class.logger;
    }// end of constructor

    // define webElements using @find by
    @FindBy(xpath = "//a[text()='Accept All Cookies']")
    WebElement popUp;
    @FindBy(xpath = "//*[text()='Book']")
    WebElement jetBlueBookButton;

    public void clickOnPopup() {
        Reusable_Actions_POM_Loggers.clickAction(driver, popUp, logger, "popup");
    }

    public void clickOnBookButton() {
        Reusable_Actions_POM_Loggers.clickAction(driver, jetBlueBookButton, logger, "book");
    }

}// end of java class
