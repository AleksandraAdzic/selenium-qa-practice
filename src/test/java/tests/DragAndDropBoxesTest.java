package tests;

import org.testng.annotations.Test;
import pages.DragAndDropBoxesPage;

public class DragAndDropBoxesTest extends BaseTest{

    @Test
    public void dragAndDropBoxesTest(){
        driver.get("https://www.qa-practice.com/elements/dragndrop/boxes");
        DragAndDropBoxesPage dragAndDropBoxesPage = new DragAndDropBoxesPage(driver);
        dragAndDropBoxesPage.checkIfBottomSqareIsDraggable();
        dragAndDropBoxesPage.dragAndDropToTest();
        dragAndDropBoxesPage.verificationDragAndDrop();
    }

}
