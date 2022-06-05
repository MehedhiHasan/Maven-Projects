package Day11_052922;

import ReuseableLibraries.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class USPS_List_webElement {

    //declare the local driver outside so that it can be reusable with other annotations methods
    WebDriver driver;


    //before suit will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver() {
        driver = Reusable_Actions.setDriver();

    }// end of before suit annotation

    @Test
    public void USPS_Tabs_Count(){
        //navigae to usps
        driver.navigate().to("https://www.usps.com/");
        WebDriverWait wait = new WebDriverWait(driver,10);
        // store tabs as a list to get the count
        List<WebElement> tabsCount = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]")));
        System.out.println("Tabs count is "+tabsCount.size());

        for(int i = 0; i< tabsCount.size(); i++){
//            driver.navigate().to("https://www.usps.com/");
            List<WebElement> tabsCount2 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]")));
            tabsCount2.get(i).click();
        }// end of loop
    }// end of test


    @AfterSuite
    public void QuitSession() {
        driver.quit();
    }// end of after suit

}
