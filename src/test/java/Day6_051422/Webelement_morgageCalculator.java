package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webelement_morgageCalculator {
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


        //define the webdriver i am going to use
        WebDriver driver = new ChromeDriver(options);

        // navigate to morgage claculator
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);

        // click, clear and enter new value on home field

        WebElement homeValue = driver.findElement(By.xpath("//*[@id='homeval']"));
        homeValue.click();
        homeValue.clear();
        homeValue.sendKeys("45000");

        // click on % radio button

        driver.findElement(By.xpath("//*[@value='percent']")).click();

        // click, clear and enter new value on downpayment field

        WebElement downPayment = driver.findElement(By.xpath("//*[@id='downpayment']"));
      downPayment.click();
      downPayment.clear();
      downPayment.sendKeys("10000");



    }// end of main
}
