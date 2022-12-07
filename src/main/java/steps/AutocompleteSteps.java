package steps;

import framework.BasePage;
import io.qameta.allure.Step;
import org.checkerframework.checker.units.qual.A;
import pages.AutocompleteNewPage;
import pages.BasicPage;

public class AutocompleteSteps extends BasicPage {
    AutocompleteNewPage autocompleteNewPage = initPage(AutocompleteNewPage.class);

    @Step
    public AutocompleteSteps goToAutoCompleteSection() {
        autocompleteNewPage.goToAutoCompleteSection();
        return initPage(AutocompleteSteps.class);
    }

    @Step
    public AutocompleteSteps colorNameClick(){
        autocompleteNewPage.colorNameClick();
        return this;
    }

    @Step
    public AutocompleteSteps setSingleColor(String colorName){
        autocompleteNewPage.setSingleColor(colorName);
        return this;
    }

    @Step
    public AutocompleteSteps setMultipleColor(String colorName){
        autocompleteNewPage.setMultipleColor(colorName);
        return this;
    }

    @Step
    public AutocompleteSteps multipleColorClickInField(){
        autocompleteNewPage.multipleColorClickInField();
        return this;
    }

    @Step
    public AutocompleteSteps removeIconClick(){
        autocompleteNewPage.removeIconClick();
        return this;
    }

    @Step
    public AutocompleteSteps removeAll(){
        autocompleteNewPage.removeAll();
        return this;
    }
}
