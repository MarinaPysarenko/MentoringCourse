package steps;

import io.qameta.allure.Step;
import pages.BasicPage;
import pages.BookPage;

public class BookPageSteps extends BasicPage {
    BookPage bookPage = initPage(BookPage.class);

    @Step
    public BookPageSteps setValueInSearchBox(String value){
        bookPage.setKeyValueInSearchBox(value);
        return initPage(BookPageSteps.class);
    }

    @Step
    public BookPageSteps openLoginPage(){
        bookPage.clickLoginButton();
        return this;
    }

    @Step
    public BookPageSteps clickNewUserButton(){
        bookPage.clickNewUserButton();
        return this;
    }

    @Step
    public BookPageSteps setUserName(String name){
        bookPage.setUserName(name);
        return this;
    }

    @Step
    public BookPageSteps setFirstName(String fName){
        bookPage.setFirstName(fName);
        return this;
    }

    @Step
    public BookPageSteps setLastName(String lName){
        bookPage.setLastName(lName);
        return this;
    }

    @Step
    public BookPageSteps setPassword(String password){
        bookPage.setPassword(password);
        return this;
    }


    @Step
    public BookPageSteps clickRegisterButton(){
        bookPage.clickRegisterButton();
        return this;
    }

    @Step
    public BookPageSteps acceptAlert() throws InterruptedException {
        bookPage.acceptAlert();
        return this;
    }

    @Step
    public BookPageSteps backToLoginPage(){
        bookPage.backToLoginPage();
        return this;
    }


    @Step
    public BookPageSteps proceedRecaptcha(){
       bookPage.proceedRecaptcha();
        return this;
    }


    @Step
    public BookPageSteps switchToDefaultContent(){
        bookPage.switchToDefaultContent();
        return this;
    }

    @Step
    public BookPageSteps clickLogin(){
        bookPage.clickLogin();
        return this;
    }








}
