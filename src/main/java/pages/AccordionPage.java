package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccordionPage extends BasicPage {
    public final static String accordian_Tab = "(//li[@id='item-0'])[4]";
    public final static String second_Accordion = "#section2Heading";
    public final static String get_Text = "div[class='collapse show'] p:nth-child(1)";


    @FindBy(xpath = accordian_Tab)
    WebElement accordionTab;

    @FindBy(css = second_Accordion)
    WebElement secondAccordion;

    @FindBy(css = get_Text)
    WebElement getText;

    public void goToAccordionSection() {
        accordionTab.click();
    }

    public void openAccordionTab() {
        secondAccordion.click();
    }


    public String getTextFromAccordion() {
        return getText.getText();
    }


}
