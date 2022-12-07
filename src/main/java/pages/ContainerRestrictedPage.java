package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContainerRestrictedPage extends BasicPage{
   private final static String container_Restriction_tab = "#draggableExample-tab-containerRestriction";

   @FindBy(css = container_Restriction_tab)
    WebElement containerRestrictionTab;

   public void openContainerRestrictionTab(){
       containerRestrictionTab.click();
   }
}
