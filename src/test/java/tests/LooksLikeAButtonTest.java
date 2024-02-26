package tests;

import org.testng.annotations.Test;
import pages.LooksLikeAButtonPage;

public class LooksLikeAButtonTest extends BaseTest{

    @Test
    public void looksLikeAButtonTest(){
        driver.get("https://www.qa-practice.com/elements/button/like_a_button");
        LooksLikeAButtonPage looksLikeAButtonPage = new LooksLikeAButtonPage(driver);
        looksLikeAButtonPage.checkButtonAndCLick();
        looksLikeAButtonPage.verificationClickButton();

    }


}
