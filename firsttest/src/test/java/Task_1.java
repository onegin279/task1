/*import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import util.BaseTest;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class InsuranceTest extends BaseTest {

    @Test
    @Ignore
    public void testInsurance() {

        driver.findElement(By.xpath("//*[contains(@aria-label,'Раздел Застраховать себя  и имущество')]")).click();
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);

        WebElement punktMenu = driver.findElement(By.xpath("//*[(text()='Страхование путешественников')][contains(@class,'kit-link kit-link_color_black alt-menu-list__link alt-menu-list__link_level_1')]"));
        wait.until(ExpectedConditions.visibilityOf(punktMenu)).click();


        WebElement zagolovok = driver.findElement(By.xpath("//*[contains(@class,'sbrf-rich-outer')]/h1"));
        wait.until(ExpectedConditions.visibilityOf(zagolovok)).isDisplayed();
        driver.findElement(By.xpath("//*[(text()='Оформить онлайн')]")).click();


        driver.findElement(By.xpath("//*[contains(@data-pid,'SBRF-TEXT-1021974')]")).click();


        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        WebElement minimalnaya = driver.findElement(By.xpath("//*[contains(@class,'b-form-box-title ng-binding')][(text()='Минимальная')]"));
        wait.until(ExpectedConditions.visibilityOf(minimalnaya)).click();
        driver.findElement(By.xpath("//*[(text()='Оформить')][contains(@ng-click,'save()')]")).click();

        //Заполнение формы

        fillField(By.name("insured0_surname"), "IVANOV");
        fillField(By.name("insured0_name"), "IVAN");
        fillField(By.name("insured0_birthDate"), "15061987");
        fillField(By.name("surname"), "Иванов");
        fillField(By.name("name"), "Иван");
        fillField(By.name("middlename"), "Иванович");
        fillField(By.name("birthDate"), "15061987");
        driver.findElement(By.xpath("//*[@class='b-radio-field b-checked-radio-field']/input[@name='male']")).click();
        fillField(By.name("passport_series"), "1506");
        fillField(By.name("passport_number"), "1987");
        fillField(By.name("issueDate"), "15062006");
        fillField(By.name("issuePlace"), "тестозавр");

        assertEquals("IVANOV",
                driver.findElement(By.name("insured0_surname")).getAttribute("value"));
        assertEquals("IVAN",
                driver.findElement(By.name("insured0_name")).getAttribute("value"));
        assertEquals("15.06.1987",
                driver.findElement(By.name("insured0_birthDate")).getAttribute("value"));
        assertEquals("Иванов",
                driver.findElement(By.name("surname")).getAttribute("value"));
        assertEquals("Иван",
                driver.findElement(By.name("name")).getAttribute("value"));
        assertEquals("Иванович",
                driver.findElement(By.name("middlename")).getAttribute("value"));
        assertEquals("15.06.1987",
                driver.findElement(By.name("birthDate")).getAttribute("value"));
        assertEquals("1506",
                driver.findElement(By.name("passport_series")).getAttribute("value"));
        assertEquals("1987",
                driver.findElement(By.name("passport_number")).getAttribute("value"));
        assertEquals("15.06.2006",
                driver.findElement(By.name("issueDate")).getAttribute("value"));
        assertEquals("тестозавр",
                driver.findElement(By.name("issuePlace")).getAttribute("value"));


        driver.findElement(By.xpath("//*[(text()='Продолжить')]")).click();


        WebElement oshibochka = driver.findElement(By.xpath("//*[(text()='Заполнены не все обязательные поля')]"));
        wait.until(ExpectedConditions.visibilityOf(oshibochka));


    }
}

*/