import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.BookPage;
import steps.BookPageSteps;

import static framework.BasePage.driver;
import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class BookPageTests extends BaseTest{
    BasicPage basicPage;
    BookPage bookPage;
    BookPageSteps bookPageSteps;

    String nameOfTab = "Book Store";
    String authorBook = "Addy Osmani";
    String fName = "UTest3";
    String lName = "UTest3";
    String uName = "UTest3";
    String password = "Qazwsxe1!";




    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        basicPage = initPage(BasicPage.class);
        driver.get(settings.getBookPath());
        bookPageSteps = initPage(BookPageSteps.class);
        bookPage = initPage(BookPage.class);
    }

    @Test
    public void verifyTab() {
        assertThat(basicPage.getHeaderName().equals(nameOfTab));
    }

    @Test
    public void verifySearchAuthor(){
        bookPageSteps.setValueInSearchBox(authorBook);
        bookPage.verifyIsElementPresent(authorBook);
    }

    @Test
    public void verifyLogin()  {
        bookPageSteps.openLoginPage()
                .clickNewUserButton()
                .setFirstName(fName)
                .setLastName(lName)
                .setUserName(uName)
                .setPassword(password)
                .proceedRecaptcha()
                .clickRegisterButton()
                .backToLoginPage()
                .setUserName(uName)
                .setPassword(password)
                .clickLogin();
       assertThat(bookPage.getUserName().equals(uName));
    }
}
