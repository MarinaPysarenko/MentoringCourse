import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AutocompleteNewPage;
import pages.BasicPage;
import pages.DatePickerPage;
import steps.DatePickerSteps;

import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class DatePickerTest extends BaseTest {
    DatePickerPage datePickerPage;
    DatePickerSteps datePickerSteps;
    String expectedDate = "12/09/2022";
    String expectedTime = "December 3, 2022 11:30 AM";

    @BeforeMethod
    public void preConditions() throws InterruptedException {
        initPage(BasicPage.class).goToWidgetsSection();
        Thread.sleep(1000);
        datePickerPage = initPage(DatePickerPage.class);
        datePickerSteps = initPage(DatePickerSteps.class).goToDatePickerSection();
    }

    @Test
    public void verifyDatePickerDateAndMonth() {
        datePickerSteps.clickDatePickerMonthYearInput().clickNextMonth().setDateMonth();
        assertThat(datePickerPage.selectMonthAndYear()).isEqualTo(expectedDate);
    }

    @Test
    public void verifyDatePickerDateAndTime(){
        assertThat(datePickerPage.selectDateAndTime()).isEqualTo(expectedTime);
    }

    @Test
    public void verifyDatePickerWithNewDateAndTime(){
        datePickerPage.setNewDateAndTime();
    }

}