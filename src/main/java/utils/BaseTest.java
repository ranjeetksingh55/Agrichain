package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    public void initializeBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/ranjeetsingh/Desktop/Resource/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public void quitBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
