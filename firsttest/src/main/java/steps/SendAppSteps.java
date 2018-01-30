
package steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SendAppPage;
import ru.yandex.qatools.allure.annotations.Step;
import steps.BaseSteps;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertTrue;
import static steps.BaseSteps.driver;


public class SendAppSteps extends BaseSteps {

    @Step("Переход на следующую вкладку")
    public void chVkladka() {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }

    @Step("Выбор - Минимальная")
    public void clickMinimal() {
        new SendAppPage().minimal.click();
    }

    @Step()
    public void clickOformit() {
        new SendAppPage().oformit.click();
    }

    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value) {
        new SendAppPage().fillField(field, value);
    }

    @Step("поле {0} заполнено значением {1}")
    public void checkFillField(String field, String value) {
        String actual = new SendAppPage().getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));
    }

    @Step("в поле {0} присутствует сообщение об ошибке {1}")
    public void checkErrorMessage() {
        //new SendAppPage().error.isDisplayed();
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(new SendAppPage().error));
    }

    @Step("заголовок страницы - Отправить заявку равен {0}")
    public void checkPageTitle(String expectedTitle) {
        String actualTitle = new SendAppPage().title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("заполняются поля")
    public void fillFields(HashMap<String, String> fields) {
        fields.forEach((k, v) -> fillField(k, v));
    }

    @Step("поля заполнены верно")
    public void checkFillFields(HashMap<String, String> fields) {
        fields.forEach((k, v) -> checkFillField(k, v));
    }
}
