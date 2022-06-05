package Day7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;
import java.util.ArrayList;

public class ActionItem04 {
    public static void main(String[] args) throws InterruptedException {

        //set up chromedriver with WebdriverManager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximise the screen for windows
        options.addArguments("start-fullscreen");
        //Define WebDriver
        WebDriver driver = new ChromeDriver(options);

        // Creating an arrayList of 3 different zip code
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11417");
        zipCode.add("10031");
        zipCode.add("10472");

        //writing a for loop to iterate through the locations
        for (int i = 0; i < zipCode.size(); i++) {

            // 1 Navigate to  weight watcher
            try {
                driver.navigate().to("https://www.weightwatchers.com/");
            } catch (Exception e) {
                System.out.println("This is a invalid website " + e);
            }// end of navigating Exception
            // wait for 2 seconds to load
            Thread.sleep(2000);

            // 2 Click on Attend dropdown
            try {
                driver.findElement(By.xpath("//*[@aria-label='Expand sub menu']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Attend Dropdown " + e);
            }// End of dropdown exception

            // 3 Click on Unlimited Workshops button
            try {
                driver.findElements(By.xpath("//*[text() = 'Unlimited Workshops']")).get(1).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Unlimited Workshops Button " + e);
            }// End of Unlimited button Exception
            // wait for reload the page
            Thread.sleep(2000);

            // 4 Click on Studio link
            try {
                driver.findElements(By.xpath("//*[@class='buttonText-3DCCO']")).get(1).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Studio Button " + e);
            }// End of Studio link Exception


            // 5 Click and clear the filed to enter the zipcode using sendKeys
            try {
                WebElement location = driver.findElement(By.xpath("//*[@id='location-search']"));
                location.clear();
                location.click();
                location.sendKeys(zipCode.get(i)); // using for loop send zipCodes define in ArrayList
            } catch (Exception e) {
                System.out.println("Unable to Clear, Click & SendKeys using for Loop " + e);
            }// End of zipCode SendKeys link Exception

            // 6 click on Search Arrow
            try {
                driver.findElement(By.xpath("//*[@id='location-search-cta']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Search Arrow " + e);
            }// End of Search Arrow Exception
            //wait 2 seconds to load
            Thread.sleep(2000);
            //7 Click on separate link on studio and capture addresses using conditions
            try {
                WebElement studioLinks = driver.findElements(By.xpath("//*[@class='linkUnderline-1_h4g']")).get(i);
                //conditions for iteration
                if (i == 2) {
                    studioLinks.click(); // Click on the link
                    Thread.sleep(2000);
                    //Store the address and print on console
                    String Address = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                    // print the address
                    System.out.println("For zipCode 11417, the Studio Link address is: \n\n" + Address);

                }  else if (i == 1) {
                    studioLinks.click();
                    Thread.sleep(2000);
                    String Address = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                    System.out.println("For zipCode 10009, the Studio Link address is:\n\n" + Address);
                } else if (i == 0){
                    studioLinks.click();
                    Thread.sleep(2000);
                    String Address = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                    System.out.println("For zipCode 10472, the Studio Link address is:\n\n" + Address);
                }// end of condition

            } catch (Exception e) {
                System.out.println("conditions did not find elements " + e);
            }// end of if else Exception

            //8 Scroll down using JavascriptExecutor and capture the entire table
            try {
//                 declare javascriptExecutor variable
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                //scroll 600px down to the table
//                jse.executeScript("scroll(0,600)");
                // declare an empty line before and after printing table
                System.out.println("\n Virtual Workshops schedule is : \n");
                // get the text from the virtual Schedule
                System.out.println(driver.findElement(By.id("studioWorkshopSchedule")).getText());
                // print a empty line
                System.out.println("\n");
            } catch (Exception e) {
                System.out.println("Unable to capture the table " + e);
            }// End of capturing table exception
        }// end of for loop

        //quit the driver
        driver.quit();

    } // End of main method
} //end of java class
