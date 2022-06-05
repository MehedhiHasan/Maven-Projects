package Day12_060422;

import Reusable_Classes.Reusable_Annotation_Class;
import ReuseableLibraries.Reusable_Actions;
import ReuseableLibraries.Reusable_Actions_loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Google_HTML_With_Reusable_Method extends Reusable_Annotation_Class {

    @Test(priority = 1)
    public void SearchForKeyword() {

        driver.navigate().to("https://www.google.com/");
        Reusable_Actions_loggers.sendKeysAction(driver, "//*[@name ='q']", "BMW", logger, "search field");
        Reusable_Actions_loggers.submitAction(driver, "//*[@name='btnK']", logger, "submit search button");

    } // end of test 01

    /* depends on method is used when following @ test method is dependent on previous test method.
     but when the first test method fails the following test methods are skipped*/
    @Test(dependsOnMethods = "SearchForKeyword")
    public void CaptureSearchNumber() {

        // capture search result
        String result = Reusable_Actions_loggers.getTextAction(driver, "//*[@id='result-stats']", logger,"text");
        System.out.println(result);
        // split the result
        String[] arrayResult = result.split(" ");
        System.out.println(arrayResult[1]);
        logger.log(LogStatus.INFO,"Search result is " + arrayResult[1]);


    } // end of test 02


}
