package JetBlue;

import Reusable_Classes.Reusable_Annotation_Class;
import ReuseableLibraries.Reusable_Actions;
import ReuseableLibraries.Reusable_Actions_loggers;
import org.testng.annotations.Test;

public class Jetblue_verifyFare extends Reusable_Annotation_Class {

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
        // click on the destination
        Reusable_Actions_loggers.sendKeysAction(driver, "//*[@id='jb-autocomplete-6-search']", "Las Vegas", logger, "Destination");
        // click on the first result of the search result
        Reusable_Actions_loggers.clickAction(driver, "//li[@id='jb-autocomplete-6-option-item-0']", logger, "first search result");
        //click on the Explore fares
        Reusable_Actions_loggers.clickAction(driver, "//*[text()=' Explore fares '] ", logger, "Explore fares");
        String fares = Reusable_Actions_loggers.getTextAction(driver, "//*[@id='bff-calendar-2022-5']", logger, "different fares");
        System.out.println("Different fares of June 2022 are: " + fares);
    } // end of verify fares
}
