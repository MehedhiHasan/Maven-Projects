package JetBlue;

import ReuseableLibraries.Reusable_Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        //define the webdriver i am going to use
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.jetblue.com/");
        Thread.sleep(2000);
        driver.switchTo().frame(1);
        Reusable_Actions.popUpHandleClick(driver, "//a[text()='Accept All Cookies']", "popup");
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id='jb-autocomplete-1-search']")).click();
//        driver.findElement(By.xpath("//*[@id='jb-autocomplete-1-search']")).sendKeys("hello");

    }
}
