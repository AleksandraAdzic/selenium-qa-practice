package tests;


import org.testng.annotations.Test;
import pages.MultipleTextareasPage;

public class MultipleTextareasTest extends BaseTest {

    @Test
    public void multipleTextareasAllTest() {
        driver.get("https://www.qa-practice.com/elements/textarea/textareas");
        MultipleTextareasPage multipleTextareasPage = new MultipleTextareasPage(driver);
        multipleTextareasPage.chekTextForFields();
        multipleTextareasPage.chekRequiredForFirstField();
        String text1 = multipleTextareasPage.writeTextInFirstChapter();
        String text2 = multipleTextareasPage.writeTextInSecondChapter();
        String text3 = multipleTextareasPage.writeTextInThirdChapter();
        String text = String.join("\n",text1,text2,text3);
        multipleTextareasPage.waitToBeButtonActiv();
        multipleTextareasPage.verificationText(text);
    }

    @Test
    public void multipleTextareasOnlyFirst(){
        driver.get("https://www.qa-practice.com/elements/textarea/textareas");
        MultipleTextareasPage multipleTextareasPage = new MultipleTextareasPage(driver);
        String text1 = multipleTextareasPage.writeTextInFirstChapter();
        multipleTextareasPage.waitToBeButtonActiv();
        multipleTextareasPage.verificationText(text1);
    }
    @Test
    public void multipleTextareasFirstAndSecondTest(){
        driver.get("https://www.qa-practice.com/elements/textarea/textareas");
        MultipleTextareasPage multipleTextareasPage = new MultipleTextareasPage(driver);
        String text1 = multipleTextareasPage.writeTextInFirstChapter();
        String text2 = multipleTextareasPage.writeTextInSecondChapter();
        String text = String.join("\n",text1,text2);
        multipleTextareasPage.waitToBeButtonActiv();
        multipleTextareasPage.verificationText(text);
    }

    @Test
    public void multipleTextareasFirstAndThirdTest(){
        driver.get("https://www.qa-practice.com/elements/textarea/textareas");
        MultipleTextareasPage multipleTextareasPage = new MultipleTextareasPage(driver);
        String text1 = multipleTextareasPage.writeTextInFirstChapter();
        String text3 = multipleTextareasPage.writeTextInThirdChapter();
        String text = String.join("\n",text1,text3);
        multipleTextareasPage.waitToBeButtonActiv();
        multipleTextareasPage.verificationText(text);
    }


}
