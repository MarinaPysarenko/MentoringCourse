package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class BrowserWindows extends BasicPage {
    public final static String browser_Windows_Tab = "(//li[@id='item-0'])[3]";
    public final static String tab_Button = "tabButton";
    public final static String sample_Heading = "sampleHeading";
    public final static String window_Button = "#windowButton";
    public final static String message_Window_Button = "messageWindowButton";
    public final static String window_Message_Body = "body";

    String mainWindowHandle = driver.getWindowHandle();
    Set<String> allWindowHandles = driver.getWindowHandles();
    Iterator<String> iterator = allWindowHandles.iterator();


    @FindBy(xpath = browser_Windows_Tab)
    WebElement browserWindowsTab;

    @FindBy(id = tab_Button)
    WebElement tabButton;

    @FindBy(id = sample_Heading)
    WebElement sampleHeading;

    @FindBy(css = window_Button)
    WebElement windowButton;

    @FindBy(id = message_Window_Button)
    WebElement messageWindowButton;

    @FindBy(css = window_Message_Body)
    WebElement windowMessageBody;


    public void openBrowserWindowsTab() {
        browserWindowsTab.click();
    }

    public void openNewTab() {
        tabButton.click();
    }

    public void switchingBetweenTabs() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }


    public String getTextFromPage() {
        System.out.println(sampleHeading.getText());
        return sampleHeading.getText();
    }

    public void openNewWindow() {
        windowButton.click();
    }

    public void openNewWindowMessage() {
        messageWindowButton.click();
    }


    public void switchNewWindow() {
        driver.switchTo().newWindow(WindowType.WINDOW);
    }


    @Step
    public void getChildWindow() {
        driver.findElement(By.id("windowButton")).click();

        //Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println("Heading of child window is " + text.getText());
            }
        }
    }

}




