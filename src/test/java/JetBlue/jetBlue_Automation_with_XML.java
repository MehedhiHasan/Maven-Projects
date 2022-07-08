package JetBlue;

import Reusable_Classes.Reusable_Annotation_Class;
import ReuseableLibraries.Reusable_Actions;
import ReuseableLibraries.Reusable_Actions_loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class jetBlue_Automation_with_XML extends Reusable_Annotation_Class {


    // Use-case: Verify the title of jetBlue airlines
    @Test(priority = 1)
    public void verifyTitle() throws InterruptedException {
        driver.navigate().to("https://www.jetblue.com/");
        Thread.sleep(3000);
        Reusable_Actions_loggers.verifyTittleAction(driver, "JetBlue | Airline Tickets", logger);
    } // end of verify title

    //User-Story: As a passenger I want to find the best fare for my flight so that I can decide a fare
    @Test(dependsOnMethods = "verifyTitle")
    public void verifyFare() throws InterruptedException {
        //popup handle
        driver.switchTo().frame(1);
        Reusable_Actions.popUpHandleClick(driver, "//a[text()='Accept All Cookies']", "popup");
        //click on the book button
        Reusable_Actions_loggers.clickAction(driver, "//*[text()='Book']", logger, "BooK button");
        //click on the best fare finder
        Reusable_Actions_loggers.clickAction(driver, "//*[text()='Best Fare Finder']", logger, "Best fare finder");
        //click on the departure area
        Reusable_Actions_loggers.clickAction(driver, "//*[@data-qaid='fromAirport']", logger, "departure click");
        //send the departure for best fare
        Reusable_Actions_loggers.sendKeysAction(driver, "//*[@id='jb-autocomplete-5-search']", "New York", logger, "Departure area");
        // click on the first result of the search result
        Reusable_Actions_loggers.clickByIndexAction(driver, "//*[@class='in-area']", 0, logger, "first search result");
        // send on the destination
        Reusable_Actions_loggers.sendKeysAction(driver, "//*[@id='jb-autocomplete-6-search']", "Las Vegas", logger, "Destination");
        // click on the first result of the search result
        Reusable_Actions_loggers.clickAction(driver, "//li[@id='jb-autocomplete-6-optoptionion-item-0']", logger, "first search result");
        //click on the Explore fares
        Reusable_Actions_loggers.clickAction(driver, "//*[text()=' Explore fares '] ", logger, "Explore fares");
        String fares = Reusable_Actions_loggers.getTextAction(driver, "//*[@id='bff-calendar-2022-5']", logger, "different fares");
        System.out.println("Different fares of June 2022 are: " + fares);
    } // end of verify fares

    // User Story 02: As a passenger I want to book a one way ticket so that I can fly
    @Test(priority = 2)
    public void bookingOneWayTicket() throws InterruptedException {

        driver.navigate().to("https://www.jetblue.com/");
        //switch to pop up
        driver.switchTo().frame(1);
        Reusable_Actions.popUpHandleClick(driver, "//a[text()='Accept All Cookies']", "popup");
        //click on the book button
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

    // User story: As a user I want to book a round-trip so that I can fly and come back
    @Test(priority = 3)
    public void bookingRoundTrip() throws InterruptedException {
        driver.navigate().to("https://www.jetblue.com/");
        //switch to pop up
        driver.switchTo().frame(1);
        Reusable_Actions.popUpHandleClick(driver, "//a[text()='Accept All Cookies']", "popup");
        Thread.sleep(2000);
        //click on the book button
        Reusable_Actions_loggers.clickAction(driver, "//*[text()='Book']", logger, "BooK button");
        //click on the flight button
        Thread.sleep(2000);
        Reusable_Actions_loggers.clickAction(driver, "//a[@routerlink='/flights']", logger, "flight");
        // click on the departing search box
        Reusable_Actions_loggers.clickAction(driver, "//*[@data-qaid='fromAirport']", logger, "departing");
        //send keys to departing
        Reusable_Actions_loggers.sendKeysAction(driver, "//input[@aria-autocomplete='list']", "New York, NY (JFK)", logger, "Departing area");
        //click on the first result
        Reusable_Actions_loggers.clickByIndexAction(driver, "//*[@class='in-area']", 1, logger, "first element of departing flight");
        //send keys to destination
        Reusable_Actions_loggers.sendKeysActionByIndex(driver, "//*[@autocapitalize='off']", 1, "Chicago", logger, "destination");
        //click on the destinations result
        Reusable_Actions_loggers.clickAction(driver, "//*[@role='option']", logger, "click");
        //click on the check in date
        Reusable_Actions_loggers.clickAction(driver, "//*[@aria-label='depart Friday, June 10, 2022']", logger, "check-in");
        //click on the checkout date
        Reusable_Actions_loggers.clickAction(driver, "//*[@aria-label='return Friday, July 15, 2022']", logger, "checkout");
        //click on search flight button
        Reusable_Actions_loggers.clickAction(driver, "//*[text()='Search flights']", logger, "click");
        // printout different flight time and price for departure
        String flightTimePrice = Reusable_Actions_loggers.getTextAction(driver, "//*[@class='bg-off-white ng-star-inserted']", logger, "flight price and time");
        //printout the time and price of the departing search flight
        System.out.println(flightTimePrice);
        // select departing flight
        Reusable_Actions_loggers.clickAction(driver, "//*[@id='auto-flight-quickest-or-lowest-1']", logger, "select departing flight");
        Thread.sleep(2000);
        // select returning flight details
        Reusable_Actions_loggers.clickByIndexAction(driver, "//div[@aria-label='Click here to see flight details']", 1, logger, "details returning flight");
        // click on returning flight
        Reusable_Actions_loggers.clickAction(driver, "//*[@class='dib relative baseline-offset']", logger, "click on returning flight button ");
        //switch to blue
//        Reusable_Actions_loggers.clickAction(driver, "//text()=' Switch to Blue ']", logger, "switch to blue");
        //check out
        Reusable_Actions_loggers.clickAction(driver, "//*[text()=' Next: Checkout ']", logger, "check out");
        //Print out the Total price of Round trip
        String flightFinalPrice = Reusable_Actions_loggers.getTextAction(driver, "//*[@class='core-blue s flex justify-between mt2 ng-star-inserted']", logger, "price");
        System.out.println(flightFinalPrice);
        Thread.sleep(5000);
    }//End of Round trip booking flight

    // User-Story: As a passenger I want to know the Check in information so that I know how to check in
    @Test(priority = 4)
    public void bestVacationFinder() throws InterruptedException {
        Reusable_Actions.navigateToWeb(driver, "https://www.jetblue.com/");
        //switch to pop up
        driver.switchTo().frame(1);
        Reusable_Actions.popUpHandleClick(driver, "//a[text()='Accept All Cookies']", "popup");
        Thread.sleep(2000);
        //click on the travel info
        Reusable_Actions_loggers.clickAction(driver, "//span[text()='Travel Info']", logger, "Travel info button");
        //click on how to check in button
        Reusable_Actions_loggers.clickAction(driver, "//*[text()=' How to Check In']", logger, "How to check in");
        // get information about travel
        String travelInfo = Reusable_Actions_loggers.getTextAction(driver, "//*[@class='mb7-l mb6-m ma0 body']", logger, "Info");
        System.out.println(travelInfo);
    }// End of best Vacation finder class


}// end of java class
