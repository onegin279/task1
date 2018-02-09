package steps;

import pages.FiltersPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;


public class FiltersPageSteps {

    @Step("Поле {0} заполняется значением {1}")
    public void stepFillField(String fieldName, String value) {
        new FiltersPage().fillField(fieldName, value);
    }


    @Step("поле {0} заполнено значением {1}")
    public void stepCheckFillField(String field, String value) {

        String actual = new FiltersPage().getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));
    }

    @Step("Выбрать Samsung")
    public void stepSamsung(){
        new FiltersPage().samsung.click();
    }

    @Step("Выбрать Lg")
    public void stepLg(){
        new FiltersPage().lg.click();
    }

    @Step("Нажать Показать подходящие")
    public void showRes(){
        new FiltersPage().showRes.click();
    }



}
