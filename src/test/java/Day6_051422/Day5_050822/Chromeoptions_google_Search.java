package Day6_051422.Day5_050822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptions_google_Search {
    public static void main(String[] args) throws InterruptedException {

//set up chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();

        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximise the screen for windows
//        options.addArguments("start-maximized");
        // for mac
        options.addArguments("start-fullscreen");
        // set your driver as headless(running in background)
       // options.addArguments("headless");


        //define the webdriver i am going to use
        WebDriver driver = new ChromeDriver(options);

        // go to google
        driver.navigate().to("https://google.com");
        Thread.sleep(3000); // use to navigate to new page
        //maximise the windows
        //driver.manage().window().maximize(); // if not try fullScreen

        //locate element for search field and type keywords
        driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("Cars");
        //submit on google search button
        driver.findElement(By.xpath("//*[@name= 'btnK']")).submit();
        // capture the google search and print it
        String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        System.out.println("Result is " + searchResult);

        // print only the number doing the split method

        String[] arrayResult = searchResult.split(" ");

        //
        System.out.println(" my search result is "+ arrayResult[1]);

        //     driver.findElement(By.className("LC20lb")).click();


        //quit the driver
        //driver.close();
        driver.quit();

    }//end of main
}
