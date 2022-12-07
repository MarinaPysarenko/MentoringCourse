package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static framework.Utils.isElementPresent;

public class SelectMenuPage extends BasicPage {
    public final static String select_menu_link = "(//li[@id='item-8'])[2]";
    public final static String header_Name = "//div[@class='pattern-backgound playgound-header']";
    public final static String select_Value_menu = "(//div[@class=' css-1hwfws3'])[1]";
    public final static String select_Single_value = "//div[contains(text(),'Another root option')]";
    public final static String select_One_drop_down = "(//div[contains(@class,'css-tlfecz-indicatorContainer')])[2]";
    public final static String single_Value = "//div[contains(text(),'Prof.')]";
    public final static String get_Value_from_single_One = "(//div[contains(@class,'css-1hwfws3')])[2]";
    public final static String old_Style_Select_Menu = "//*[@id='oldSelectMenu']";
    public final static String multi_select_drop_down = "(//div[@class=' css-1hwfws3'])[3]";
    public final static String delete_All_multi_Value = "(//*[name()='svg'][@class='css-19bqh2r'])[4]";


    @FindBy(xpath = select_menu_link)
    WebElement selectMenuLink;

    @FindBy(xpath = header_Name)
    WebElement headerName;

    @FindBy(xpath = select_Value_menu)
    WebElement selectValueMenu;

    @FindBy(xpath = select_Single_value)
    WebElement selectSingleValue;

    @FindBy(xpath = select_One_drop_down)
    WebElement selectOneDropDown;

    @FindBy(xpath = single_Value)
    WebElement singleValue;

    @FindBy(xpath = get_Value_from_single_One)
    WebElement getValueFromSingleOne;

    @FindBy(xpath = old_Style_Select_Menu)
    WebElement oldStyleSelectMenu;

    @FindBy(xpath = multi_select_drop_down)
    WebElement multiSelectDropDown;

    @FindBy(xpath = delete_All_multi_Value)
    WebElement deleteAllMultiValue;


    public void goToSelectMenuTab() {
        selectMenuLink.click();
    }

    public String getHeaderName() {
        return headerName.getText();
    }

    public void clickOnSelectValueDropDown() {
        selectValueMenu.click();
    }

    public void clickSingleValue() {
        selectSingleValue.click();
    }

    public String selectSingleValue() {
        return selectSingleValue.getText();
    }

    public void clickSelectOneDropDown() {
        selectOneDropDown.click();
    }

    public void selectSingleOneValue() {
        singleValue.click();
    }

    public String getSingleOneValue() {
        return getValueFromSingleOne.getText();
    }

    public String selectOldMenu(String value) {
        /* selectOptionFromMenu(oldStyleSelectMenu,value);*/
        Select se = new Select(oldStyleSelectMenu);
        se.selectByVisibleText(value);
        return se.getFirstSelectedOption().getText();
    }

    public String selectMultiSelect(String name) {
        driver.findElement(By.xpath(multiselectValue(name))).click();
        return driver.findElement(By.xpath(multiselectValue(name))).getText();
    }

    public void clickOnMultiSelect() {
        multiSelectDropDown.click();
    }

    public String multiselectValue(String title) {
        return String.format("//div[contains(text(),'%s')]", title);
    }

    public boolean verifyIsElementPresent(String name) {
        return isElementPresent(multiselectValue(name));
    }

    public void deleteAllValue() {
        deleteAllMultiValue.click();

    }

    public String getEmptyValue() {
        System.out.println(deleteAllMultiValue.getText());
        return deleteAllMultiValue.getText();
    }


  /*public String getValueSelectedOleValueMenu(String value){
      List<WebElement> options = oldStyleSelectMenu.findElements(By.tagName("option"));
      for (WebElement option : options) {
          if(value.equals(option.getText().trim()))
              nameOption = option.getText();
      }
      System.out.println(nameOption);
      return nameOption;
  }*/
}
