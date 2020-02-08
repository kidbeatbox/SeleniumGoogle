package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/macintoshhd/IdeaProjects/SeleniumGoogle/geckodriver");
        WebDriver driver = new FirefoxDriver();

        WebDriverWait buttonSearch = new WebDriverWait(driver, 20);

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Automation Step By Step");

        WebElement element = buttonSearch.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));
        element.click();

        driver.close();

        System.out.println("Test Done");
    }
}
