package steps;

import framework.BasePage;
import io.qameta.allure.Step;
import pages.BasicPage;
import pages.SelectMenuPage;

import static framework.Utils.scrollDown;
import static framework.Utils.scrollUp;

public class SelectMenuPageSteps extends BasicPage {
    SelectMenuPage selectMenuPage = initPage(SelectMenuPage.class);

    @Step
    public SelectMenuPageSteps goToSelectMenuTab(){
        scrollDown();
        selectMenuPage.goToSelectMenuTab();
        scrollUp();
        return initPage(SelectMenuPageSteps.class);
    }

    @Step
    public SelectMenuPageSteps clickOnSelectValueDropDown(){
        selectMenuPage.clickOnSelectValueDropDown();
        return this;
    }

    @Step
    public SelectMenuPageSteps clickSingleValue(){
        selectMenuPage.clickSingleValue();
        return this;
    }

    @Step
    public SelectMenuPageSteps clickSelectOneDropDown(){
        selectMenuPage.clickSelectOneDropDown();
        return this;
    }

    @Step
    public SelectMenuPageSteps selectSingleOneValue(){
        selectMenuPage.selectSingleOneValue();
        return  this;
    }

    @Step
    public SelectMenuPageSteps selectMultiValue(){
        selectMenuPage.clickOnMultiSelect();
        return  this;
    }

    @Step
    public SelectMenuPageSteps deleteAllValue(){
        selectMenuPage.deleteAllValue();
        return this;
    }



  /*  @Step
    public SelectMenuPageSteps selectOldMenu(String value){
        selectMenuPage.selectOldMenu(value);
        return this;
    }*/


}
