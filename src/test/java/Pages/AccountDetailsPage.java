package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage{

    By actualAccountNameLocator = By.xpath("//h1/div[contains(text(),'Account')]/parent::h1/descendant::lightning-formatted-text");
    By actualAccountTypeLocator = By.xpath("//p[contains(text(),'Type')]/parent::div/descendant::lightning-formatted-text");
    private final static By ICON_ACCOUNT_DETAILS_LOCATOR = By.xpath("//records-highlights-icon");
    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_ACCOUNT_DETAILS_LOCATOR);
    }


    public String getActualAccountName() {
        String actualAccountName = driver.findElement(actualAccountNameLocator).getText();
        return actualAccountName;
    }

    public String getActualAccountType() {
        String actualAccountType = driver.findElement(actualAccountTypeLocator).getText();
        return actualAccountType;
    }
}