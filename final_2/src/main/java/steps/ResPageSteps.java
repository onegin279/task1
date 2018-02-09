package steps;

import pages.ResPage;
import ru.yandex.qatools.allure.annotations.Step;


public class ResPageSteps {


    @Step("Проверка соответствия количества элементов на странице")
    public void checkElementsCount(Integer count) {
        ResPage.checkElementsCount(count);
    }

    @Step("Проверка запомненого значения")
    public void assertFirstElement(){ResPage.assertFirst();}
    }







