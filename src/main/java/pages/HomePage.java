package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    // Locators
    By inputField = By.xpath("//input[@placeholder='Enter String Input...']");
    By submitButton = By.xpath("//button[text()='Submit']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterInput(String input) {
        driver.findElement(inputField).sendKeys(input);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }
}
