package Day6_051422;

import ReuseableLibraries.ReusableMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_Morgage {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();


        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximise the screen for windows
//        options.addArguments("start-maximized");
        // for mac
        //  options.addArguments("start-fullscreen");
        // set your driver as headless(running in background)
        // options.addArguments("headless");

        WebDriver driver = new ChromeDriver(options);

        // navigate to morgage claculator
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);

        // declare javascriptexecutor variable
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //scroll to pixel 400 o website
   //     jse.executeScript("scroll(0,1000)");
        // wait a bit for browser for scrolling
       // Thread.sleep(3000);

        //declare a webelement variable  what we want to scroll into

        WebElement shareButton = driver.findElement(By.xpath("//*[@id='share_button']"));

        // scroll into share this button
        jse.executeScript("arguments[0].scrollIntoView(true);",shareButton );
        Thread.sleep(3000);

        // click the button now
        shareButton.click();
        Thread.sleep(2000);

        // scroll back up
        jse.executeScript("scroll(0,-1000)");

        // close the window
        driver.quit();

    }// end of main
}// end of class
