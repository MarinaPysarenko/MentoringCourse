package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static framework.Utils.moveElementToOtherElement;

public class SortablePage extends BasicPage {
    public final String go_To_Grid_Tab = "#demo-tab-grid";

    @FindBy(css = go_To_Grid_Tab)
    WebElement goToGridTab;

    public void goToGridTab(){
        goToGridTab.click();
    }

    public Integer differenceBetweenElements(int valueFirst, int valueSecond){
        return valueFirst - valueSecond;
    }

    public void moveElementInList(String valueOne, String valueTwo){
        moveElementToOtherElement(driver.findElement(By.xpath(selectValue(valueOne))), driver.findElement(By.xpath(selectValue(valueTwo))));
    }


    public String selectValue(String title) {
        return String.format("(//div[@class='list-group-item list-group-item-action'][normalize-space()='%s'])[1]", title);
    }

    public Integer getLocationElement(String valueOne){
        return driver.findElement(By.xpath(selectValue(valueOne))).getLocation().getY();
    }


    public String selectGridValue(String title){
        return String.format("(//div[@class='list-group-item list-group-item-action'][normalize-space()='%s'])[2]", title);
    }

    public void moveElementInGrid(String valueOne, String valueTwo){
        moveElementToOtherElement(driver.findElement(By.xpath(selectGridValue(valueOne))), driver.findElement(By.xpath(selectGridValue(valueTwo))));
    }

    public Integer getLocationElementInGrid(String value){
        return driver.findElement(By.xpath(selectGridValue(value))).getLocation().getY();
    }
}
