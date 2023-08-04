package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class HomePage extends BasePage {

    public static final By KOREALAB_LOGO = By.xpath("//div[@id=/'headerWrapper']/div[contains(@class, /'logo-wrapper')]/img");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        driver.get(URL);
        return this;
    }
    @Override
    @Step("Find element to make sure the page is open")
    public boolean isPageOpen() {
        log.info("Find element --> " + KOREALAB_LOGO);
        return isExist(KOREALAB_LOGO);
    }
}