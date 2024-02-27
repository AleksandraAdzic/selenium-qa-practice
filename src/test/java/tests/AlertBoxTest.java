package tests;

import org.testng.annotations.Test;
import pages.AlertsBoxPage;

public class AlertBoxTest extends BaseTest{

    @Test
    public void alertBoxTest() {
        driver.get("https://www.qa-practice.com/elements/alert/alert");
        AlertsBoxPage alertsBoxPage = new AlertsBoxPage(driver);
        alertsBoxPage.checkClickButton();
        alertsBoxPage.clickClickButton();
        alertsBoxPage.varificationAlertBox();
    }
}
