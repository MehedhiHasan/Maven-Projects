package Day12_060422;

import Page_Object.BaseClass;
import Reusable_Classes.Reusable_Annotation_Class;
import org.testng.annotations.Test;

public class GoogleSearchPOM extends Reusable_Annotation_Class {

    @Test
    public void SearchForAKeywordOnGoogleHome(){
        driver.navigate().to("https://www.google.com");
        BaseClass.googleHomePage().searchUserValue("BMW");
        BaseClass.googleHomePage().submitOnGoogleSearch();
    }

    @Test(dependsOnMethods = "SearchForAKeywordOnGoogleHome")
    public void CaptureSearchNumberFromGoogle(){
        BaseClass.googleSearchResultPage().CaptureSearchNumberAndPrintIt();
    }


}
