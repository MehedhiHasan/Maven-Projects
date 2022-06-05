package Day09_052222;

import ReuseableLibraries.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class UHC_AI {
    public static void main(String[] args) {

// setting the local driver to reusable setDriver method
        WebDriver driver = Reusable_Actions.setDriver();
// creating arraylists firstname, lastname, birthdate,birthmonth,birthyeaar,zipcode, memberid with 3 different values
        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Manual");
        firstName.add("Automation");
        firstName.add("Cyprass");
        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Api");
        lastName.add("Interview");
        lastName.add("Job");
        ArrayList<String> birthDay = new ArrayList<>();
        birthDay.add("01");
        birthDay.add("02");
        birthDay.add("03");
        ArrayList<String> birthMonth = new ArrayList<>();
        birthMonth.add("April");
        birthMonth.add("May");
        birthMonth.add("June");
        ArrayList<String> birthYear = new ArrayList<>();
        birthYear.add("1990");
        birthYear.add("1991");
        birthYear.add("1992");
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11111");
        zipCode.add("22222");
        zipCode.add("33333");
        ArrayList<String> memberId = new ArrayList<>();
        memberId.add("909090");
        memberId.add("808080");
        memberId.add("707070");

//create for loop fpr iterate through the register form
        for (int i = 0; i < firstName.size(); i++) {
//navigate to UHC.com
            driver.navigate().to("https://www.uhc.com/");
//declare and define explicit wait
            WebDriverWait wait = new WebDriverWait(driver, 5);
// Using Reusable method to verify the title
            Reusable_Actions.verifyTittleAction(driver, "Health insurance plans");
// click on find a doctor on the homepage
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='/find-a-doctor']"))).click();
// click on Sign in button
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label='Sign in menu']"))).click();
//click on medicare
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Medicare plan?']"))).click();
// call switchTabByIndex reusable method to switch to new tab
            Reusable_Actions.switchTabIndex(driver, 1);
//click on register
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() ='Register']"))).click();
//passing firstname through for loop
            Reusable_Actions.sendKeysAction(driver, "//*[@id='firstName']", firstName.get(i), "Unable to send firstName");
//passing lastname through for loop
            Reusable_Actions.sendKeysAction(driver, "//*[@id='lastName']", lastName.get(i), "Unable to send lastName");
//select birthMonth using Reusable actions
            Reusable_Actions.selectbytextAction(driver, "//*[@id='dob_month_input']", birthMonth.get(i), "BirthMonth Error");
//passing birthdate through for loop
            Reusable_Actions.sendKeysAction(driver, "//*[@id='dob_day']", birthDay.get(i), "Unable to send birthDay");
//passing BirthYear through for loop
            Reusable_Actions.sendKeysAction(driver, "//*[@id='dob_year']", birthYear.get(i), "Unable to send birthYear");
//passing zipcode through for loop
            Reusable_Actions.sendKeysAction(driver, "//*[@id='zipCode']", zipCode.get(i), "Unable to send zipCode");
//passing memberId through for loop
            Reusable_Actions.sendKeysAction(driver, "//*[@id='memberId']", memberId.get(i), "Unable to send memberId");
//click the submit button
            Reusable_Actions.clickAction(driver,"//*[@id='submitBtn']","submitBtn");
//capture the error using reusable method
            String NoRecordFound = Reusable_Actions.getTextAction(driver, "//*[@id='plainText_error']", "ErrorFound");
            System.out.println(NoRecordFound);
//close the driver
            driver.close();
// switch back to default tab
            Reusable_Actions.switchTabIndex(driver, 0);

        }//end of for loop
//close the window
        driver.quit();

    }//end of main
}// end of java class
