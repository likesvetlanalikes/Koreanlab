package pages;


import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage {
    protected WebDriver driver;
    WebDriverWait wait;
    final String URL = "https://korealab.by/";


    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);

    }

    @Step("Be sure that page is open")
    public abstract boolean isPageOpen();

    protected boolean isExist(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();

        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public static class DiscountProgramPage {
    }
}
