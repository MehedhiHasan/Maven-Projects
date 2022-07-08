package JetBlue_PageObject;

import Reusable_Classes.Reusable_Actions_POM_Loggers;
import Reusable_Classes.Reusable_Annotation_Class;
import org.testng.annotations.Test;

public class jetBlue_POM_AI extends Reusable_Annotation_Class {

    @Test(priority = 1)
    public void jetBluePopUpHandle() {
        driver.navigate().to("https://www.jetblue.com/");
        jetBlue_BaseClass.jetBlue_homePage().clickOnPopup();
    }

    @Test(priority = 2)
    public void verifyJetBlueTitle() {
        Reusable_Actions_POM_Loggers.navigateToWeb(driver, "https://www.jetblue.com/");
        jetBlue_BaseClass.jetBlue_homePage().verifyTitle("JetBlue | Airline Tickets");
    }

//    @Test(priority = 3)
//    public void verifyJetBlueFares() {
//        Reusable_Actions_POM_Loggers.navigateToWeb(driver, "https://www.jetblue.com/");
//        jetBlue_BaseClass.jetBlue_homePage().clickOnPopup();
//        jetBlue_BaseClass.JetBlue_verifyFare().clickOnNavbar_Book();
//        jetBlue_BaseClass.JetBlue_verifyFare().clickOn_FareFinder();
//        jetBlue_BaseClass.JetBlue_verifyFare().click_DepartingArea();
//        jetBlue_BaseClass.JetBlue_verifyFare().send_DepartingArea("New York");
//        jetBlue_BaseClass.JetBlue_verifyFare().clickOnDepartingFirstResult();
//        jetBlue_BaseClass.JetBlue_verifyFare().Send_DestinationArea("Las Vegas");
//        jetBlue_BaseClass.JetBlue_verifyFare().clickOnFirstResult_DestinationArea();
//        jetBlue_BaseClass.JetBlue_verifyFare().click_ExploreFare();
//        jetBlue_BaseClass.JetBlue_verifyFare().Different_Fares();
//    }// end of fare class'








    @Test(priority = 4)
    public void getTravelInfo() {
        Reusable_Actions_POM_Loggers.navigateToWeb(driver, "https://www.jetblue.com/");
        jetBlue_BaseClass.jetBlue_homePage().clickOnPopup();
        jetBlue_BaseClass.JetBlue_travelInfo().clickTravelInfo();
        jetBlue_BaseClass.JetBlue_travelInfo().clickOnBagInfo();
        jetBlue_BaseClass.JetBlue_travelInfo().getTextBagInfo();
    }// end of travel info


    @Test(priority = 5)
    public void OneWayTicketBooking() {
        Reusable_Actions_POM_Loggers.navigateToWeb(driver, "https://www.jetblue.com/");
        jetBlue_BaseClass.jetBlue_homePage().clickOnPopup();
//        jetBlue_BaseClass.JetBlue_verifyFare().clickOnNavbar_Book();
//        jetBlue_BaseClass.Jetblue_OneWayTicket().clickOnFlight();

        jetBlue_BaseClass.JetBlue_verifyFare().click_DepartingArea();
        jetBlue_BaseClass.JetBlue_verifyFare().send_DepartingArea("New York");
        jetBlue_BaseClass.JetBlue_verifyFare().clickOnDepartingFirstResult();
        jetBlue_BaseClass.JetBlue_verifyFare().Send_DestinationArea("Las Vegas");
        jetBlue_BaseClass.JetBlue_verifyFare().clickOnFirstResult_DestinationArea();




    }// end of oneway ticket booking


}//end of jetBlue POM class
