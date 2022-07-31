package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadDetailsPage extends BasePage{

    By actualNameClient = By.xpath("//h1/slot/lightning-formatted-name");
    By actualEmailClient = By.xpath("//p[contains(text(),'Email')]/parent::div/descendant::a");
    private final static By ICON_LEAD_DETAILS_LOCATOR = By.xpath("//records-highlights-icon");


    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_LEAD_DETAILS_LOCATOR);
    }


    public String getActualName() {
        String actualName = driver.findElement(actualNameClient).getText();
        return actualName;
    }
    public String getActualEmail() {
        String actualEmail = driver.findElement(actualEmailClient).getText();
        return actualEmail;
    }
}