package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.GoogleSearchPageObject;

public class GoogleSearchPageTest {
    private static WebDriver driver = null;

    public static void main(String[] args) {
        googleSearchTest();
    }

    public static void googleSearchTest() {
        System.setProperty("webdriver.gecko.driver", "/Users/macintoshhd/IdeaProjects/SeleniumGoogle/geckodriver");
        driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        driver.get("https://google.com");

        GoogleSearchPageObject object = new GoogleSearchPageObject(driver);
        object.setTextBoxInSearch("Automation Step by Step");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK"))).click();

        driver.close();

        System.out.println("Done");

    }
}
