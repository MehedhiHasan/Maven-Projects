package Day10_052822;

import ReuseableLibraries.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestNG_example {

    //declare the local driver outside so that it can be reusable with other annotations methods
    WebDriver driver;


    //before suit will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver() {
        driver = Reusable_Actions.setDriver();

    }// end of before suit annotation

    // test case 01: navigate to google and send keys to search field
    @Test(priority = 1)
    public void SearchForKeyword() {

        driver.navigate().to("https://www.google.com/");
        Reusable_Actions.sendKeysAction(driver, "//*[@name ='q']", "BMW", "search field");
        Reusable_Actions.submitAction(driver, "//*[@name='btnK']", "submit search button");

    } // end of test 01

    /* depends on method is used when following @ test method is dependent on previous test method.
     but when the first test method fails the following test methods are skipped*/
    @Test(dependsOnMethods = "SearchForKeyword")
    public void CaptureSearchNumber() {
        // capture search result
        String result = Reusable_Actions.getTextAction(driver, "//*[@id='result-stats']", "text");
        System.out.println(result);
        // split the result
        String[] arrayResult = result.split(" ");
        System.out.println(arrayResult[1]);

    } // end of test 02
    @AfterSuite
    public void QuitSession() {
        driver.quit();
    }// end of after suit

//    }// end of for loop

}// End of testNG
