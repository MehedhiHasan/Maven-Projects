package JetBlue;

import Reusable_Classes.Reusable_Annotation_Class;
import ReuseableLibraries.Reusable_Actions;
import ReuseableLibraries.Reusable_Actions_loggers;
import org.testng.annotations.Test;

public class jetBlue_OneWayTicket extends Reusable_Annotation_Class {
    // User Story 02: As a passenger I want to book a one way ticket so that I can fly
    @Test
    public void bookingOneWayTicket() throws InterruptedException {

        driver.navigate().to("https://www.jetblue.com/");
        //switch to pop up
//        driver.switchTo().frame(1);
//        Reusable_Actions.popUpHandleClick(driver, "//a[text()='Accept All Cookies']", "popup");
//        //click on the book button
        Reusable_Actions_loggers.clickAction(driver, "//*[text()='Book']", logger, "BooK button");
        //click on the flight button
        Thread.sleep(2000);
        Reusable_Actions_loggers.clickAction(driver, "//span[text() = 'Flights']", logger, "flight");
        // click on the down arrow button/round-trip
        Reusable_Actions_loggers.clickAction(driver, "//*[text() = ' Roundtrip ']", logger, "flight");
        //click on one way
        Reusable_Actions_loggers.clickAction(driver, "//*[@id='jb-select-1-option-1']", logger, "one way");
        //click on departing search bar
        Reusable_Actions_loggers.clickAction(driver, "//*[@aria-autocomplete='list']", logger, "departing click");
        //send my departing area
        Reusable_Actions_loggers.sendKeysActionByIndex(driver, "//*[@aria-autocomplete='list']", 0, "New York", logger, "depatring area");
        // click on the search result
        Reusable_Actions_loggers.clickByIndexAction(driver, "//*[@class='in-area']", 2, logger, "departing search result click");
        //send keys to destination
        Reusable_Actions_loggers.sendKeysActionByIndex(driver, "//*[@aria-autocomplete='list']", 1, "Los Angeles", logger, "depatring area");
        //click on destination search results
        Reusable_Actions_loggers.clickByIndexAction(driver, "//*[@class='in-area']", 1, logger, "destination search result");
        // click on check in date
        Reusable_Actions_loggers.clickAction(driver, "//*[@aria-label='Friday, June 10, 2022']", logger, "check in date");
        //click on search flight button
        Reusable_Actions_loggers.clickAction(driver, "//*[text()='Search flights']", logger, "flight search button");
        //click on flight time
        Reusable_Actions_loggers.clickAction(driver, "//*[@id='auto-flight-quickest-or-lowest-0']", logger, "flight time");
        //switch to blue if asked
        Reusable_Actions_loggers.clickAction(driver, "//*[text()=' Switch to Blue ']", logger, "switch to Blue");
        //click on check out
        Reusable_Actions_loggers.clickAction(driver, "//*[text()=' Next: Checkout ']", logger, "check out time");
        Thread.sleep(3000);
        //get the summery and total price of one way ticket
        String oneWayTripSummeryFlight = Reusable_Actions_loggers.getTextAction(driver, "//*[@class='legal mb1 avenir next lh-solid flight-list ttc ng-star-inserted']", logger, "text");
        System.out.println(oneWayTripSummeryFlight);
        String oneWayTripPrice = Reusable_Actions_loggers.getTextAction(driver, "//*[@class='core-blue s flex justify-between mt2 ng-star-inserted']", logger, "text");
        // print out the Price of one way flight
        System.out.println(oneWayTripPrice);
    }// end of booking oneway ticket

}// end of java class
