package pages;

import framework.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicPage extends BasePage {
    public final static String alertsWindows_tab = "//div[@id='app']";
    public final static String widgets_Section = "(//div[@class='card mt-4 top-card'])[4]";
    public final static String interactions_tab = "//h5[normalize-space()='Interactions']";
    public final static String home_page = "img[src='/images/Toolsqa.jpg']";
    public final String get_Header = "//div[@class='pattern-backgound playgound-header']";


    @FindBy(xpath = widgets_Section)
    WebElement widgetsSection;

    @FindBy(xpath = alertsWindows_tab)
    WebElement alertsWindows;

    @FindBy(xpath = interactions_tab)
    WebElement interactionsTab;

    @FindBy(css = home_page)
    WebElement homepage;

    @FindBy(xpath = get_Header)
    WebElement headerName;


    public BasicPage goToAlertWindowsTab() {
        alertsWindows.click();
        return initPage(BasicPage.class);
    }

    public BasicPage goToWidgetsSection() {
        widgetsSection.click();
        return initPage(BasicPage.class);
    }


    public BasicPage goToInteractionsTabSection() {
        interactionsTab.click();
        return initPage(BasicPage.class);
    }

    public BasicPage openHomePage(){
        homepage.click();
        return this;
    }

    public String getHeaderName() {
        System.out.println(headerName.getText());
        return headerName.getText();
    }



}
