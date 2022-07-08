package Day08_0052122;

import Reusable_Classes.Reusable_Actions_POM_Loggers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getTitleExample {
    public static void main(String[] args) {


        //set up chromedriver with WebdriverManager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximise the screen for windows
        // options.addArguments("start-fullscreen");
       // options.addArguments("headless");
        //Define WebDriver
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://www.google.com/");
        // capture the title of the page and compare it with expected title "google"
        String actualTitle = driver.getTitle();
        if (actualTitle.equals("Google")) {
            System.out.println("My title matches");
        } else {
            System.out.println("Title does not match. Actual title is " + actualTitle);
        }

        Reusable_Actions_POM_Loggers.navigateToWeb(driver,"https://www.apple.com");
        String title = driver.getTitle();
        System.out.println(title);
        if(title.equals("Google")){
            System.out.println("match");
        }else if(title.contains("Apple")){
            System.out.println("title match with contain");
        }else{
            System.out.println("title did not match");
        }



        driver.quit();




//        System.out.println(driver.getTitle().equals("Google"));
    }// end of main
}
