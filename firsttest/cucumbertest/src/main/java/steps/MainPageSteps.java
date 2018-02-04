package steps;


import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MainPageSteps {

    @Step("Выбран пункт меню - Застраховать себя и имущество")
    public void selectMainMenu(String menuItem) {
        new MainPage().selectMainMenu(menuItem);
    }

    @Step("Выбран пункт меню - Страхование путешественников")
    public void selectSubMenu() {
        new MainPage().selectSubMenu();
    }


}