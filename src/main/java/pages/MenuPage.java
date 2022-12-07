package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Utils.hoverElement;

public class MenuPage extends BasicPage {
    public final static String menu_link = "(//li[@id='item-7'])[2]";
    public final static String header_Name = "//div[@class='pattern-backgound playgound-header']";
    public final static String menu_Item_second = "//a[normalize-space()='Main Item 2']";
    public final static String hover_sub_list_menu = "//a[normalize-space()='SUB SUB LIST »']";
    public final static String hover_sub_item = "//a[normalize-space()='Sub Sub Item 1']";


    @FindBy(xpath = menu_link)
    WebElement menuLink;

    @FindBy(xpath = header_Name)
    WebElement headerName;

    @FindBy(xpath = menu_Item_second)
    WebElement menuItemSecond;

    @FindBy(xpath = hover_sub_list_menu)
    WebElement hoverSubListMenu;

    @FindBy(xpath = hover_sub_item)
    WebElement hoverSubItem;

    public void goToMenuPage() {
        menuLink.click();
    }

    public String getHeaderName() {
        System.out.println(headerName.getText());
        return headerName.getText();
    }

    public void hoverMenu() {
        hoverElement(menuItemSecond);
    }

    public void hoverSubMenu() {
        hoverElement(hoverSubListMenu);
    }

    public void hoverSubItem() {
        hoverElement(hoverSubItem);
    }

    public String getItemName() {
        return hoverSubItem.getText();
    }


}
