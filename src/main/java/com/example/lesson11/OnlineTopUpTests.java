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
}
