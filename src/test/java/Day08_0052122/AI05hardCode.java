package Day08_0052122;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AI05hardCode {
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
        driver.navigate().to("https://www.hotels.com/");
        WebElement destinationToGo = driver.findElements(By.xpath("//*[@class='uitk-fake-input uitk-form-field-trigger']")).get(0);
        destinationToGo.click();
        destinationToGo.sendKeys("Los Angeles");
        Thread.sleep(2000);
        // click the check in button
        driver.findElement(By.xpath("//*[@ id='d1-btn']")).click();
        // click the date
        driver.findElement(By.xpath("//*[@aria-label='Jun 4, 2022 selected, current check in date.']")).click();
        // click done button
        driver.findElements(By.xpath("//*[@data-stid='apply-date-picker']")).get(0).click();
        // click on checkout date
       driver.findElements(By.xpath("//*[@data-stid='open-date-picker']")).get(1).click();
       // click the checkout date
        driver.findElement(By.xpath("//*[@aria-label='Jun 10, 2022 selected, current check out date.']")).click();
//        driver.findElement(By.xpath("//*[@data-stid='apply-date-picker']")).click();


    }// end of main
}
