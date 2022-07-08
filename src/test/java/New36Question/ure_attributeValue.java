package New36Question;

import ReuseableLibraries.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ure_attributeValue {
    public static void main(String[] args) {

        WebDriver driver = Reusable_Actions.setDriver();


        // get the current url
        String currentUrl = driver.getCurrentUrl();
        System.out.println("url is " + currentUrl);
        //declare and define mouse actions

        // get the attributes value
        WebElement a = driver.findElements(By.xpath("//*[text()='Click-N-Ship']")).get(2);
        System.out.println(a.getAttribute("data-gtm-label"));



    }

}
