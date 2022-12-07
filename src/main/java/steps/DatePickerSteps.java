package steps;

import io.qameta.allure.Step;
import pages.BasicPage;
import pages.DatePickerPage;

public class DatePickerSteps extends BasicPage {
    DatePickerPage datePickerPage = initPage(DatePickerPage.class);

    @Step
    public DatePickerSteps goToDatePickerSection(){
        datePickerPage.goToDatePickerSection();
        return initPage(DatePickerSteps.class);
    }

    @Step
    public DatePickerSteps clickDatePickerMonthYearInput(){
        datePickerPage.clickDatePickerMonthYearInput();
        return this;
    }

    @Step
    public DatePickerSteps setDateMonth(){
        datePickerPage.setDateMonth();
        return this;
    }

    @Step
    public DatePickerSteps clickNextMonth(){
        datePickerPage.clickNextMonth();
        return this;
    }
}
