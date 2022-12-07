package pages;

import com.twocaptcha.captcha.Captcha;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.AccessDeniedException;

import static framework.Utils.*;
import static framework.Utils.waitForElementIsClickable;

public class BookPage extends BasicPage {
    private final static String search_box = "#searchBox";
    private final static String login_button = "#login";
    private final static String register_user_button = "#newUser";
    private final static String first_name = "#firstname";
    private final static String last_name = "#lastname";
    private final static String user_Name = "#userName";
    private final static String password_field = "#password";
    private final static String recaptcha_field = "div[class='recaptcha-checkbox-border']";
    private final static String register_button = "#register";
    private final static String back_to_login = "#gotologin";
    private final static String user_name_value = "#userName-value";
    private final static String get_Name = "//p[@id='name']";
    private final static String iFrame_recaptcha = "//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]";


    @FindBy(css = search_box)
    WebElement searchBox;

    @FindBy(xpath = get_Name)
    WebElement getName;

    @FindBy(css = login_button)
    WebElement loginButton;

    @FindBy(css = register_user_button)
    WebElement registerUserButton;

    @FindBy(css = first_name)
    WebElement firstName;

    @FindBy(css = last_name)
    WebElement lastName;

    @FindBy(css = user_Name)
    WebElement userName;

    @FindBy(css = password_field)
    WebElement passwordField;

    @FindBy(css = back_to_login)
    WebElement backToLogin;

    @FindBy(css = recaptcha_field)
    WebElement recaptchaField;

    @FindBy(css = register_button)
    WebElement registerButton;

    @FindBy(css = user_name_value)
    WebElement userNameValue;

    @FindBy(xpath = iFrame_recaptcha)
    WebElement iFramerecaptcha;


    public void setKeyValueInSearchBox(String value) {
        searchBox.sendKeys(value);
        System.out.println(searchBox.getText());
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickNewUserButton() {
        registerUserButton.click();
    }

    public String getNameOfAuthor(String title) {
        return String.format("//div[normalize-space()='%s']", title);
    }

    public boolean verifyIsElementPresent(String name) {
        return isElementPresent(getNameOfAuthor(name));
    }


    public void setFirstName(String name) {
        firstName.sendKeys(name);
    }

    public void setLastName(String lName) {
        lastName.sendKeys(lName);
    }

    public void setUserName(String uName) {
        userName.sendKeys(uName);
    }

    public void setPassword(String value) {
        passwordField.sendKeys(value);
    }

    public void clickRegisterButton() {
        waitForElementIsClickable(registerButton);
       // registerButton.click();
    }

    public void acceptAlert() {
        switchToAlertAndAccept();
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public void backToLoginPage() {
        backToLogin.click();
    }

    public String getUserName() {
        System.out.println(userNameValue.getText());
        return userNameValue.getText();
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void proceedRecaptcha() {
        frameToBeAvailableAndSwitchToIt(iFramerecaptcha);
        waitForElementIsClickable(recaptchaField);
        switchToDefaultContent();
        System.out.println(getName.getText());
    }

}