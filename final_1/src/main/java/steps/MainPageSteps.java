package steps;


import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MainPageSteps {

    @Step("Выбран пункт меню - Электроника")
    public void selectMainMenu(String menuItem) {
        new MainPage().selectMainMenu(menuItem);
    }

    @Step("Выбран пункт меню - Телевизоры")
    public void selectSubMenu() {
        new MainPage().selectSubMenu();
    }


}