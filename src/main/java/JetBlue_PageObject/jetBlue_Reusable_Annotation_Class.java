package JetBlue_PageObject;

import Reusable_Classes.Reusable_Actions_loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class jetBlue_Reusable_Annotation_Class {
    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest logger;

    //
    @BeforeSuite
    public void SetChromeDriver() {
        driver = Reusable_Actions_loggers.setDriver();
        //define the path to report
        reports = new ExtentReports("src/main/java/HTML_Reports/jetBlueHTMLReports.html", true);


    }// end of before suit annotation

    //Set Before method to capture test name for each @test.  so it can add to the html reports later

    @BeforeMethod
    public void getTestName(Method testName){
        logger = reports.startTest(testName.getName());
    }// end of before method

    @AfterMethod
    public void endLogger(){
        reports.endTest(logger);
    }/// end of after method

    @AfterSuite
    public void QuitSession() {
        driver.quit();
        reports.flush();
    }// end of after suit


}// end of class
