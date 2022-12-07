package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePickerPage extends BasicPage {
    public final static String date_PickerTab = "(//li[@id='item-2'])[3]";
    public final static String date_Picker_Month_Year_Input = "#datePickerMonthYearInput";
    public final static String next_Month = "//button[normalize-space()='Next Month']";
    public final static String set_Date_Month_Year_Input = "//div[@aria-label='Choose Friday, December 9th, 2022']";
    public final static String date_And_Time_Picker_Input = "#dateAndTimePickerInput";
    public final static String nxt_Month_Date_Time_Input = "button[aria-label='Next Month']";
    public final static String set_Time = "//li[normalize-space()='11:30']";
    public final static String setDate_Time_Input = "div[aria-label='Choose Saturday, December 3rd, 2022']";
    public final static String drop_down_Month = "//span[@class='react-datepicker__month-read-view--down-arrow']";
    public final static String select_Month = "//div[normalize-space()='March']";
    public final static String set_New_Date_Time_Input = "//div[@aria-label='Choose Friday, March 18th, 2022']";
    public final static String click_New_Year = "//span[@class='react-datepicker__year-read-view--down-arrow']";
    public final static String set_New_Year = "//div[normalize-space()='2023']";


    @FindBy(xpath = date_PickerTab)
    WebElement datePickerTab;

    @FindBy(css = date_Picker_Month_Year_Input)
    WebElement datePickerMonthYearInput;

    @FindBy(xpath = next_Month)
    WebElement nextMonth;

    @FindBy(xpath = set_Date_Month_Year_Input)
    WebElement setDateMonthYearInput;

    @FindBy(css = date_And_Time_Picker_Input)
    WebElement dateAndTimePickerInput;

    @FindBy(css = nxt_Month_Date_Time_Input)
    WebElement nxtMonthDateTimeInput;

    @FindBy(xpath = set_Time)
    WebElement setTime;

    @FindBy(css = setDate_Time_Input)
    WebElement setDateTimeInput;

    @FindBy(xpath = drop_down_Month)
    WebElement dropdownMonth;

    @FindBy(xpath = select_Month)
    WebElement selectMonth;

    @FindBy(xpath = set_New_Date_Time_Input)
    WebElement setNewDateTimeInput;

    @FindBy(xpath = click_New_Year)
    WebElement clickNewYear;


    @FindBy(xpath = set_New_Year)
    WebElement setNewYear;


    public void goToDatePickerSection() {
        datePickerTab.click();
    }

    public void clickNextMonth() {
        nextMonth.click();
    }

    public void clickDatePickerMonthYearInput() {
        datePickerMonthYearInput.click();
    }

    public void setDateMonth() {
        setDateMonthYearInput.click();
    }

    public String selectMonthAndYear() {
        return datePickerMonthYearInput.getAttribute("value");
    }


    @Step
    public String selectDateAndTime() {
        dateAndTimePickerInput.click();
        nxtMonthDateTimeInput.click();
        setDateTimeInput.click();
        setTime.click();
        return dateAndTimePickerInput.getAttribute("value");
    }

    @Step
    public void setNewDateAndTime() {
        dateAndTimePickerInput.click();
        dropdownMonth.click();
        selectMonth.click();
        clickNewYear.click();
        setNewYear.click();
        //  setNewDateTimeInput.click();
        System.out.println(dateAndTimePickerInput.getAttribute("value"));

    }
}


//public String getNameOfUSer(String title) {
//    return String.format("//a[@href='/app?title=%s']", title);
// }