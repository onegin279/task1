package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;


public class FiltersPage extends BasePage {
    WebDriver driver;

    @FindBy(xpath = "//*[(text()='Все фильтры')]")
    public WebElement title;

    @FindBy(name = "glf-pricefrom-var")
    public WebElement price;

    @FindBy(xpath = "//*[@class='checkbox__label'][(text()='Beats')]")
    public WebElement beats;

    @FindBy(xpath = "//*[@class='n-filter-panel-extend__button-bar']/a[2]")
    public WebElement showRes;





    public FiltersPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
        (new WebDriverWait(BaseSteps.getDriver(), 10))
                .until(ExpectedConditions.visibilityOf(title));


    }

    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Цена":
                fillField(price, value);
                break;


            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");


        }

    }

    public String getFillField(String fieldName) {
        switch (fieldName) {
            case "Цена":
                return price.getAttribute("value");


        }
        throw new AssertionError("Поле не объявлено на странице");
    }

}
