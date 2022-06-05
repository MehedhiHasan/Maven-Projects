package Day09_052222;

import ReuseableLibraries.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class practice {
    public static void main(String[] args) throws InterruptedException {

       WebDriver driver =  Reusable_Actions.setDriver();
       driver.navigate().to("https://www.google.com/");
      Reusable_Actions.clickAction(driver,"//*[@title='Search']", "search");
     // Reusable_Actions.sendKeysAction(driver,"/*[@title='Search']", );
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("7575");
        //*[@title="Search"]
     //   driver.quit();
    }//end of main
}
