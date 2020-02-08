package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
    private static WebDriver driver = null;
    By textbox_search = By.name("q");
    By button_search = By.name("btnK");

    public GoogleSearchPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void setTextBoxInSearch(String text) {
        driver.findElement(textbox_search).sendKeys(text);
    }

    public void setButtonSearch() {
        driver.findElement(button_search).click();
    }
}
