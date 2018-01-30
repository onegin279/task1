package util;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.Allure;
import ru.yandex.qatools.allure.events.MakeAttachmentEvent;
import ru.yandex.qatools.allure.junit.AllureRunListener;
import steps.BaseSteps;

import static steps.BaseSteps.getDriver;

public class AllureListener extends AllureRunListener {


    @Override
    public void testFailure(Failure failure){
        BaseSteps.takeScreenshot();
        super.testFailure(failure);
    }



    public void takeScreenshot(Result step) {
        if (getDriver() != null) {
            Allure.LIFECYCLE.fire(new MakeAttachmentEvent(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES),
                    "Скриншот в момент ошибки", "image/png"));
        }
    }
}
