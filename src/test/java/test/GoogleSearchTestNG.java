package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.GoogleSearchPageObject;

public class GoogleSearchTestNG {
    private static WebDriver driver = null;

    @BeforeTest
    public void setUpTest(){
        System.setProperty("webdriver.gecko.driver","/Users/macintoshhd/IdeaProjects/SeleniumGoogle/geckodriver");
        driver = new FirefoxDriver();

    }
    @Test
    public void test(){
        WebDriverWait waitButtonSearch = new WebDriverWait(driver, 20);

        // goto google.com
        driver.get("https://google.com");

        // enter text in search textbox
        driver.findElement(By.name("q")).sendKeys("Automation Step By Step");

        // click on search button
//         driver.findElement(By.name("btnK")).click();

        WebElement buttonSearch = waitButtonSearch
                .until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));

        buttonSearch.click();
    }

    @AfterTest
    public void tearDownTest(){
        driver.quit();
        System.out.println("Done");
    }

}
