package Day7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class selectPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
//        options.addArguments("start-fullscreen");
        options.addArguments("incognito");

        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://www.mortgagecalculator.org/");
        Thread.sleep(2000);

        //must store the element in webelement
        WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));

        Select dropdown = new Select(startMonth);
        dropdown.selectByVisibleText("Apr");
        Thread.sleep(2000);
        dropdown.selectByValue("2");
        dropdown.selectByValue("3");
        dropdown.selectByValue("4");
        dropdown.selectByValue("5");
        dropdown.selectByValue("6");
        dropdown.selectByValue("7");
        dropdown.selectByIndex(0);
        dropdown.selectByIndex(1);
        dropdown.selectByIndex(4);
        dropdown.selectByIndex(5);
        dropdown.selectByIndex(8);
        WebElement loanType = driver.findElement(By.xpath("//*[@name='param[milserve]']"));

        Select loanTypeDropdown = new Select(loanType);
        loanTypeDropdown.selectByVisibleText("FHA");





    }// end of main
}
