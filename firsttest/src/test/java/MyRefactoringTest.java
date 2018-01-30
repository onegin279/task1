


import steps.BaseSteps;
import steps.MainPageSteps;
import steps.SendAppSteps;
import steps.SecondPageSteps;

import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;


import java.util.HashMap;


public class MyRefactoringTest extends BaseSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    SecondPageSteps secondPageSteps = new SecondPageSteps();
    SendAppSteps sendAppSteps = new SendAppSteps();

    HashMap<String, String> testData = new HashMap<>();


    @Title("Страхование путешественников")
    @Test
    public void Test() {
        testData.put("Фамилия", "IVANOV");
        testData.put("Имя", "IVAN");
        testData.put("Дата рождения", "15061987");
        testData.put("Фамилия рус", "Иванов");
        testData.put("Имя рус", "Иван");
        testData.put("Отчество рус", "Иванович");
        testData.put("Дата рождения рус", "15.06.1987");
        testData.put("Серия паспорта", "0000");
        testData.put("Номер паспорта", "1111");
        testData.put("Дата выдачи", "15061995");
        testData.put("Кем выдан", "Вупи Голдберг");


        mainPageSteps.stepSelectMainMenu("Застраховать");

        mainPageSteps.stepSelectSubMenu("Страхование путешественников");

        secondPageSteps.stepExecuteButton();

        sendAppSteps.chVkladka();
        sendAppSteps.clickMinimal();
        sendAppSteps.clickOformit();

        sendAppSteps.fillFields(testData);


        sendAppSteps.checkFillFields(testData);
        //sendAppSteps.checkErrorMessageField("Эл. почта", "Введите корректный email");*/
    }
}

