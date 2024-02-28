package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DragAndDropBoxesPage extends BasePage{
    public DragAndDropBoxesPage(WebDriver driver) {
        super(driver);
    }

    By bottomSquareDraggableBy = By.id("rect-draggable");
    By resoltTextBy = By.id("text-droppable");

    public void checkIfBottomSqareIsDraggable(){
        checkSomeValue("style", bottomSquareDraggableBy, "position: relative;" );
    }


    public void dragAndDropToTest(){
        dragAndDrop("rect-draggable", "rect-droppable");
    }

    public void verificationDragAndDrop(){
        assertStringEquals(readText(resoltTextBy), "Dropped!");
    }





}
