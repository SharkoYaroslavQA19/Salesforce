package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final static String URL = "https://tmsqa199.my.salesforce.com";
    private final static By usernameInput = By.cssSelector("input#username");
    private final static By passwordInput = By.cssSelector("input#password");
    private final static By loginButton = By.cssSelector("input#Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(usernameInput);
    }

    public void setUserName(String userName) {
        driver.findElement(usernameInput).sendKeys(userName);
    }

    public void setPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
    public boolean isPageOpened() {
        return isElementPresent(loginButton);
    }
    public void open() {
        driver.get(URL);
    }
}