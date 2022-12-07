package steps;

import io.qameta.allure.Step;
import pages.BasicPage;
import pages.MenuPage;

import static framework.Utils.scrollDown;
import static framework.Utils.scrollUp;

public class MenuPageSteps extends BasicPage {
    MenuPage menuPage = initPage(MenuPage.class);

    @Step
    public MenuPageSteps openMenuTab(){
        scrollDown();
        scrollDown();
        menuPage.goToMenuPage();
        scrollUp();
        return initPage(MenuPageSteps.class);
    }


    @Step
    public MenuPageSteps hoverMenu(){
        scrollUp();
        menuPage.hoverMenu();
        return this;
    }

    @Step
    public MenuPageSteps hoverSubMenu(){
        scrollUp();
        menuPage.hoverSubMenu();
        return this;
    }


    @Step
    public MenuPageSteps hoverSubItem(){
        menuPage.hoverSubItem();
        return this;
    }
}
