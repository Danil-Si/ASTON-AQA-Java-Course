package com.example.lesson11;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MtsOnlinePaymentTest {
    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeAll
    static void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @BeforeEach
    void openPage() {
        driver.get("https://mts.by"); // Открываем сайт MTS
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(text(),'Онлайн пополнение без комиссии')]")));
    }

    @Test
    @DisplayName("Проверка плейсхолдеров в пустых полях")
    void testPlaceholders() {
        driver.findElement(By.xpath("//button[text()='Услуги связи']")).click();
        WebElement phoneInput = driver.findElement(By.name("phoneNumber"));
        WebElement amountInput = driver.findElement(By.name("amount"));

        assertEquals("Введите номер телефона", phoneInput.getAttribute("placeholder"));
        assertEquals("Введите сумму", amountInput.getAttribute("placeholder"));
    }

    @Test
    @DisplayName("Заполнение формы «Услуги связи» и проверка данных")
    void testFillFormAndCheckValues() {
        driver.findElement(By.xpath("//button[text()='Услуги связи']")).click();

        WebElement phoneInput = driver.findElement(By.name("phoneNumber"));
        WebElement amountInput = driver.findElement(By.name("amount"));
        WebElement continueButton = driver.findElement(By.xpath("//button[text()='Продолжить']"));

        phoneInput.sendKeys("297777777");
        amountInput.sendKeys("10");

        assertTrue(continueButton.isEnabled(), "Кнопка 'Продолжить' должна быть активна");

        continueButton.click();

        WebElement confirmNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmPhoneNumber")));
        WebElement confirmAmount = driver.findElement(By.id("confirmAmount"));

        assertEquals("297777777", confirmNumber.getText());
        assertEquals("10.00 BYN", confirmAmount.getText());
    }

    @Test
    @DisplayName("Проверка наличия логотипов платёжных систем")
    void testPaymentSystemLogos() {
        driver.findElement(By.xpath("//button[text()='Услуги связи']")).click();
        List<WebElement> paymentLogos = driver.findElements(By.cssSelector(".payment-icons img"));

        assertFalse(paymentLogos.isEmpty(), "Должны присутствовать логотипы платёжных систем (Visa, Mastercard и т.д.)");
    }

    @AfterAll
    static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


