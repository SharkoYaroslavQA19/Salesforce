package pages;


import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
@Log4j2
public class HomePage extends BasePage {
    private final static By USER_ICON_LOCATOR = By.cssSelector(".slds-avatar_profile-image-small");
    private final static By LEADS_TAB_LOCATOR = By.xpath("//a[@title='Leads']");
    private final static By ACCOUNTS_TAB_LOCATOR = By.xpath("//a[@title='Accounts']");
    private final static By CONTACTS_TAB_LOCATOR = By.xpath("//a[@title='Contacts']");

    private final static By MESSAGE_LOCATOR = By.xpath("//div[@role='alertdialog']");
    private final static By PROFILE_BUTTON = By.xpath("//button[contains(@class, 'branding-userProfile-button')]");
    private final static By LOGOUT_LINK = By.xpath("//a[contains(@class, 'logout')]");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
    }


    public boolean isUserIconDisplayed() {
        return driver.findElement(USER_ICON_LOCATOR).isDisplayed();
    }

    public void openLeadsTab() {
        log.info("Open Leads");
        jsClick(driver.findElement(LEADS_TAB_LOCATOR));
    }

    public void openAccountsTab() {
        log.info("Open Accounts");
        jsClick(driver.findElement(ACCOUNTS_TAB_LOCATOR));
    }

    public void openContactsTab() {
        log.info("Open Contracts");
        jsClick(driver.findElement(CONTACTS_TAB_LOCATOR));
    }


    public String getMessageText() {
        waitForElementDisplayed(MESSAGE_LOCATOR);
        String actualText = driver.findElement(MESSAGE_LOCATOR).getText();
        return actualText;
    }

    public void clickProfileButton() {

        driver.findElement(PROFILE_BUTTON).click();
    }
    public void clickLogoutLink() {

        driver.findElement(LOGOUT_LINK).click();
    }
    public void logOut() {
        log.info("Logout profile");
        waitForElementClickable(PROFILE_BUTTON);
        clickProfileButton();
        clickLogoutLink();
        waitForPageLoaded();
    }

}