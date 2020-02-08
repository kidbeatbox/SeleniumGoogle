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
        WebDriver driver = new FirefoxDriver();

    }
    @Test
    public void test(){
        WebDriverWait buttonSearch = new WebDriverWait(driver, 20);
        driver.get("https://google.com");
        GoogleSearchPageObject object = new GoogleSearchPageObject(driver);
        object.setTextBoxInSearch("Automation Step by Step");

        buttonSearch.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK"))).click();
    }
    @AfterTest
    public void tearDownTest(){
        driver.close();
        System.out.println("Done");
    }

}
