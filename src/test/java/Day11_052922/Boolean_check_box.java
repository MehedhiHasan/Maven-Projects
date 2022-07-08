package Day11_052922;

import ReuseableLibraries.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Boolean_check_box {
    //declare the local driver outside so that it can be reusable with other annotations methods
    WebDriver driver;


    //before suit will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver() {
        driver = Reusable_Actions.setDriver();

    }// end of before suit annotation

    @Test
    public void USPS_Tabs_Count() throws InterruptedException {
        //navigae to usps
        driver.navigate().to("https://www.yahoo.com/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Reusable_Actions.clickAction(driver, "//*[text() = 'Sign in']", "sign in");
//        WebDriverWait  wait = new WebDriverWait(driver, 10);
        // instead of visibiltyOfEleement, use presence of element
        Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type = 'checkbox']"))).isSelected();
        System.out.println("Is element checked? " + elementState);
        Thread.sleep(2000);
    }// end of test

    @AfterSuite
    public void QuitSession() {
        driver.quit();
    }// end of after suit
}
