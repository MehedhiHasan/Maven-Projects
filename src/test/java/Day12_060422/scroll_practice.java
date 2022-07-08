package Day12_060422;

import Reusable_Classes.Reusable_Actions_POM_Loggers;
import Reusable_Classes.Reusable_Annotation_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class scroll_practice extends Reusable_Annotation_Class {
   @Test
    public void ScrollTest() throws InterruptedException {
       Reusable_Actions_POM_Loggers.navigateToWeb(driver,"https://www.apple.com");
       Thread.sleep(3000);
       WebElement watch = driver.findElement(By.xpath("//*[text()='It’s our largest display yet.']"));
       Reusable_Actions_POM_Loggers.scrollToElement(driver,watch,logger,"element");
       Thread.sleep(3000);
   }
}
