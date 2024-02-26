package tests;

import org.testng.annotations.Test;
import pages.SimpleButtonPage;

public class SimpleButtonTest extends BaseTest{



    @Test
    public void simpleButtonTest(){
        driver.get("https://www.qa-practice.com/elements/button/simple");
        SimpleButtonPage simpleButtonPage = new SimpleButtonPage(driver);
        simpleButtonPage.compliteClickButton();
        simpleButtonPage.verificationClickButton();
    }



}
