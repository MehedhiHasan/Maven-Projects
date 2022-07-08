package JetBlue;

import Reusable_Classes.Reusable_Annotation_Class;
import org.testng.annotations.Test;

public class jetBlue_POM extends Reusable_Annotation_Class {

    @Test
    public void jetBluePopUpHandle() {
        driver.navigate().to("https://www.jetblue.com/");
        driver.switchTo().frame(1);
//        jetBlue_BaseClass.jetBlue_homePage().clickOnPopup();
    }
    @Test
    public void verifyJetBlueTitle() {
//        jetBlue_BaseClass.jetBlue_homePage().verifyTitle("JetBlue | Airline Tickets");
    }
    @Test
    public void verifyJetBlueFares() {
//        jetBlue_BaseClass.JetBlue_verifyFare().clickOnNavbar_Book();
//        jetBlue_BaseClass.JetBlue_verifyFare().clickOn_FareFinder();
//        jetBlue_BaseClass.JetBlue_verifyFare().click_FareDepartingArea();
//        jetBlue_BaseClass.JetBlue_verifyFare().send_FareDepartingArea("New York");
//        jetBlue_BaseClass.JetBlue_verifyFare().clickOnDepartingFirstResult();
//        jetBlue_BaseClass.JetBlue_verifyFare().Send_FareDestinationArea("Las Vegas");
//        jetBlue_BaseClass.JetBlue_verifyFare().clickOnFirstResult_FareDestinationArea();
//        jetBlue_BaseClass.JetBlue_verifyFare().click_ExploreFare();
//        jetBlue_BaseClass.JetBlue_verifyFare().Different_Fares();
    }
}//end of jetBlue POM class
