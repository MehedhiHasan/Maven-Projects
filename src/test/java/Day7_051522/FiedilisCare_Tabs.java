package Day7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class FiedilisCare_Tabs {
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

        // navigate to mortgage claculator
        driver.navigate().to("https://www.fideliscare.org");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='root-2']")).click();
        Thread.sleep(3000);

        //click on medicated managed care
//        driver.findElements(By.xpath("//*[text() ='Medicaid Managed Care']")).get(0).click();
//        Thread.sleep(2000);

        //click n search under find a doctor card
//
        driver.findElements(By.xpath("//*[text()='Provider Portal']")).get(0).click();
        Thread.sleep(2000);

        // sore new tabs in an arraylist , we can getWindowHandles method to get the list tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        //switch to new tab, it should be at index 1
        driver.switchTo().window(tabs.get(1));

        //click on new search button
//        driver.findElement(By.xpath("//*[@class='fal fa-search-plus']")).click();
//        Thread.sleep(2000);

        // close the new tab
//      driver.close();


        // switch back to default tab
//       driver.switchTo().window(tabs.get(0));

        // then click on providers card
//        driver.findElement(By.xpath("//*[@class='fal fa-stethoscope fa-fw']")).click();
//        Thread.sleep(2000);


    }// end of main
}// end of java class
