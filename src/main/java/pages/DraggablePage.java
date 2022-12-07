package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Utils.dragAndDropElement;

public class DraggablePage extends BasicPage{
    private final static String drag_box_simple ="//div[@id='dragBox']";
    private final static String axis_Restriction_tab = "#draggableExample-tab-axisRestriction";
    private final static String restrictX_box = "#restrictedX";
    private final static String restrictY_box = "#restrictedY";


    private int xPosition = 75;
    private int yPosition = 75;


    @FindBy(xpath = drag_box_simple)
    WebElement dragBoxSimple;

    @FindBy(css = axis_Restriction_tab)
    WebElement axisRestrictiontab;

    @FindBy(css = restrictX_box)
    WebElement restrictXBox;

    @FindBy(css = restrictY_box)
    WebElement restrictYBox;

    public void dragAndDropSimple(){
        dragAndDropElement(dragBoxSimple,xPosition,yPosition);
    }

    public void goToAxisTab(){
        axisRestrictiontab.click();
    }

    public void dragAndDropRestrictX(){
        dragAndDropElement(restrictXBox,xPosition, yPosition);
    }

    public String getYPosition(){
        return restrictXBox.getCssValue("top");
    }

    public void dragAndDropRestrictY(){
        dragAndDropElement(restrictYBox,xPosition, yPosition);
    }

    public String getXPosition(){
        return restrictYBox.getCssValue("left");
    }


}
