package Day5_050822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class prctice2 {
    public static void main(String[] args) throws InterruptedException {
        // set up chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();

        // chrome options arguments

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");

        // defime the webdriver

        WebDriver driver = new ChromeDriver(options);

        ArrayList<String> desire =  new ArrayList<>();
        desire.add("Money");
        desire.add("plane");
        desire.add("House");

        for(int i =0; i< desire.size(); i++){

            driver.navigate().to("https://www.google.com/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(desire.get(i));
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();
            Thread.sleep(3000);
            String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            System.out.println(desire.get(i));
            System.out.println(result);

            System.out.println(result.substring(1,2));

            // using split
            String[] arrayResult = result.split(" ");
            System.out.println(arrayResult[1]);

        }//end of for loop
        driver.quit();


    }//end of main

}//End of java class
