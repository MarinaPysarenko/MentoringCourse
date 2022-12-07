package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Utils.waitForElementIsClickable;
import static framework.Utils.waitForElementVisible;

public class ModalsDialogPage extends BasicPage {
    public final String modals_Tab = "//span[normalize-space()='Modal Dialogs']";
    public final String small_Modal = "showSmallModal";
    public final String modal_Body = "//div[@class='modal-body']";
    public final String large_Modal = "showLargeModal";
    public final String name_Large_Modal = "example-modal-sizes-title-lg";

    @FindBy(xpath = modals_Tab)
    WebElement modalsTab;

    @FindBy(id = small_Modal)
    WebElement smallModal;

    @FindBy(id = large_Modal)
    WebElement largeModal;

    @FindBy(id = name_Large_Modal)
    WebElement nameLargeModal;

    @FindBy(xpath = modal_Body)
    WebElement modalBody;


    public void openModalsTab() throws InterruptedException {
        waitForElementIsClickable(modalsTab);
        modalsTab.click();
    }

    public void clickSmallModal() {
        waitForElementVisible(smallModal);
        smallModal.click();
    }

    public String getTextFromSmallModal() {
        return modalBody.getText();
    }

    public void clickLargeModal() {
        waitForElementVisible(largeModal);
        largeModal.click();
    }

    public String getNameOfLargeModal() {
        System.out.println(nameLargeModal.getText());
        return nameLargeModal.getText();
    }
}
