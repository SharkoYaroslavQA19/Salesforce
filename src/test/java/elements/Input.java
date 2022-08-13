package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;
@Log4j2
public class Input extends BaseElement {
    private final static String INPUT_ACCOUNT_LOCATOR = "//span[text()= '%s']/ancestor::div[contains(@class, 'uiInput')]//input";

    public Input(WebDriver driver, String label) {
        super(driver, label);
    }

    public void setValueAccount(String value) {
        if (Objects.nonNull(value)) {
            WebElement inputAccountElement = driver.findElement(By.xpath(String.format(INPUT_ACCOUNT_LOCATOR, label)));
            log.debug(String.format("Setting %s Input locator: %s value = %s", label, INPUT_ACCOUNT_LOCATOR, value));
            scrollIntoView(inputAccountElement);
            inputAccountElement.sendKeys(value);
        }
    }
}