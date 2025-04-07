package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ResultPage;
import utils.BaseTest;

public class LongestSubstringTest extends BaseTest {

    // implementation of automation

    @BeforeMethod
    public void setup() {
        initializeBrowser();
        driver.get("https://agrichain.com/qa/input");
    }

    @Test
    public void validateLongestSubstring() {
        // Page Objects
        HomePage homePage = new HomePage(driver);
        ResultPage resultPage = new ResultPage(driver);

        // Test Steps
        homePage.enterInput("abcabcbb");
        homePage.clickSubmit();

        String actualResult = resultPage.getResult();
        String expectedResult = "Longest Substring: abc, Length: 3";

        // Assertion
        Assert.assertEquals(actualResult, expectedResult, "Result mismatch!");
    }

    @AfterMethod
    public void teardown() {
        quitBrowser();
    }
}
