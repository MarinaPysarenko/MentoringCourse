package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Utils.dragAndDropElement;

public class CursorStylePage extends BasicPage{
    private final static String cursor_tab = "#draggableExample-tab-cursorStyle";
    private final static String cursor_Center = "//div[@id='cursorCenter']";
    private final static String cursor_Top_Left = "//div[@id='cursorTopLeft']";

    private int xPosition = 75;
    private int yPosition = 75;

    @FindBy(css = cursor_tab)
    WebElement cursorTab;

    @FindBy(xpath = cursor_Center)
    WebElement cursorCenter;

    @FindBy(xpath = cursor_Top_Left)
    WebElement cursorTopLeft;

    public void goToCursorTab(){
        cursorTab.click();
    }

    public void dragAndDropCenterClick(){
        dragAndDropElement(cursorCenter,xPosition, yPosition);
    }

    public void dragAndDropLeftClick(){
        dragAndDropElement(cursorTopLeft,xPosition, yPosition);
    }
}
