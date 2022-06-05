package Reusable_Classes;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
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

import java.util.ArrayList;

public class Reusable_Actions_loggers {
    // set a timeout variable for all tje explicit
    static int timeout = 10;

// reusable function for webDriver as a return method

    public static WebDriver setDriver() {

        //set up chromedriver with WebdriverManager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximise the screen for windows
        options.addArguments("start-fullscreen");
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
    public static void clickAction(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.click();
            logger.log(LogStatus.PASS, "Successfully click on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "failed to click on element " + elementName + " " + e);
        }
    }//end of clickAction

    // create a click method for click popup handle
    public static void popUpHandleClick(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.click();
            logger.log(LogStatus.PASS, "Successfully click on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on  popup element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "failed to click on element " + elementName + " " + e);
        }
    }//end of popup clickAction

    // create a submit method
    public static void submitAction(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.submit();
            logger.log(LogStatus.PASS, "Successfully submit on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to submit on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "failed to submit on element " + elementName + " " + e);
        }
    }//end of clickAction

    //create a sendKeys method
    public static void sendKeysAction(WebDriver driver, String xpath, String userValue, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.sendKeys(userValue);
            logger.log(LogStatus.PASS, "Successfully enter user value " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to send values on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to send values " + elementName);
        }
    }//end of sendKeys method

    //create a sendKeys method by index
    public static void sendKeysActionByIndex(WebDriver driver, String xpath, int index, String userValue, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
            element.sendKeys(userValue);
            logger.log(LogStatus.PASS, "Successfully enter user value " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to send values on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to send values " + elementName);
        }
    }//end of sendKeys method

    //create a gettext method
    public static String getTextAction(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        String result = null;
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            result = element.getText();
            logger.log(LogStatus.PASS, "pass" + elementName);
        } catch (Exception e) {
            System.out.println("Unable to capture text " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to gget text" + elementName + " " + e);
        }
        return result;
    }//end of gettext method

    //create a getText by index method
    public static String getTextByIndexAction(WebDriver driver, String xpath, int index, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        String result = null;
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
            result = element.getText();
            logger.log(LogStatus.PASS, "pass" + elementName);
        } catch (Exception e) {
            System.out.println("Unable to capture text " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to gget text" + elementName + " " + e);
        }
        return result;
    }//end of gettext method

    //create a click index method
    public static void clickByIndexAction(WebDriver driver, String xpath, int indexNumber, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber);
            element.click();
            logger.log(LogStatus.PASS, "pass" + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to gget text" + elementName + " " + e);
        }
    }//end of clickAction


    // create a selectByText method
    public static void selectbytextAction(WebDriver driver, String xpath, String visibleText, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            Select elementDropdown = new Select(element);
            elementDropdown.selectByVisibleText(visibleText);
            logger.log(LogStatus.PASS, "pass" + elementName);

        } catch (Exception e) {
            System.out.println("Unable to select a element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to get text" + elementName + " " + e);
        }
    }//end of Select method

    //create  verify title method
    public static void verifyTittleAction(WebDriver driver, String ActualTittle, ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            String title = driver.getTitle();
            if (title.contains(ActualTittle)) {
                System.out.println("My title matches. Actual title is " + title);
                logger.log(LogStatus.PASS, "Successfully able to get the title");
            } else {
                System.out.println("My title does not match. Actual title is " + title);
                logger.log(LogStatus.FAIL, "Unable to get the title");
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


    public static void verifyStatusOfElement(WebDriver driver, String xpath, Boolean expectedStatus, ExtentTest logger, String ElementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            Boolean actualStatus = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='checkbox']"))).isSelected();
            if (expectedStatus == actualStatus) {
                logger.log(LogStatus.PASS, "Element is selected as expected");
            } else {
                logger.log(LogStatus.FAIL, "Element is not selected");
            }
        } catch (Exception e) {
            logger.log(LogStatus.INFO, "Element has issues" + e);
        }

    }//end of method


}//end of reusable actions
