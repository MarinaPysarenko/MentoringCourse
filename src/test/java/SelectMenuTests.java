import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.SelectMenuPage;
import steps.SelectMenuPageSteps;

import static framework.BasePage.driver;
import static framework.BasePage.initPage;
import static framework.Utils.scrollDown;
import static org.fest.assertions.Assertions.assertThat;

public class SelectMenuTests extends BaseTest{
    SelectMenuPageSteps selectMenuPageSteps;
    SelectMenuPage selectMenuPage;
    String firstNameColor = "Green";
    String secondNameColor = "Blue";
    String nameOfTab = "Select Menu";
    String valueOldMenu = "Yellow";
    String singleValue = "Another root option";
    String valueDropDown = "Prof.";


    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        driver.get(settings.getSelectMenuUrl());
        selectMenuPage = initPage(SelectMenuPage.class);
        selectMenuPageSteps = initPage(SelectMenuPageSteps.class);
    }

    @Test
    public void verifyHeader(){
        assertThat(selectMenuPage.getHeaderName().equals(nameOfTab));
    }

    @Test
    public void verifySelectValue(){
        selectMenuPageSteps.clickOnSelectValueDropDown().clickSingleValue();
        assertThat( selectMenuPage.selectSingleValue().equals(singleValue));
    }

    @Test
    public void verifySelectOne(){
        selectMenuPageSteps.clickSelectOneDropDown().selectSingleOneValue();
        assertThat(selectMenuPage.getSingleOneValue().equals(valueDropDown));
    }

    @Test
    public void verifySelectOldValue(){
        selectMenuPage.selectOldMenu(valueOldMenu);
    }

    @Test
    public void verifySelectMultiSelectDropDownValue(){
        selectMenuPageSteps.selectMultiValue();
        selectMenuPage.selectMultiSelect(firstNameColor);
        selectMenuPage.selectMultiSelect(secondNameColor);
        assertThat(selectMenuPage.verifyIsElementPresent(firstNameColor)).isTrue();
        assertThat(selectMenuPage.verifyIsElementPresent(secondNameColor)).isTrue();

    }

    @Test
    public void verifyClearAllValue(){
        selectMenuPageSteps.selectMultiValue();
        selectMenuPage.selectMultiSelect(firstNameColor);
        selectMenuPage.selectMultiSelect(secondNameColor);
        selectMenuPageSteps.selectMultiValue().deleteAllValue();
        assertThat(selectMenuPage.getEmptyValue()).isEmpty();
    }


}
