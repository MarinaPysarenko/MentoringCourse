package steps;

import io.qameta.allure.Step;
import pages.BasicPage;
import pages.SlidersPage;

import static framework.Utils.scrollDown;
import static framework.Utils.scrollUp;

public class SliderPageSteps extends BasicPage {
    SlidersPage slidersPage = initPage(SlidersPage.class);

    @Step
    public SliderPageSteps goToSliderTab(){
        scrollDown();
        slidersPage.goToSliderTab();
        scrollUp();
        return initPage(SliderPageSteps.class);
    }

    @Step
    public SliderPageSteps movesSlider(){
        slidersPage.movesSlider();
        return this;
    }

}
