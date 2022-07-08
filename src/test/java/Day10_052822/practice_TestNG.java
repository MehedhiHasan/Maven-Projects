package Day10_052822;

import ReuseableLibraries.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class practice_TestNG {
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;

    public void beforeSuit() {
        Reusable_Actions.setDriver();
        reports = new ExtentReports("src/main/java/HTML_Reports/jetBlueHTMLReports.html", true);
    }
    @BeforeMethod
    public void getTestName(Method testName){
        logger = reports.startTest(testName.getName());
    }// end of before method
    @Test
    public void testFile() {
        driver.navigate().to("https://www.google.com/");
//        logger.log(LogStatus.PASS,"pass");
//        logger.log(LogStatus.FAIL,"fail");
    }

    //


    @AfterMethod
    public void afterMethod() {
      reports.endTest(logger);

    }
    @AfterSuite
    public void afterSuit() {
        driver.quit();
    }

}// end of class
