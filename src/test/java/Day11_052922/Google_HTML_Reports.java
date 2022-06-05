package Day11_052922;

import ReuseableLibraries.Reusable_Actions;
import ReuseableLibraries.Reusable_Actions_loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Google_HTML_Reports {
    //declare the local driver outside so that it can be reusable with other annotations methods
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;

    //before suit will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver() {
        driver = Reusable_Actions.setDriver();
        //define the path to report
        reports = new ExtentReports("src/main/java/HTML_Reports/Automation.html", true);
    }// end of before suit annotation

    // test case 01: navigate to google and send keys to search field
    @Test(priority = 1)
    public void SearchForKeyword() {
        logger = reports.startTest("Search for a keyword");
        driver.navigate().to("https://www.google.com/");
        Reusable_Actions_loggers.sendKeysAction(driver, "//*[@name ='q']", "BMW", logger, "search field");
        Reusable_Actions_loggers.submitAction(driver, "//*[@name='btnK']", logger, "submit search button");
        reports.endTest(logger);
    } // end of test 01

    /* depends on method is used when following @ test method is dependent on previous test method.
     but when the first test method fails the following test methods are skipped*/
    @Test(dependsOnMethods = "SearchForKeyword")
    public void CaptureSearchNumber() {
        logger = reports.startTest("get text");
        // capture search result
        String result = Reusable_Actions_loggers.getTextAction(driver, "//*[@id='result-stats']", logger,"text");
        System.out.println(result);
        // split the result
        String[] arrayResult = result.split(" ");
        System.out.println(arrayResult[1]);
        logger.log(LogStatus.INFO,"Search result is " + arrayResult[1]);
        reports.endTest(logger);

    } // end of test 02

    @AfterSuite
    public void QuitSession() {
        driver.quit();
        reports.flush();
    }// end of after suit

}
