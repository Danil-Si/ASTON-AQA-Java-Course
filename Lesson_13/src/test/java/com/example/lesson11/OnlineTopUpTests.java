package com.example.lesson11;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlineTopUpTests extends BaseTest {

    @BeforeEach
    public void init() {
        setUp();
        driver.get("https://mts.by");
    }

    @AfterEach
    public void cleanUp() {
        tearDown();
    }

    @Test
    public void checkBlockTitle() {
        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение без комиссии')]"));
        Assertions.assertNotNull(blockTitle, "Блок с указанным названием не найден!");
        Assertions.assertEquals("Онлайн пополнение без комиссии", blockTitle.getText(), "Название блока неверное!");
    }

    @Test
    public void checkPaymentSystemLogos() {
        WebElement visaLogo = driver.findElement(By.xpath("//img[@alt='Visa']"));
        WebElement mastercardLogo = driver.findElement(By.xpath("//img[@alt='MasterCard']"));

        Assertions.assertNotNull(visaLogo, "Логотип Visa не найден!");
        Assertions.assertNotNull(mastercardLogo, "Логотип MasterCard не найден!");
    }
    @Test
    public void checkMoreDetailsLink() {
        WebDriver driver;
        WebElement moreDetailsLink = driver.findElement(By.xpath("//a[contains(text(), 'Подробнее о сервисе')]"));
        Assertions.assertNotNull(moreDetailsLink, "Ссылка «Подробнее о сервисе» не найдена!");

        moreDetailsLink.click();

        // Проверяем переход на нужную страницу
        Assertions.assertTrue(driver.getCurrentUrl().contains("service-details"), "Переход по ссылке выполнен некорректно!");
    }
    @Test
    public void checkContinueButton() {
        // Выбрать «Услуги связи»
        WebElement servicesTab = driver.findElement(By.xpath("//label[contains(text(), 'Услуги связи')]"));
        servicesTab.click();

        // Ввести тестовый номер
        WebElement phoneNumberField = driver.findElement(By.xpath("//input[@placeholder='Введите номер']"));
        phoneNumberField.sendKeys("297777777");

        // Нажать кнопку «Продолжить»
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(), 'Продолжить')]"));
        continueButton.click();

        // Проверяем наличие сообщения об успехе или переход на новую страницу
        WebElement confirmationMessage = driver.findElement(By.xpath("//div[contains(text(), 'Подтвердите оплату')]"));
        Assertions.assertNotNull(confirmationMessage, "Подтверждение оплаты не появилось!");
    }

}
