package Day12_060422;

import Reusable_Classes.Reusable_Annotation_Class;
import ReuseableLibraries.Reusable_Actions;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Boolean_check_Google_box extends Reusable_Annotation_Class {

    @Test(priority = 2)
    public void Yahoo_Stay_Signed_In_Checkbox_Verification() {
        //navigae to usps
        driver.navigate().to("https://www.yahoo.com/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Reusable_Actions.clickAction(driver, "//*[text() = 'Sign in']", "sign in");
//        WebDriverWait  wait = new WebDriverWait(driver, 10);
        // instead of visibiltyOfEleement, use presence of element
        Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type = 'checkbox']"))).isSelected();
        if (elementState == true) {
            logger.log(LogStatus.PASS, "checkbox is selected as expected");
        } else {
            logger.log(LogStatus.FAIL, "checkbox is not selected");
        }

    }// end of test

    @Test(priority = 1)
    public void navigateToYahoo() {

        logger.log(LogStatus.INFO, "Navigating to homepage");
        driver.navigate().to("https://www.yahoo.com");
    }

}// end of class
