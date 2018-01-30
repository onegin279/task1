package steps;

import com.sun.xml.internal.rngom.parse.host.Base;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MainPageSteps extends BaseSteps {


    @Step("Выбран пункт меню - Застраховать себя и имущество")
    public void stepSelectMainMenu(String menuItem) {
        new MainPage(driver).selectMainMenu(menuItem);
    }

    @Step("Выбран пункт меню - Страхование путешественников")
    public void stepSelectSubMenu(String menuItem) {
        new MainPage(driver).selectSubMenu(driver);
    }


}