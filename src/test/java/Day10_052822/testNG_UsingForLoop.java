package Day10_052822;

import ReuseableLibraries.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class testNG_UsingForLoop {

    //declare the local driver outside so that it can be reusable with other annotations methods
    WebDriver driver;


    //before suit will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver() {
        driver = Reusable_Actions.setDriver();

    }// end of before suit annotation

    // test case 01: navigate to google and send keys to search field
    @Test(priority = 1)
    public void SearchForKeyword () {
        ArrayList<String> car = new ArrayList<>();
        car.add("Audi");
        car.add("Mercedes");
        car.add("Tesla");

        for (int i = 0; i < car.size(); i++) {

            driver.navigate().to("https://www.google.com/");
            Reusable_Actions.sendKeysAction(driver, "//*[@name ='q']", car.get(i), "search field");
            Reusable_Actions.submitAction(driver, "//*[@name='btnK']", "submit search button");
            // capture search result
            String result = Reusable_Actions.getTextAction(driver, "//*[@id='result-stats']", "text");
            System.out.println(result);
            // split the result
            String[] arrayResult = result.split(" ");
            System.out.println(car.get(i)+" is " +  arrayResult[1]);
        }// end of for loop
    } // end of test

    @AfterSuite
    public void QuitSession () {
        driver.quit();
    }// end of after suit

//    }// end of for loop

}// End of testNG

