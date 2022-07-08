package Day09_052222;

import Reusable_Classes.Reusable_Actions_POM_Loggers;
import Reusable_Classes.Reusable_Annotation_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class practice_mousehover extends Reusable_Annotation_Class {

  @Test
    public void mouseHover() throws InterruptedException {

      Reusable_Actions_POM_Loggers.navigateToWeb(driver,"https://www.usps.com");
      WebElement shop = driver.findElement(By.xpath("//*[text()='Shop']"));
      Reusable_Actions_POM_Loggers.mouseHover(driver,shop,logger,"element");
      Reusable_Actions_POM_Loggers.clickAction(driver,shop,logger,"shop");
      Thread.sleep(3000);
      WebElement sendMessage = driver.findElement(By.xpath("//*[@name='Ntt']"));
      Reusable_Actions_POM_Loggers.sendKeysAction(driver,sendMessage,"3434",logger,"sendkeys");
      Thread.sleep(2000);
  }

}
