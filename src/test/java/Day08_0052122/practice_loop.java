package Day08_0052122;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class practice_loop {
    public static void main(String[] args) throws InterruptedException {

        // create an arrayList
        ArrayList<String> car = new ArrayList<>();
        car.add("BMW");
        car.add("Tesla");
        car.add("Ferrari");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       for (int i = 0; i < car.size(); i++) {
            driver.navigate().to("https://www.google.com");
            Thread.sleep(2000);
            WebElement A = driver.findElement(By.xpath("//*[@name='q']"));
           A.sendKeys(car.get(i));
            A.sendKeys("car");
            Thread.sleep(2000);
            A.submit();
            WebElement result = driver.findElement(By.xpath("//*[@id='result-stats']"));
            System.out.println(result.getText());
            String[] splitResult = result.getText().split(" ");
            System.out.println("Search result is \n" +splitResult[1]);

       for (int j = 0; j<splitResult.length;j++){
           System.out.println();
       }

            Thread.sleep(1000);
        }// end of loop
    }
}