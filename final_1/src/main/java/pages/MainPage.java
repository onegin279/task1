package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import static steps.BaseSteps.driver;

public class MainPage {

    @FindBy(xpath = "//*[contains(@class,'topmenu__list')]/li[1]")
    WebElement mainMenuItem;

    @FindBy(xpath = "//*[contains(@class,'catalog-menu__list')]/a[1][contains(@class,'link catalog-menu__list-item metrika i-bem metrika_js_inited')][contains(text(),'Телевизоры')]")
    WebElement subMenuItem;

    public MainPage() {

        PageFactory.initElements(driver, this);
    }

    public void selectMainMenu(String menuItem) {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(mainMenuItem));
        wait.until(ExpectedConditions.visibilityOf(mainMenuItem.findElement(By.xpath("./a[contains(text(),'Электроника')]")))).click();


    }

    public void selectSubMenu() {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(subMenuItem)).click();
    }

}