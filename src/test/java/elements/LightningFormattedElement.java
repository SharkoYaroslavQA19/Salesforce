package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LightningFormattedElement extends BaseElement {

    private final static String VISIBLE_TEXT_LOCATOR = "//div[contains(@class, 'active')]//span[text() = '%s' and @class='test-id__field-label']/ancestor::div[contains(@class, 'test-id__output-root')]//*[@data-output-element-id='output-field']";

    public LightningFormattedElement(WebDriver driver, String label) {
        super(driver, label);
    }

    public String getText() {
        return driver.findElement(By.xpath(String.format(VISIBLE_TEXT_LOCATOR, label))).getText();
    }
}