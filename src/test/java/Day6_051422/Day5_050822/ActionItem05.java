package Day6_051422.Day5_050822;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ActionItem05 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //define the Webdriver
        WebDriver driver = new ChromeDriver();

        //adding values to an  arraylist
        ArrayList<String> hobby = new ArrayList<>();
        hobby.add("programming");
        hobby.add("automation");
        hobby.add("Soccer");
        hobby.add("traveling");
        hobby.add("swimming");

        // using while loop to iterate through the arraylist to run on the console
        int i = 0;
        while(i< hobby.size()) {

            //go to bing.com
            driver.navigate().to("https://www.bing.com/");
            // few seconds to wait
            Thread.sleep(3000);
            //entering keyword on search field
            driver.findElement(By.xpath("//*[@id='sb_form_q']")).sendKeys(hobby.get(i));
            //Click the search button
            driver.findElement(By.id("search_icon")).click();
            Thread.sleep(2000);
            //copy the search result
            String searchMessage = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            // split the search number for each value
            String[] splitSearchMessage = searchMessage.split(" ");
            // printing the values along with the arraylist
            System.out.println("My hobby is "+hobby.get(i) +".Total search result is "+ splitSearchMessage[0]);
            //incrementing iteration
            i++;

        }// end of loop
        //quit the driver
        driver.quit();

    }//end of main
}// end of java class
