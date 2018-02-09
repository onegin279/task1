package pages;


import org.openqa.selenium.WebElement;


public class BasePage {

    public static void fillField(WebElement field, String value) {
        field.clear();
        field.sendKeys(value);
    }
}