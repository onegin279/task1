package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import static steps.BaseSteps.driver;

public class TvPage {

    @FindBy(xpath = "//*[contains(@class,'link i-bem link_js_inited')][contains(text(),'Перейти ко всем фильтрам')]")
    WebElement allFilters;



    public TvPage() {

        PageFactory.initElements(driver, this);
    }

    public void selectAllFilters() {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(allFilters)).click();
    }
}