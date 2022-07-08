package Day10_052822;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert_hardAssert {
    WebDriver driver;
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void Assert(){

        softAssert.assertTrue(true);
        softAssert.assertEquals("hello","Hello");
        softAssert.assertEquals("HI","HI");
        System.out.println("hello assertion");
        softAssert.assertAll();
    }

    @Test
    public void HardAssert() throws InterruptedException {
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        Assert.assertTrue(true);
        Assert.assertEquals("Google",driver.getTitle());
        System.out.println(driver.getTitle() + " Successfully passed");


    }

}
