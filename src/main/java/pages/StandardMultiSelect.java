package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static framework.Utils.selectOptionFromMenu;

public class StandardMultiSelect extends BasicPage {
    public final String standard_Select = "//select[@id='cars']";
    boolean result;

    @FindBy(xpath = standard_Select)
    WebElement standardSelect;

    public void selectValueFromStandardMultiSelect(String value) {
        selectOptionFromMenu(standardSelect, value);
    }

    public Boolean getSelectedOptions() {
        Select select = new Select(standardSelect);
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        for (WebElement option : selectedOptions) {
            if (option.isSelected()) {
                result = option.isSelected();
                System.out.println(option.getText() + " return: " + option.isSelected());
            } else {
                System.out.println("is not selected: " + option.isSelected());
            }
        }
        return result;
    }


    public Boolean deselectValue() {
        Select select = new Select(standardSelect);
        select.deselectAll();
        List<WebElement> selectedOptions = select.getOptions();
        for (WebElement option : selectedOptions) {
            if (!option.isSelected()) {
                result = false;
            }
        }
        System.out.println(result);
        return result;
    }

}
