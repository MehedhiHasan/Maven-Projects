package JETBLUE_Object_Pages;

import JetBlue_PageObject.JetBlue_travelInfo;
import Reusable_Classes.Reusable_Annotation_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_Annotation_Class {
    // define constructor

    public BaseClass(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }//end of constructor class

    // create a static reference for jetBlue popup
    public static jetBlue_HomePage JetBlue_HomePage(){
        jetBlue_HomePage  JetBlue_HomePage= new jetBlue_HomePage(driver);
        return JetBlue_HomePage;
    }
    public static jetBlue_CheckOutPage JetBlue_CheckOutPage(){
        jetBlue_CheckOutPage JetBlue_CheckOutPage= new jetBlue_CheckOutPage(driver);
        return JetBlue_CheckOutPage;
    }
    public static jetBlue_VerifyFarePage JetBlue_verifyFarePage(){
        jetBlue_VerifyFarePage JetBlue_verifyFarePage= new jetBlue_VerifyFarePage(driver);
        return JetBlue_verifyFarePage;
    }

    public static jetBlue_TravelInfoPage jetBlue_TravelInfoPage() {
        jetBlue_TravelInfoPage jetBlue_TravelInfoPage = new jetBlue_TravelInfoPage(driver);
        return jetBlue_TravelInfoPage;
    }

}// end of base class
