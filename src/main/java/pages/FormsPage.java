package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends BasicPage {
    public final String link_Forms = "(//div[@class='card mt-4 top-card'])[2]";
    public final String forms_tab = "(//li[@id='item-0'])[2]";
    public final String first_Name = "firstName";
    public final String last_Name = "lastName";
    public final String user_Email = "userEmail";
    public final String user_Number = "userNumber";
    public final String date_Of_Birth_Input = "dateOfBirthInput";
    public final String subject_Container = "subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3";
    public final String checkBox_Reading = "//label[normalize-space()='Reading']";
    public final String current_Address = "currentAddress";
    public final String submit_button = "#submit";


    @FindBy(xpath = link_Forms)
    WebElement linkForms;

    @FindBy(xpath = forms_tab)
    WebElement formsTab;

    @FindBy(id = first_Name)
    WebElement firstName;

    @FindBy(id = last_Name)
    WebElement lastName;

    @FindBy(id = user_Email)
    WebElement userEmail;

    @FindBy(id = user_Number)
    WebElement userNumber;

    @FindBy(id = date_Of_Birth_Input)
    WebElement dateOfBirthInput;

    @FindBy(className = subject_Container)
    WebElement subjectContainer;

    @FindBy(id = checkBox_Reading)
    WebElement checkBoxReading;

    @FindBy(id = current_Address)
    WebElement currentAddress;

    @FindBy(css = submit_button)
    WebElement submitButton;

    @Step
    public FormsPage openFormsTab() {
        linkForms.click();
        formsTab.click();
        return initPage(FormsPage.class);
    }




}
