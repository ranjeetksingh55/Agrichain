package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {
    WebDriver driver;

    // Locator
    By resultText = By.id("result");

    public ResultPage(WebDriver driver) {

        this.driver = driver;
    }

    public String getResult() {
        return driver.findElement(resultText).getText();
    }
}
