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

    @FindBy(xpath = "//input[contains(@id,'header-search')]")
    static WebElement searchField;

    public ResPage() {
        PageFactory.initElements(getDriver(), this);

    }


    public static void checkElementsCount(Integer count) {
        List<WebElement> tvLists = getDriver().findElements(By.xpath("//*[@class='n-snippet-card2__part n-snippet-card2__part_type_center']"));
        Assert.assertTrue("Количество элементов не равно - " + count, count == tvLists.size());
    }

    public static void assertFirst() {
        String elementName = getDriver().findElement(By.xpath("//div[contains(@class,'n-snippet-')]//*[contains(@class,'title')]//a[contains(@class,'link')][1]")).getText();
        fillField(searchField, elementName);
        searchButton.click();
        Assert.assertEquals(elementName, getDriver().findElement(By.xpath("//*[@class='title title_size_28 title_bold_yes']")).getText());
    }
    public static void fillField(WebElement field, String value){
        field.clear();
        field.sendKeys(value);
    }
}


