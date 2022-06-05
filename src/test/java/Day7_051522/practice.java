package Day7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/1252089/ww-studio--chelsea-new-york-ny");
        System.out.println(driver.findElement(By.id("studioWorkshopSchedule")).getText());


    }// end of main
}
