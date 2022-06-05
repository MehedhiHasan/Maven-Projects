package JetBlue;

import Page_Object.BaseClass;
import Page_Object.BaseClass_JetBlue;
import Reusable_Classes.Reusable_Annotation_Class;
import org.testng.annotations.Test;

public class jetBlue_POM extends Reusable_Annotation_Class {

    @Test(priority = 1)
    public void jetBluePopUpHandle() {
        driver.navigate().to("https://www.jetblue.com/");
        driver.switchTo().frame(1);
        BaseClass_JetBlue.jetBlueHomePage().clickOnPopup();
    }

    @Test(dependsOnMethods = "jetBluePopUpHandle")
    public void clickOnButton() {
        BaseClass_JetBlue.jetBlueHomePage().clickOnBookButton();
    }












}//end of class
