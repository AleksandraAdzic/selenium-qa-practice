package tests;

import org.testng.annotations.Test;
import pages.MultipleSelectsPage;


public class MultipleSelectsTest extends BaseTest{
    @Test
    public void multipleSelectsTest(){
        driver.get("https://www.qa-practice.com/elements/select/mult_select");
        MultipleSelectsPage multipleSelectsPage = new MultipleSelectsPage(driver);
        multipleSelectsPage.checkFailedNames();
        multipleSelectsPage.checkRequired();
        multipleSelectsPage.verificationMulipleSelect();
    }
}
