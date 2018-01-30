package steps;


import pages.SecondPage;
import ru.yandex.qatools.allure.annotations.Step;

import static steps.BaseSteps.driver;


public class SecondPageSteps {


    @Step("Выполнено нажатие на кнопку Оформить")
    public void stepExecuteButton() {
        new SecondPage(driver).executeButton.click();

    }
}

