package Day09_052222;

import ReuseableLibraries.Reusable_Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);


        driver.navigate().to("https://www.citi.com");
        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        WebElement creditCards = driver.findElement(By.xpath("//*[text()='Credit Cards']"));
        actions.moveToElement(creditCards).perform();
        Thread.sleep(1000);
        // click on Small Business Credit Cards
        WebElement business = driver.findElement(By.xpath("//*[text()='Small Business Credit Cards']"));
        actions.moveToElement(business).click().perform();

        driver.findElement(By.xpath("//*[text()='More Categories']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Mastercard']")).click();
        Thread.sleep(3000);

        // define js
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement Citi = driver.findElement(By.xpath("//*[text()='Citi Simplicity']"));

        // jse.executeScript("arguments[0].scrollIntoView(true);",Citi);
        jse.executeScript("scroll(0,2000)");
        jse.executeScript("scroll(0,-2000)");
        WebElement investing = driver.findElement(By.xpath("//*[text()='Investing']"));
        actions.moveToElement(investing).perform();

        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        Reusable_Actions.clickAction(driver,"//*[text()='Compare']","click");
        Thread.sleep(2000);
        Boolean checkBox = driver.findElement(By.xpath("//*[text()='Compare']")).isSelected();
        System.out.println("is it selected?" + checkBox);


        Thread.sleep(3000);
        driver.quit();

    }//end of main
}
