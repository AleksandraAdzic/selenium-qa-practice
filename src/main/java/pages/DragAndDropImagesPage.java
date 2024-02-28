package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropImagesPage extends BasePage{
    public DragAndDropImagesPage(WebDriver driver) {
        super(driver);
    }


    By resoltText = By.xpath("//img[contains(@class, 'rect-draggable')]/preceding-sibling::p");

    public void dropImageFromFirstToSecond(){
        dragAndDropImage("//img[contains(@class, 'rect-draggable')]", "rect-droppable2");
  }

    public void dropImageFromSecondToFirst(){
        dragAndDropImage("//img[contains(@class, 'rect-draggable')]", "rect-droppable1");
    }

    public void verificationFirstToSecondDragAndDrop(){
        dropImageFromFirstToSecond();
        assertStringEquals(readText(resoltText), "Dropped!");
    }
    public void verificationSecondToFirstDragAndDrop(){
        dropImageFromSecondToFirst();
        assertStringEquals(readText(resoltText), "Dropped!");
    }

}
