package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsExample {
    public static void main(String[] args) throws InterruptedException {
        // go to bing click on second element of the links  by using class and index

        //set up chromedriver with webdrivermanager
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


        //define the webdriver i am going to use
        WebDriver driver = new ChromeDriver(options);

        // go to google
        driver.navigate().to("https://bing.com");
        Thread.sleep(3000);
        // click the images using lass property with index 1
        //to ignore white space in the property value we can use contains command in xpath

        driver.findElements(By.xpath("//li[contains(@class,'scope')]")).get(0).click();
        driver.findElements(By.xpath("//*[@class='img_cont hoff']")).get(0).click();

    }// end of main

}
