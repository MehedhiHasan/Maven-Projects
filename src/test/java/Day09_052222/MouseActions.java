package Day09_052222;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
    public static void main(String[] args) throws InterruptedException {
            //set up chromedriver with WebdriverManager
            WebDriverManager.chromedriver().setup();
            //set chrome options arguments
            ChromeOptions options = new ChromeOptions();
            //set the condition to incognito mode
            options.addArguments("incognito");
            //set the condition to maximise the screen for windows
           // options.addArguments("start-fullscreen");
            // options.addArguments("headless");
            //Define WebDriver
            WebDriver driver = new ChromeDriver(options);

            // go to usps.com
        driver.navigate().to("https://www.usps.com/");
        Thread.sleep(3000);
        //declare and define mouse actions

        Actions mouseActions = new Actions(driver);

        //hover to send tab
        WebElement sendTab = driver.findElement(By.xpath("//*[@id='mail-ship-width']"));
        mouseActions.moveToElement(sendTab).perform();

        // tracking on using mouse actions
        WebElement tracking = driver.findElement(By.xpath("//*[text()='Tracking']"));
        mouseActions.moveToElement(tracking).click().perform();
        Thread.sleep(3000);

// type a invalid trcking number using sendkeys with mouse actions
        WebElement trackingField = driver.findElement(By.xpath("//*[@id='tracking-input']"));
        mouseActions.moveToElement(trackingField).click().perform();
        mouseActions.moveToElement(trackingField).sendKeys("321545245").perform();

//





        }//end of main
}// ed of main
