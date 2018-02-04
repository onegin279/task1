package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;


public class BasePage {
    WebDriver driver;

    public BasePage() {
    }

    public void fillField(WebElement element, String value) {
        element.click();
        element.sendKeys(value);
    }

}


