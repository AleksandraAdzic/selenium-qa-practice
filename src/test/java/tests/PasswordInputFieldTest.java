package tests;

import org.testng.annotations.Test;
import pages.PasswordInputFieldPage;

public class PasswordInputFieldTest extends BaseTest{

        @Test
        public  void validPasswordTest(){
            driver.get("https://www.qa-practice.com/elements/input/passwd");
            PasswordInputFieldPage passwordInputFieldPage = new PasswordInputFieldPage(driver);
            String password = "8r3rfyi2zyG!";
            passwordInputFieldPage.writeText(password);
            passwordInputFieldPage.pressEnterAfterInput();
            passwordInputFieldPage.verificationValidPassword(password);

        }

    @Test
    public  void invalidPasswordTest(){
        driver.get("https://www.qa-practice.com/elements/input/passwd");
        PasswordInputFieldPage passwordInputFieldPage = new PasswordInputFieldPage(driver);
        String password = "8r3rfyi2zyg";
        passwordInputFieldPage.writeText(password);
        passwordInputFieldPage.pressEnterAfterInput();
        passwordInputFieldPage.verificationValidPassword(password);

    }
}
