package ReuseableLibraries;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.ArrayList;

public class Reusable_Actions {
    // set a timeout variable for all tje explicit
    static int timeout = 20;

// reusable function for webDriver as a return method

    public static WebDriver setDriver() {

        //set up chromedriver with WebdriverManager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximise the screen for windows
//        options.addArguments("start-fullscreen");
        // options.addArguments("headless");
        //Define WebDriver
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }// end of set driver method

    // create a mouse hover method
    public static void mouseHover(WebDriver driver, String xpath, String elementName) {
        //declare and define explicit wait
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        Actions actions = new Actions(driver);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            actions.moveToElement(element).perform();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }// end of mouse hover

    // create a click method
    public static void clickAction(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }//end of clickAction

    // create a click method for popup
    public static void popUpHandleClick(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.click();
        } catch (Exception e) {
            System.out.println("Unable to click on  popup element " + elementName + " " + e);
        }
    }//end of clickAction

    // create a submit method
    public static void submitAction(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.submit();
        } catch (Exception e) {
            System.out.println("Unable to submit on element " + elementName + " " + e);
        }
    }//end of clickAction

    //create a sendKeys method
    public static void sendKeysAction(WebDriver driver, String xpath, String userValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.sendKeys(userValue);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }//end of sendKeys method

    //create a gettext method
    public static String getTextAction(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        String result = null;
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            result = element.getText();
        } catch (Exception e) {
            System.out.println("Unable to capture text " + elementName + " " + e);
        }
        return result;
    }//end of gettext method

    //create a click index method
    public static void clickByIndexAction(WebDriver driver, String xpath, int indexNumber, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber);
            element.click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }//end of clickAction


    // create a selectByText method
    public static void selectbytextAction(WebDriver driver, String xpath, String visibleText, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            Select elementDropdown = new Select(element);
            elementDropdown.selectByVisibleText(visibleText);

        } catch (Exception e) {
            System.out.println("Unable to select a element " + elementName + " " + e);
        }
    }//end of Select method

    //create  verify title method
    public static void verifyTittleAction(WebDriver driver, String ActualTittle) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            String title = driver.getTitle();
            if (title.contains(ActualTittle)) {
                System.out.println("My title matches. Actual title is " + title);
            } else {
                System.out.println("My title does not match. Actual title is " + title);
            }// end of condition
        } catch (Exception e) {
            System.out.println("Unable to verify title " + e);
        }
    }// end 0f getTitle method
// create switch tab by index

    public static void switchTabIndex(WebDriver driver, int index) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(index));
        } catch (Exception e) {
            System.out.println("Unable to switch tav " + e);
        }
    }// End of switch tab

    // Navigate to new website
    public static void navigateToWeb(WebDriver driver, String webUrl) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            driver.navigate().to(webUrl);
        } catch (Exception e) {
            System.out.println("Unabel to navigate to new website url " + e);
        }
    }// end of navigation


    // scroll to new area by pixel
    public static void scrollByPixel(WebDriver driver, String pixel) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript(pixel);
        } catch (Exception e) {
            System.out.println(" Unable to scroll " + e);
        }
    }// end of scrolling by pixel


    // scroll to new element by locator
    public static void scrollToElement(WebDriver driver, String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollIntoView(true);", xpath);
        } catch (Exception e) {
            System.out.println(" Unable to scroll to element " + e);
        }
    }// end of scrolling by pixel


}//end of reusable actions
