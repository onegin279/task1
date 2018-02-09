package steps;

import pages.TvPage;
import ru.yandex.qatools.allure.annotations.Step;

public class TvPageSteps {

    @Step("Выбран пункт - Перейти ко всем фильтрам")
    public void selectAllFilters() {
        new TvPage().selectAllFilters();
    }
}

