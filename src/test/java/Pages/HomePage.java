package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final static By USER_ICON_LOCATOR = By.cssSelector(".slds-avatar_profile-image-small");
    private final static By LEADS_TAB_LOCATOR = By.xpath("//*[@title='Leads']");
    private final static By ACCOUNTS_TAB_LOCATOR = By.xpath("//*[@title='Accounts']");
    private static final By PROFILE_BUTTON = By.xpath("//button[contains(@class,'branding-userProfile-button')]");
    private static final By LOGOUT_LINK = By.xpath("//a[contains(@class,'logout')]");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
    }


    public void waitForUserIconDisplayed() {
        waitForElementDisplayed(USER_ICON_LOCATOR);
    }

    public boolean isUserIconDisplayed() {
        return driver.findElement(USER_ICON_LOCATOR).isDisplayed();
    }

    public void openLeadsTab() {
        jsClick(driver.findElement(LEADS_TAB_LOCATOR));
    }

    public void openAccountsTab() {
        jsClick(driver.findElement(ACCOUNTS_TAB_LOCATOR));
    }

    public void clickProfileButton() {
        driver.findElement(PROFILE_BUTTON).click();
    }
    public void clickLogoutLink() {
        driver.findElement(LOGOUT_LINK).click();
    }
}