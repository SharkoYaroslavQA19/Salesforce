package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;
@Log4j2
public class SelectContact extends BaseElement {
    private final static String SELECT_LOCATOR = "//label[text()= '%s']/ancestor::lightning-grouped-combobox//input";
    private final static String SELECT_OPTION_LOCATOR = "//lightning-grouped-combobox//span[text()='myAccount']";

    public SelectContact(WebDriver driver, String label) {
        super(driver, label);
    }

    public void selectOption(String option) {
        if (Objects.nonNull(option)) {
            WebElement button = driver.findElement(By.xpath(String.format(SELECT_LOCATOR, label)));
            scrollIntoView(button);
            button.click();
            log.debug(String.format("Setting %s SelectContact locator: %s value = %s", label, SELECT_OPTION_LOCATOR, option));
            WebElement optionContact = driver.findElement(By.xpath(String.format(SELECT_OPTION_LOCATOR, option)));
            scrollIntoView(optionContact);
            optionContact.click();
        }
    }
}