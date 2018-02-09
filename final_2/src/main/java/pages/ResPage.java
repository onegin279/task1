package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;


import static steps.BaseSteps.getDriver;


public class ResPage extends BasePage {
    WebDriver driver;

    @FindBy(xpath = "//*[contains(@class,'button2 button2_size_ml button2_type_submit button2_pin_brick-round i-bem button2_theme_gray button2_js_inited')]")
    static WebElement searchButton;

    @FindBy(id = "header-search")
    static WebElement searchField;

    public ResPage() {
        PageFactory.initElements(getDriver(), this);

    }


    public static void checkElementsCount(Integer count) {
        List<WebElement> naushnikiLists = getDriver().findElements(By.xpath("//*[@class='n-snippet-cell2__header']"));
        Assert.assertTrue("Количество элементов не равно - " + count, count == naushnikiLists.size());
    }

    public static void assertFirst() {
        String elementName = getDriver().findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[3]/div[2]/a")).getText();
        fillField(searchField, elementName);
        searchButton.click();
        Assert.assertEquals(elementName, getDriver().findElement(By.xpath("//*[@class='n-breadcrumbs__item n-breadcrumbs__item_type_text']")).getText());
    }
    public static void fillField(WebElement field, String value){
        field.clear();
        field.sendKeys(value);
    }
}


