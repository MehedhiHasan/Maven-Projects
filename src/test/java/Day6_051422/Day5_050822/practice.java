package Day6_051422.Day5_050822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practice {
    public static void main(String[] args) throws InterruptedException {

        //set up chromedriver with webdriver manager
        WebDriverManager.chromedriver().setup();

        //set Chromoptions argumanets
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("incognito");
      //  options.addArguments("start-fullscreen");
        options.addArguments("headless");

        //defining the Webdriver
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.guru99.com/chrome-options-desiredcapabilities.html");
        Thread.sleep(3000);

        String result=  driver.findElement(By.xpath("//*[@id='what_is_chromeoptions_class']")).getText();

        Thread.sleep(3000);
        String result2 = driver.findElement(By.xpath("//*[@href='https://form.jotform.me/72391811797466']")).getText();

        //using Substring instead of split
        System.out.println(result.substring(0,10));
        System.out.println(result2.substring(0,5));






//    String[] message = result.split(" ");
//    String[] message2 = result2.split(" ");
//
//        System.out.println(message[0]);
//        System.out.println(message2[0]);
//        System.out.println(result +" bla bla "+  result2);
//       Thread.sleep(4000);
//        driver.findElement(By.xpath("//*[@class='nav-next']")).click();
        driver.quit();


    }// End of main
}// end of java class
