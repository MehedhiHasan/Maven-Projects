package JetBlue_PageObject;

import Reusable_Classes.Reusable_Annotation_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class jetBlue_BaseClass extends Reusable_Annotation_Class {
    // define constructor

    public jetBlue_BaseClass(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }//end of constructor class

    // create a static reference for jetBlue popup
    public static JetBlue_HomePage jetBlue_homePage(){
        JetBlue_HomePage  jetBlue_homePage= new JetBlue_HomePage(driver);
        return jetBlue_homePage;
    }

    public static JetBlue_verifyFare JetBlue_verifyFare(){
        JetBlue_verifyFare JetBlue_verifyFare= new JetBlue_verifyFare(driver);
        return JetBlue_verifyFare;
    }

    public static JetBlue_travelInfo JetBlue_travelInfo(){
        JetBlue_travelInfo JetBlue_travelInfo= new JetBlue_travelInfo(driver);
        return JetBlue_travelInfo;
    }




}// end of base class
