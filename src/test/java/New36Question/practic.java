package New36Question;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class practic {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximised");
        WebDriver driver = new ChromeDriver(options);

//
//        String a = "mehedhi";
//        String [] rewsult = a.split("e");
//        System.out.println(rewsult[0]);
//
//        // "//*[contains(text,'abc')]"
//        driver.manage().window().maximize();
//
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        WebElement element = driver.findElement(By.xpath("//*[@id ='abc']"));
//        jse.executeScript("scroll(0,100)");
//        jse.executeScript("arguments[0].scrollIntoView(true);", element);
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        Actions action = new Actions(driver);
//        action.moveToElement(element).sendKeys("a").perform();
//
//        Select dropdown = new Select(element);
//        dropdown.selectByVisibleText("hero");
//        dropdown.selectByValue("heroin");
//        dropdown.selectByIndex(1);
//
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));


        driver.get("https://www.google.com");
//        Assert.assertTrue(true);
//        Assert.assertEquals("Google",driver.getTitle());
//        System.out.println("hard assertion fails here");
//        System.out.println(driver.getTitle());
//
//
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertTrue(true);
//        driver.get("https://www.google.com");
//
//        softAssert.assertEquals("Google",driver.getTitle());
//        System.out.println("hard assertion fails here");
//        System.out.println(driver.getTitle());
//        softAssert.assertAll();

   List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        HashMap<String, String> cities = new HashMap<String, String>();
        cities.put("bronx", "2");
        cities.put("Brooklyn", "2");
        cities.put("bronx", "2");

        System.out.println(cities.size());

        for(String i : cities.keySet()){
            System.out.println(i);
        }







    }
}
