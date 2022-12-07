package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Utils.moveByOfSet;

public class ResizablePage extends BasicPage{
    public final static String resizable_Box_With_Restriction = "//div[@id='resizableBoxWithRestriction']";
    public final static String resizable_box = "//div[@id='resizable']";

    @FindBy(xpath = resizable_Box_With_Restriction)
    WebElement resizableBoxWithRestriction;

    @FindBy(xpath = resizable_box)
    WebElement resizableBox;




    public void resizeWindow(){
        moveByOfSet(resizableBox);
        System.out.println( resizableBoxWithRestriction.getAttribute("style"));
        System.out.println(resizableBox.getAttribute("style"));
    }
}
