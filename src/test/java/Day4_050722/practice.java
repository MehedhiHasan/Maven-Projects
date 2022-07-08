package Day4_050722;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.jetblue.com");
       String searchText =  driver.findElement(By.xpath("//*[@class='pointer main-nav-link flex justify-between white no-underline nowrap ng-star-inserted']")).getText();
        System.out.println(searchText);

        String[] result = searchText.split(" ");
        System.out.println(result[0]);
        driver.quit();


        WebElement name = driver.findElement(By.xpath("//*[@name='btnK']"));
        String name2 = name.getText();
        String[] splitName = name2.split("&");
        System.out.println("my split result  " + splitName[1]);



    }// end of main
}// end of java class
