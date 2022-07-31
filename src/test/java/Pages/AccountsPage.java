package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {
    private final static By NEW_ACCOUNT_BUTTON = By.cssSelector("div.active a[title=New]");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {

    }

    public void clickNewAccountButton() {
        driver.findElement(NEW_ACCOUNT_BUTTON).click();
    }


}