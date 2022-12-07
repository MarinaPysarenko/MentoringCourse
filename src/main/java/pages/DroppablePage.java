package pages;

import framework.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Utils.*;
import static framework.Utils.moveElementToOtherElement;

public class DroppablePage extends BasePage {
    private final static String drag_me_box = "#draggable";
    private final static String droppable_box = "(//div[@id='droppable'])[1]";
    private final static String accept_Tab="//a[@id='droppableExample-tab-accept']";
    private final static String acceptable_box ="//div[@id='acceptable']";
    private final static String accept_droppable_box = "(//div[@id='droppable'])[2]";
    private final static String notAcceptable_box =  "//div[@id='notAcceptable']";
    private final static String drag_box = "//div[@id='dragBox']";
    private final static String inner_box_not_greedy = "//div[@id='notGreedyInnerDropBox']";
    private final static String prevent_tab = "//a[@id='droppableExample-tab-preventPropogation']";
    private final static String greedy_Drop_Box_Inner = "//div[@id='greedyDropBoxInner']";
    private final static String greedy_Drop_Box = "//div[@id='greedyDropBox']";
    private final static String revert_tab ="//a[@id='droppableExample-tab-revertable']";
    public final static String will_Revert_box = "//div[@id='revertable']";
    private final static String drop_here_box = "(//div[@id='droppable'])[3]";
    public final static String not_Revert_box = "#notRevertable";


    @FindBy(css = drag_me_box)
    WebElement dragMeBox;

    @FindBy(css = not_Revert_box)
    WebElement notRevertBox;

    @FindBy(xpath = droppable_box)
    WebElement droppableBox;

    @FindBy(xpath = accept_Tab)
    WebElement acceptTab;

    @FindBy(xpath = prevent_tab)
    WebElement preventTab;

    @FindBy(xpath = acceptable_box)
    WebElement acceptableBox;

    @FindBy(xpath = accept_droppable_box)
    WebElement acceptDroppableBox;

    @FindBy(xpath = notAcceptable_box)
    WebElement notAcceptableBox;

    @FindBy(xpath = drag_box)
    WebElement dragBox;

    @FindBy(xpath = inner_box_not_greedy)
    WebElement innerBoxNotGreedy;

    @FindBy(xpath = greedy_Drop_Box_Inner)
    WebElement greedyDropBoxInner;

    @FindBy(xpath = revert_tab)
    WebElement revertTab;

    @FindBy(xpath = will_Revert_box)
    WebElement willRevertBox;

    @FindBy(xpath = drop_here_box)
    WebElement dropHereBox;




    public void dragAndDrop(){
        moveElementToOtherElement(dragMeBox,droppableBox);
    }

    public String getAttributeOfElementAndConvertToHex(){
      return  convertToHexUtil(droppable_box);
    }

    public void goToAcceptTab(){
        acceptTab.click();
    }

    public void dragAndDropAcceptableElement(){
        moveElementToOtherElement(acceptableBox,acceptDroppableBox);
    }

    public String getAcceptableDroppableElementColorHex(){
        return convertToHexUtil(accept_droppable_box);
    }


    public void dragAndDropNotAcceptableElement(){
        moveElementToOtherElement(notAcceptableBox,acceptDroppableBox);
    }

    public String getNotAcceptableDroppableElementColorHex(){
        return convertToHexUtil(notAcceptable_box);
    }

    public void dragAndDropPreventBox(){
        moveElementToOtherElement(dragBox,innerBoxNotGreedy);
    }

    public void goToPreventTab(){
        preventTab.click();
    }

    public String getTextFromInnerDrop(){
        return innerBoxNotGreedy.getText();
    }

    public void dragAndDropGreedyDropBoxInner(){
        moveElementToOtherElement(dragBox,greedyDropBoxInner);
    }

    public String getTextFromOuterDroppable(){
        System.out.println(greedyDropBoxInner.getText());
        return greedyDropBoxInner.getText();
    }

    public String getOuterDroppableColorHex(){
        return convertToHexUtil(greedy_Drop_Box);
    }

    public void goToRevertTab(){
        revertTab.click();
    }

    public void dragAndDropWillRevertBox(){
        moveElementToOtherElement(willRevertBox,dropHereBox);
    }

    public String getTextFromRevertDrop(){
        return dropHereBox.getText();
    }

    public String checkPositionRevertElement(){
        System.out.println(willRevertBox.getCssValue("left"));
        return willRevertBox.getAttribute("style");
    }

    public void waitElementWillRevert(){
        waitForElementIsClickable(willRevertBox);
    }

    public void dragAndDropNotRevertElement(){
        moveElementToOtherElement(notRevertBox, dropHereBox);
    }

    public String checkPositionNotRevertElement(){
        System.out.println(notRevertBox.getCssValue("left"));
        return notRevertBox.getAttribute("style");
    }



}
