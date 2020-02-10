package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExtendReportsBasicDemo {
    private static WebDriver driver = null;
    public static void main(String[] args) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");

        //create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        //create a toggle for the given test , add all log events under it
        ExtentTest test = extent.createTest("Google Search Test One", "this is a test to validate google search functionality");

        System.setProperty("webdriver.gecko.driver","/Users/macintoshhd/IdeaProjects/SeleniumGoogle/geckodriver");
        driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        test.log(Status.INFO,"Starting Test Case");
        driver.get("https://google.com");
        test.pass("Navigated to google.com");

        driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
        test.pass("Entered text in Search Box");


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK"))).click();
        test.pass("Click button search");

        driver.quit();
        test.pass("Closed the browser");

        test.info("Test Completed");

        //calling flush writes everything  to the log file
        extent.flush();




    }
}
