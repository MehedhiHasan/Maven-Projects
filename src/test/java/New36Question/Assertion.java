package New36Question;

import Reusable_Classes.Reusable_Actions_POM_Loggers;
import Reusable_Classes.Reusable_Annotation_Class;
import ReuseableLibraries.Reusable_Actions;
import ReuseableLibraries.Reusable_Actions_loggers;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion extends Reusable_Annotation_Class {

    @Test
    public void hardAssertion(){
        Reusable_Actions_loggers.navigateToWeb(driver,"https://google.com");
        Assert.assertTrue(true);
        Assert.assertEquals("Google",driver.getTitle());
        System.out.println(driver.getTitle());
    }
    @Test
    public void softAssertion(){

        Reusable_Actions_loggers.navigateToWeb(driver,"https://google.com");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(true);
        softAssert.assertEquals("google", driver.getTitle());
        System.out.println("Actual title is "+driver.getTitle());
        softAssert.assertAll();
    }

}

