package tests;

import org.testng.annotations.Test;
import pages.SingleSelectPage;

public class SingelSelectTest extends BaseTest{


    @Test
    public void singleSelectTest(){
        driver.get("https://www.qa-practice.com/elements/select/single_select");
        SingleSelectPage singleSelectPage = new SingleSelectPage(driver);
        singleSelectPage.checkFieldName();
        singleSelectPage.checkIfFieldIsRequired();
        singleSelectPage.validationSelectedLanguage();
    }

}
