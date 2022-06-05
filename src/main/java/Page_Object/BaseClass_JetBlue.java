package Page_Object;

import Reusable_Classes.Reusable_Annotation_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass_JetBlue extends Reusable_Annotation_Class {
    // define constructor

    public BaseClass_JetBlue(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }//end of constructor class

    // create a static reference for jetBlue popup
    public static JetBlueHomePage jetBlueHomePage(){
        JetBlueHomePage  jetBlueHomePage= new JetBlueHomePage(driver);
        return jetBlueHomePage;
    }

}// end of base class
