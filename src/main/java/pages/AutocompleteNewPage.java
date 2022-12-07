package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutocompleteNewPage extends BasicPage {
    public final static String autoComplete_Tab = "(//li[@id='item-1'])[3]";
    public final static String color_Name = "#autoCompleteSingleInput";
    public final static String get_Text_From_Single_Field = "(//div[@class='auto-complete__single-value css-1uccc91-singleValue'])[1]";
    public final static String miltiple_Color = "#autoCompleteMultipleInput";
    public final static String first_Name_Of_Color = "(//div[@class='auto-complete__value-container auto-complete__value-container--is-multi auto-complete__value-container--has-value css-1hwfws3'])[1]";
    public final static String remove_Icon = "(//div[@class='css-xb97g8 auto-complete__multi-value__remove'])[2]";
    public final static String remove_All = "//div[@class='auto-complete__indicator auto-complete__clear-indicator css-tlfecz-indicatorContainer']";

    @FindBy(xpath = autoComplete_Tab)
    WebElement autoCompleteTab;

    @FindBy(css = color_Name)
    WebElement colorName;

    @FindBy(xpath = get_Text_From_Single_Field)
    WebElement getTextFromSingleField;

    @FindBy(css = miltiple_Color)
    WebElement multipleColor;

    @FindBy(xpath = first_Name_Of_Color)
    WebElement firstNameOfColor;

    @FindBy(xpath = remove_Icon)
    WebElement removeIcon;

    @FindBy(xpath = remove_All)
    WebElement removeAll;

    public void goToAutoCompleteSection() {
        autoCompleteTab.click();
    }

    public void colorNameClick() {
        colorName.click();
    }


    public void setSingleColor(String nameColor) {
        colorName.sendKeys(nameColor);
        colorName.sendKeys(Keys.ENTER);
    }

    public void setMultipleColor(String nameColor) {
        multipleColor.sendKeys(nameColor);
        multipleColor.sendKeys(Keys.ENTER);
    }

    public String getSingleColorName() {
        return getTextFromSingleField.getText();
    }

    public void multipleColorClickInField() {
        multipleColor.click();
    }


    public void removeIconClick() {
        removeIcon.click();
    }

    public String getColorName() {
        return firstNameOfColor.getText();
    }

    public Boolean multipleFieldIsEmpty() {
        return multipleColor.getText().isEmpty();
    }

    public void removeAll() {
        multipleColor.clear();
    }

}
