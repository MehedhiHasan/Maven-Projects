package Day7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Select_MortgageCalc {
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
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);

        // select start

        WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));

        // define select command
       // Select dropDown = new Select(startMonth);
        // select by visible text
     //   dropDown.selectByVisibleText("Jun");


        // clicking on dropdown and its value if the dropdown tag is not select tag
        startMonth.click();
        // click on the value of the start month
        driver.findElement(By.xpath("//*[text()='Jun']")).click();


        WebElement loanType = driver.findElement(By.xpath("//*[@name='param[milserve]']"));

        // define select command
        Select loanTypeDropdown = new Select(loanType);
        // select by visible text
        loanTypeDropdown.selectByVisibleText("USDA");

    }//end of main
}// end of java class
