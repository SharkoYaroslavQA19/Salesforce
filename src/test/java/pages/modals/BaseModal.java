package pages.modals;


import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
@Log4j2
public abstract class BaseModal extends BasePage {
    protected final static By SAVE_BUTTON = By.xpath("//*[@title='Save']");
    public BaseModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(SAVE_BUTTON);
        waitForElementClickable(SAVE_BUTTON);
    }

    public void clickSaveButton() {
    log.info("Click save button form");
        driver.findElement(SAVE_BUTTON).click();
    }
}