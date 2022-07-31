package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LeadsPage extends BasePage {

    private final static By NEW_LEAD_BUTTON = By.cssSelector("div.active a[title=New]");
    private final static By ICON_LEADS_LOCATOR = By.xpath("//records-highlights-icon");

    public LeadsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_LEADS_LOCATOR);
    }

    public void clickNewLeadButton() {
        driver.findElement(NEW_LEAD_BUTTON).click();
    }

}