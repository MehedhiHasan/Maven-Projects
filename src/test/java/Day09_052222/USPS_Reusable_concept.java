package Day09_052222;

import ReuseableLibraries.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class USPS_Reusable_concept {
    public static void main(String[] args) {

        // setting the local driver to reusable setDriver method
        WebDriver driver = Reusable_Actions.setDriver();

        // navigate to USPS
        driver.navigate().to("https://www.usps.com");

        //hovering to the quick tools
        Reusable_Actions.mouseHover(driver, "//*[text()='Quick Tools']", " Quick tools");
        // hover to send tab
        Reusable_Actions.mouseHover(driver, "//*[@id='mail-ship-width']", " Quick Tab");
        //click on calc price
        Reusable_Actions.clickAction(driver, "//*[@class='tool-calc']", " Calculate price");
        //enter the zipcode
        Reusable_Actions.sendKeysAction(driver,"//*[@id='Origin']","22222"," Zip code");
// print out header text

       String result =  Reusable_Actions.getTextAction(driver,"//*[@class='header-usps row']", "gettext");
       System.out.println(result);

// verify title
       // Reusable_Actions.verifyTitle(driver, " aksdlkflajd");

  // verify switch tb by index
//        Actions mouseActions2 = new Actions(driver);
//        WebElement newWindow = driver.findElement(By.xpath("id='navbusiness']")).
//        mouseActions2.moveToElement(newWindow).perform();

     //   Reusable_Actions.switchTabIndex(driver,"//*[text()='USPS Connect']", 1);





    }//end of main
}//end of class
