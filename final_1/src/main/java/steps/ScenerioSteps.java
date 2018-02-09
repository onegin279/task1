package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FiltersPage;

import static steps.BaseSteps.driver;

public class ScenerioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();

    TvPageSteps tvPageSteps = new TvPageSteps();

    FiltersPageSteps filtersPageSteps = new FiltersPageSteps();

    ResPageSteps resPageSteps = new ResPageSteps();

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMainMenuItem(String menuItem) {
        mainPageSteps.selectMainMenu(menuItem);
    }

    @Then("^выбран пункт меню Телевизоры$")
    public void selectSubMenuItem() {
        mainPageSteps.selectSubMenu();
    }

    @When("^выбран пункт Перейти ко всем фильтрам$")
    public void selectAllFilters() {
        tvPageSteps.selectAllFilters();
    }

    @When("^заполняются поля:$")
    public void fillField(DataTable fields){
        Wait<WebDriver> wait = new WebDriverWait(driver, 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(new FiltersPage().price));
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> filtersPageSteps.stepFillField(field, value));

    }


    @Then("^значения полей равны:$")
    public void checkFillField(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> filtersPageSteps.stepCheckFillField(field, value));
    }

    @When("^выбран Samsung")
    public void selectSamsung() {
        filtersPageSteps.stepSamsung();
    }

    @Then("^выбран Lg$")
    public void selectLg() {
        filtersPageSteps.stepLg();
    }

    @When("^нажать Показать подходящие$")
    public void showRes() {
        filtersPageSteps.showRes();
    }

    @Then("^отобразились 12 позиций$")
    public void checkElementsCount() {
        resPageSteps.checkElementsCount(12);
    }

    @When("^проверить поиск по первому значению$")
    public void assertFirstElement() {
        resPageSteps.assertFirstElement();
    }
}