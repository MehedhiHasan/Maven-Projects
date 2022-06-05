package Day7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class Exception_mortgageCalc {
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

        ArrayList<String> pPriceList = new ArrayList<>();
        pPriceList.add("18000");
        pPriceList.add("20000");
        pPriceList.add("22000");

        ArrayList<String> sMonthlyList = new ArrayList<>();
        sMonthlyList.add("Jun");
        sMonthlyList.add("Jul");
        sMonthlyList.add("Aug");

        for(int i =0; i< pPriceList.size(); i++ ){


        // navigate to mortgage calculator
        driver.navigate().to("https://www.mlcalc.com");
        Thread.sleep(3000);

        // handle exception for purchase price
        try{
            WebElement pPrice = driver.findElement(By.xpath("//*[@id='ma']"));
            pPrice.clear();
            pPrice.sendKeys(pPriceList.get(i));
        }catch(Exception e){
            // print out the exception
            System.out.println("Unable t0 locate home value " + e);
        }// end of pp exception


        // handle exception for showing advance option button
        try{
           driver.findElement(By.xpath("//*[text()='Show advanced options']")).click();
        }catch(Exception error){
            // print out the exception
            System.out.println("Unable to locate Show advanced options " + error);
        }// end of Show advanced options exception


        // handle exception for start month drop down
        try{
         WebElement startMonth = driver.findElement(By.xpath("//*[@name='sm']"));
         Select dropdown = new Select(startMonth);
         dropdown.selectByVisibleText(sMonthlyList.get(i));
        }catch(Exception error){
            // print out the exception
            System.out.println("Unable to locate dropdown " + error);
        }// end of dropdown exception


        // handle exception for calculator
        try{
            driver.findElement(By.xpath("//*[@value='Calculate']")).click();
        }catch(Exception error){
            // print out the exception
            System.out.println("Unable to locate calculator " + error);
        }// end of calculator exception


        // handle exception for result
        try{
          String monPayment =  driver.findElements(By.xpath("//*[@   style='font-size: 32px']")).get(0).getText();
            System.out.println("monthly payment " + monPayment);
        }catch(Exception error){
            // print out the exception
            System.out.println("Unable to locate calculator " + error);
        }// end of result exception

        }// End of for loop

        driver.quit();

    }// end of main

}
