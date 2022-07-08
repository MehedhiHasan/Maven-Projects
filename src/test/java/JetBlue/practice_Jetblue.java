package JetBlue;

import JETBLUE_Object_Pages.BaseClass;
import Reusable_Classes.Reusable_Actions_POM_Loggers;
import Reusable_Classes.Reusable_Annotation_Class;
import ReuseableLibraries.Reusable_Actions;
import ReuseableLibraries.Reusable_Actions_loggers;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class practice_Jetblue extends Reusable_Annotation_Class {

  @Test
    public static void homepage(){
      Reusable_Actions_POM_Loggers.navigateToWeb(driver,"https://www.jetblue.com/");
      BaseClass.JetBlue_HomePage().clickOnPopup();
//      Reusable_Actions_POM_Loggers.sendKeysAction(driver,"//*[@aria-autocomplete='list']","HELP",logger);

  }// end of test


}
