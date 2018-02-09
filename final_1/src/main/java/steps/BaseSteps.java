package steps;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.allure.annotations.Attachment;



import java.util.concurrent.TimeUnit;


public class BaseSteps {
    public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    @cucumber.api.java.Before
    public void startScenario(){

        System.setProperty("webdriver.chrome.driver", "drv/chromedriver");
        driver = new ChromeDriver();
        driver .get("http://market.yandex.ru");
        driver .manage().window().maximize();
        driver .manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver .manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @cucumber.api.java.After
    public static void afterMethod(){
        driver .quit();
    }

    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {

        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }


}