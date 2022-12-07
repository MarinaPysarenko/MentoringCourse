package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

public class SelectablePage extends BasicPage{
    public final String go_To_Grid_Tab = "#demo-tab-grid";
    private String hex;

    @FindBy(css = go_To_Grid_Tab)
    WebElement goToGridTab;

    public void clickOnElement(String value){
        driver.findElement(By.xpath(selectElement(value))).click();
    }

    public void goToGridTab(){
        goToGridTab.click();
    }

    public String selectElement(String title){
        return String.format("//li[normalize-space()='%s']", title);
    }


    public String getAttributeOfElementAndConvertToHex(String element){
        hex = Color.fromString(driver.findElement(By.xpath(selectElement(element))).getCssValue("background-color")).asHex();
        return hex;
    }
}
