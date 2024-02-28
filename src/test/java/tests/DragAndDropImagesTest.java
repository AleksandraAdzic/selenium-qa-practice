package tests;

import org.testng.annotations.Test;
import pages.DragAndDropImagesPage;

public class DragAndDropImagesTest extends BaseTest {

    @Test
    public void dragAndDropImageTest(){
        driver.get("https://www.qa-practice.com/elements/dragndrop/images");
        DragAndDropImagesPage dragAndDropImagesPage = new DragAndDropImagesPage(driver);
        dragAndDropImagesPage.verificationFirstToSecondDragAndDrop();
        dragAndDropImagesPage.verificationSecondToFirstDragAndDrop();

    }
}
