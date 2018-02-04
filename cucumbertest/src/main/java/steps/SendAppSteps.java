
package steps;


import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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


public class SendAppSteps {

    @Step("Переход на следующую вкладку")
    public void chVkladka() {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }

    @Step("Выбор - Минимальная")
    public void clickMinimal() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(new SendAppPage().minimal)).click();
    }

    @Step()
    public void clickOformit() {
        new SendAppPage().oformit.click();
    }

    @Step("Поле {0} заполняется значением {1}")
    public void stepFillField(String fieldName, String value) {
        new SendAppPage().fillField(fieldName, value);
    }


    @Step("поле {0} заполнено значением {1}")
    public void stepCheckFillField(String field, String value) {

        String actual = new SendAppPage().getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));
    }

    @Step("Пол заполнен верно")
    public void stepCheckMale(WebElement female){
        new SendAppPage().male.click();
        assertTrue("Неверно заполнен пол", female.isSelected());
    }


    @Step("Клик по продолжить")
    public void clickProdol(){new SendAppPage().prodButton.click();
    }

    @Step("в поле {0} присутствует сообщение об ошибке {1}")
    public void checkErrorMessage() {
        //new SendAppPage().error.isDisplayed();
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(new SendAppPage().error));
    }

}