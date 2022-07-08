package New36Question;

import Reusable_Classes.Reusable_Annotation_Class;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class Cross_Browser_Testing extends Reusable_Annotation_Class {
// cross browser testing
    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) throws Exception{
//Check if parameter passed from TestNG is 'firefox'
        if(browser.equalsIgnoreCase("Firefox")){
//create firefox instance
            WebDriverManager.firefoxdriver().setup(); //initialize Firefox browser
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.google.com");
            WebElement element = driver.findElement(By.xpath("//*[@name='q']"));
            element.sendKeys("Cross Browser Testing");
            element.submit();
            Thread.sleep(1000);
            System.out.println("Successfully navigate to google");
        }
//Check if parameter passed as 'chrome'
        else if(browser.equalsIgnoreCase("Chrome")){
//set path to chromedriver.exe
            WebDriverManager.chromedriver().setup(); //initialize Chrome browser
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.yahoo.com");
            WebElement element = driver.findElement(By.xpath("//*[@name='p']"));
            element.sendKeys("Cross Browser Testing");
            element.submit();
            Thread.sleep(1000);
            System.out.println("Successfully navigate to yahoo");
        }
        else if(browser.equalsIgnoreCase("Edge")){
//set path to Edge.exe
            WebDriverManager.edgedriver().setup(); //initialize Edge browser
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.bing.com");
            WebElement element = driver.findElement(By.xpath("//*[@name='q']"));
            element.sendKeys("Cross Browser Testing");
            element.submit();
            Thread.sleep(1000);
            System.out.println("Successfully navigate to bing");
        }
        else{
//If no browser is passed throw exception
            throw new Exception("Incorrect Browser");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
