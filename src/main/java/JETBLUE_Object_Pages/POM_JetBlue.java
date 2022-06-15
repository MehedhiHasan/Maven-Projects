package JETBLUE_Object_Pages;

import JetBlue_PageObject.jetBlue_BaseClass;
import Reusable_Classes.Reusable_Actions_POM_Loggers;
import Reusable_Classes.Reusable_Annotation_Class;
import org.testng.annotations.Test;

public class POM_JetBlue extends Reusable_Annotation_Class {

    @Test(priority = 1)
    public void verifyJetBlueTitle() {
        Reusable_Actions_POM_Loggers.navigateToWeb(driver, "https://www.jetblue.com/");
        BaseClass.JetBlue_HomePage().verifyTitle("JetBlue | Airline Tickets");
    }

    @Test(priority = 3)
    public void OneWayTicketBooking() {
        Reusable_Actions_POM_Loggers.navigateToWeb(driver, "https://www.jetblue.com/");
//        BaseClass.JetBlue_HomePage().clickOnPopup();
        BaseClass.JetBlue_HomePage().clickOnRoundTripButton();
        BaseClass.JetBlue_HomePage().clickOnOneWayButton();
        BaseClass.JetBlue_HomePage().click_DepartingArea();
        BaseClass.JetBlue_HomePage().send_DepartingArea("New York");
        BaseClass.JetBlue_HomePage().clickOnDepartingFirstResult();
        BaseClass.JetBlue_HomePage().Send_DestinationArea("Las Vegas");
        BaseClass.JetBlue_HomePage().clickOnFirstResult_DestinationArea();
        BaseClass.JetBlue_HomePage().clickOnDepartingDate();
        BaseClass.JetBlue_HomePage().clickOnSearchFlightButton();
        BaseClass.JetBlue_CheckOutPage().clickOnSearchFlightTimeButton();
        BaseClass.JetBlue_CheckOutPage().clickOnSwitchToBlueButton();
        BaseClass.JetBlue_CheckOutPage().clickOnCheckOutButton();
    }// end of oneway ticket booking

    @Test(priority = 2)
    public void RoundTripTicketBooking() throws InterruptedException {
        Reusable_Actions_POM_Loggers.navigateToWeb(driver, "https://www.jetblue.com/");
       BaseClass.JetBlue_HomePage().clickOnPopup();
        BaseClass.JetBlue_HomePage().click_DepartingArea();
        BaseClass.JetBlue_HomePage().send_DepartingArea("New York");
        BaseClass.JetBlue_HomePage().clickOnDepartingFirstResult();
        BaseClass.JetBlue_HomePage().Send_DestinationArea("Las Vegas");
        BaseClass.JetBlue_HomePage().clickOnFirstResult_DestinationArea();
        BaseClass.JetBlue_HomePage().clickOnDepartingDateRoundTrip();
        BaseClass.JetBlue_HomePage().clickOnDestinationDateRoundTrip();
        BaseClass.JetBlue_HomePage().clickOnSearchFlightButton();
        BaseClass.JetBlue_CheckOutPage().clickOnSearchFlightTimeButton();
        Thread.sleep(1000);
        BaseClass.JetBlue_CheckOutPage().clickOnSearchReturnFlightTimeButton();
        BaseClass.JetBlue_CheckOutPage().clickOnSwitchToBlueButton();
        BaseClass.JetBlue_CheckOutPage().clickOnCheckOutButton();
    }// End of roundTrip ticket booking

    @Test(priority = 4)
    public void verifyJetBlueFares() {
        Reusable_Actions_POM_Loggers.navigateToWeb(driver, "https://www.jetblue.com/");
//       BaseClass.JetBlue_HomePage().clickOnPopup();
        BaseClass.JetBlue_HomePage().clickOnNavbar_Book();
        BaseClass.JetBlue_HomePage().clickOn_FareFinder();
        BaseClass.JetBlue_HomePage().click_DepartingArea();
        BaseClass.JetBlue_HomePage().send_DepartingArea("New York");
        BaseClass.JetBlue_HomePage().clickOnDepartingFirstResult();
        BaseClass.JetBlue_HomePage().Send_DestinationArea("Las Vegas");
        BaseClass.JetBlue_HomePage().clickOnFirstResult_DestinationArea();
        BaseClass.JetBlue_verifyFarePage().click_ExploreFare();
        BaseClass.JetBlue_verifyFarePage().Different_Fares();

    }// end of fare class'

    @Test(priority = 5)
    public void getTravelInfo() {
        Reusable_Actions_POM_Loggers.navigateToWeb(driver, "https://www.jetblue.com/");
//       BaseClass.JetBlue_HomePage().clickOnPopup();
        BaseClass.JetBlue_HomePage().clickTravelInfo();
        BaseClass.JetBlue_HomePage().clickOnBagInfo();
        BaseClass.jetBlue_TravelInfoPage().getTextBagInfo();
    }// end of travel info


}//end of jetBlue POM class
