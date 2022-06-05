package Day08_0052122;

import ReuseableLibraries.Reusable_Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class AI05_Hotels {
    public static void main(String[] args) throws InterruptedException {
        // setting the local driver to reusable setDriver method
        WebDriver driver = Reusable_Actions.setDriver();

        // Creating an arrayList of 3 different destination
        ArrayList<String> destination = new ArrayList<>();
        destination.add("Las Vegas");
        destination.add("Los Angeles");
        destination.add("Chicago");
        // Creating an arrayList of 3 different check in list
        ArrayList<String> CheckIn = new ArrayList<>();
        CheckIn.add("Jun 1, 2022");
        CheckIn.add("Jun 2, 2022");
        CheckIn.add("Jun 3, 2022");
        // Creating an arrayList of 3 different checkout list
        ArrayList<String> checkOut = new ArrayList<>();
        checkOut.add("Jun 10, 2022");
        checkOut.add("Jun 11, 2022");
        checkOut.add("Jun 12, 2022");

//writing a for loop to iterate through the destinations
        for (int i = 0; i < destination.size(); i++) {

// 1 Navigate to  hotels.com using Reusable actions
            Reusable_Actions.navigateToWeb(driver, "https://www.hotels.com/");
            Thread.sleep(2000);
// 2 click on Going to Search bar using reusable method
            Reusable_Actions.clickAction(driver, "//*[@aria-label='Going to']", " search location");
// clear and enter locations
            Reusable_Actions.sendKeysAction(driver, "//*[@id='location-field-destination']", destination.get(i), "  destination");
            Thread.sleep(2000);
// find the first element on the search pop up
            Reusable_Actions.clickByIndexAction(driver, "//*[@data-stid='location-field-destination-result-item-button']", 0, "click first element");
            Thread.sleep(2000);
// click on check in  dates
            Reusable_Actions.clickAction(driver, "//*[@id='d1-btn']", "Unable to click on check-in");
//trying to use reusable action including arrayList inside xpath
            Reusable_Actions.clickAction(driver, "//*[@aria-label='" + CheckIn.get(i) + "']", "failed to send check-in dates");
// click on check out dates
            Reusable_Actions.clickAction(driver, "//*[@aria-label='" + checkOut.get(i) + "']", "failed to send check-out dates");
// click on the done button
            Reusable_Actions.clickAction(driver, "//*[@data-stid='apply-date-picker']", "Unable to click on done button for check in and out");
// click on travellers button and increase the travellers 2x
            Reusable_Actions.clickAction(driver, "//*[@data-testid='travelers-field-trigger']", "unable to click travellers");
            Reusable_Actions.clickByIndexAction(driver, "//*[@class='uitk-step-input-button']", 1, "unable to click on traveler");
            Reusable_Actions.clickByIndexAction(driver, "//*[@class='uitk-step-input-button']", 1, "unable to click on traveler");
            Thread.sleep(1000);
// click on done button to close the travellers pop up
            Reusable_Actions.clickAction(driver, "//*[@data-testid='guests-done-button']", "Unable to click the travellers close button");

// click on the search button
            Reusable_Actions.clickAction(driver, "//*[@data-testid='submit-button']", "Unable to click the search button");
            Thread.sleep(2000);

            //capture all the search result in an arraylist and define with conditions
            try {
                ArrayList<WebElement> searchResultList = new ArrayList<>(driver.findElements(By.xpath("//*[@data-stid='open-hotel-information']")));
                // define conditions
                if (i == 0) {
                    searchResultList.get(0).click();

                } else if (i == 1) {
                    searchResultList.get(2).click();

                } else if (i == 2) {
                    searchResultList.get(1).click();

                }
            } catch (Exception e) {
                System.out.println("Unable to click the searchListResult links");
            }// end of conditions exception

// store new tabs in an arraylist , we can getWindowHandles method to get the list tabs
            Reusable_Actions.switchTabIndex(driver, 1);

// capture the hotels name and print it on console
            String hotelName = Reusable_Actions.getTextAction(driver, "//*[@class='uitk-heading-3']", "Unable to capture the name of the hotel");
            System.out.println("The headline of the hotel name for " + destination.get(i) + " is :: " + hotelName);
            Thread.sleep(2000);

//scroll a bit
            Reusable_Actions.scrollByPixel(driver, "scroll(0,1200)");
// scroll to price element
            // Reusable_Actions.scrollToElement(driver,"//*[@data-stid='price-summary']");

//get the price of the first hotel
            String hotelPrice = Reusable_Actions.getTextAction(driver, "//*[@data-stid='price-summary']", "Price");
            System.out.println(hotelPrice);
            Thread.sleep(2000);

//click the reserve button
            Reusable_Actions.clickByIndexAction(driver, "//*[text()='Reserve']", 0, "Reserve Button");
            Thread.sleep(2000);

//click the PayNow button
            Reusable_Actions.clickByIndexAction(driver, "//*[text()='Pay now']", 1, "pay now");
            Thread.sleep(3000);
//    driver.findElements(By.xpath("//span[text()='Pay now']")).get(1).click();

//            Thread.sleep(3000);

//scroll a bit
            Reusable_Actions.scrollByPixel(driver, "scroll(0,600)");
            Thread.sleep(2000);
// Capture all hotel room info
         String roomInfo =  Reusable_Actions.getTextAction(driver, "//*[@class=' with-small-icon icon-thin-tick']", "room info");
            System.out.println("The room information "+roomInfo);
            System.out.println("\n");
// close the current tab
            driver.close();

//switch to tab, it should be at index 0
            Reusable_Actions.switchTabIndex(driver, 0);

        } // end of for loop

        // quit
        driver.quit();

    }// end of main
}// end of java class
