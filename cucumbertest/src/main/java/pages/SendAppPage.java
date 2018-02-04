package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;


public class SendAppPage {
    WebDriver driver;

    @FindBy(xpath = "//*[(text()='Страхование путешественников')][@ng-bind='prodTitle']")
    public WebElement title;

    @FindBy(xpath = "//*[contains(@class,'b-form-box-title ng-binding')][(text()='Минимальная')]")
    public WebElement minimal;

    @FindBy(xpath = "//*[(text()='Оформить')][contains(@ng-click,'save()')]")
    public WebElement oformit;

    @FindBy(name = "insured0_surname")
    public WebElement surname;

    @FindBy(name = "insured0_name")
    WebElement name;

    @FindBy(name = "insured0_birthDate")
    WebElement birthDate;

    @FindBy(name = "surname")
    WebElement surnameRus;

    @FindBy(name = "name")
    WebElement nameRus;

    @FindBy(name = "middlename")
    WebElement middlenameRus;

    @FindBy(name = "birthDate")
    WebElement birthDateRus;

    @FindBy(xpath = ("//*[@class='b-radio-field b-checked-radio-field']/input[@name='male']"))
    WebElement sex;

    @FindBy(name = "passport_series")
    WebElement passport_series;

    @FindBy(name = "passport_number")
    WebElement passport_number;

    @FindBy(name = "issueDate")
    WebElement issueDate;

    @FindBy(name = "issuePlace")
    WebElement issuePlace;

    @FindBy(xpath = "//*[(text()='Продолжить')]")
    public
    WebElement prodButton;

    @FindBy(xpath = "//*[(text()='Заполнены не все обязательные поля')]")
    public
    WebElement error;

    @FindBy(name = "male")
    public WebElement male;

    public SendAppPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
        (new WebDriverWait(BaseSteps.getDriver(), 10))
                .until(ExpectedConditions.visibilityOf(title));


    }


    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Фамилия":
                fillField(surname, value);
                break;
            case "Имя":
                fillField(name, value);
                break;
            case "Дата рождения":
                fillField(birthDate, value);
                break;
            case "Фамилия рус":
                fillField(surnameRus, value);
                break;
            case "Имя рус":
                fillField(nameRus, value);
                break;
            case "Отчество рус":
                fillField(middlenameRus, value);
                break;
            case "Дата рождения рус":
                fillField(birthDateRus, value);
                break;
            case "Пол":
                fillField(sex, value);
                break;
            case "Серия паспорта":
                fillField(passport_series, value);
                break;
            case "Номер паспорта":
                fillField(passport_number, value);
                break;
            case "Дата выдачи":
                fillField(issueDate, value);
                break;
            case "Кем выдан":
                fillField(issuePlace, value);
                break;
            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }

    public String getFillField(String fieldName) {
        switch (fieldName) {
            case "Фамилия":
                return surname.getAttribute("value");
            case "Имя":
                return name.getAttribute("value");
            case "Дата рождения":
                return birthDate.getAttribute("value");
            case "Фамилия рус":
                return surnameRus.getAttribute("value");
            case "Имя рус":
                return nameRus.getAttribute("value");
            case "Отчество рус":
                return middlenameRus.getAttribute("value");
            case "Дата рождения рус":
                return birthDateRus.getAttribute("value");
            case "Пол":
                return sex.getAttribute("value");
            case "Серия паспорта":
                return passport_series.getAttribute("value");
            case "Номер паспорта":
                return passport_number.getAttribute("value");
            case "Дата выдачи":
                return issueDate.getAttribute("value");
            case "Кем выдан":
                return issuePlace.getAttribute("value");

        }
        throw new AssertionError("Поле не объявлено на странице");
    }

    public void fillField(WebElement element, String value) {
        element.click();
        element.sendKeys(value);
    }




}



