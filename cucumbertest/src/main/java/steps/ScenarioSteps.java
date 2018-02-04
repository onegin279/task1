package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.Когда;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SendAppPage;

import static steps.BaseSteps.driver;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();

    SecondPageSteps dmsSteps = new SecondPageSteps();

    SendAppSteps sendAppSteps = new SendAppSteps();

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMainMenuItem(String menuItem) {
        mainPageSteps.selectMainMenu(menuItem);
    }

    @Then("^выбран пункт меню Страхование путешественников$")
    public void selectSubMenuItem() {
        mainPageSteps.selectSubMenu();
    }

    @Then("^выполнено нажатие на картинку Оформить$")
    public void stepExecuteButton(){
        SecondPageSteps.stepExecuteButton();
    }

    @When("^выполнен переход на новую вкладку$")
    public void chVkladka(){
        sendAppSteps.chVkladka();
    }

    @Then("^нажатие на Минимальная")
    public void clickMinimal(){
        sendAppSteps.clickMinimal();
    }

    @Then("^нажатие на Оформить")
    public void clickOformit(){
        sendAppSteps.clickOformit();
    }


    @When("^заполняются поля:$")
    public void fillField(DataTable fields){
        Wait<WebDriver> wait = new WebDriverWait(driver, 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(new SendAppPage().surname));
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> sendAppSteps.stepFillField(field, value));

    }


    @Then("^значения полей равны:$")
    public void checkFillField(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> sendAppSteps.stepCheckFillField(field, value));
    }

    @Then("^нажатие на Продолжить")
    public void clickProdol(){
        sendAppSteps.clickProdol();
    }

    @Then("наличие ошибки отсутсвия обязательных полей")
    public void checkErrorMessage(){
        sendAppSteps.checkErrorMessage();

    }

}