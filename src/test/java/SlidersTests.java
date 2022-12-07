import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccordionPage;
import pages.BasicPage;
import pages.SlidersPage;
import steps.AccordionSteps;
import steps.SliderPageSteps;

import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class SlidersTests extends BaseTest{
    SlidersPage slidersPage;
    SliderPageSteps sliderPageSteps;

    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        initPage(BasicPage.class).goToWidgetsSection();
        slidersPage = initPage(SlidersPage.class);
        sliderPageSteps = initPage(SliderPageSteps.class).goToSliderTab();
    }

    @Test
    public void verifyHeaderSliders(){
        assertThat(slidersPage.getHeaderText().equals("Slider"));
    }

    @Test
    public void compareValuesSlider(){
        sliderPageSteps.movesSlider();
        assertThat(slidersPage.getDataFromSliderInput().equals( slidersPage.getValueSliderFromAttribute()));
    }


}
