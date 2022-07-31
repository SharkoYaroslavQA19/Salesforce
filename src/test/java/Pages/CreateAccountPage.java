package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {
    By accountNameInput = By.xpath("//span[contains(text(),'Account Name')]/ancestor::label/following-sibling::div/descendant::input");
    By phoneAccountInput = By.xpath("//span[contains(text(),'Phone')]/ancestor::label/following-sibling::input");
    By faxAccountInput = By.xpath("//span[contains(text(),'Fax')]/ancestor::label/following-sibling::input");
    By websiteAccountInput = By.xpath("//span[contains(text(),'Website')]/ancestor::label/following-sibling::input");
    By employeesAccountInput = By.xpath("//span[contains(text(),'Employees')]/ancestor::label/following-sibling::input");
    By annualRevenueAccountInput = By.xpath("//span[contains(text(),'Annual Revenue')]/ancestor::label/following-sibling::input");
    By typeAccountInput = By.xpath("//span[contains(text(),'Type')]/ancestor::div[1]/div");
    By typeCustomerAccountInput = By.xpath("//a[contains(text(),'Customer')]");
    By industryAccountInput = By.xpath("//span[contains(text(),'Industry')]/ancestor::div[1]/div");
    By industryBankingAccountInput = By.xpath("//a[contains(text(),'Banking')]");
    By billingZipAccountInput = By.xpath("//*[@placeholder='Billing Zip/Postal Code']");
    By billingCountryAccountInput = By.xpath("//*[@placeholder='Billing Country']");
    By copyCheckbox = By.xpath("//*[contains(text(),'Copy Billing Address to Shipping Address')]/ancestor::div[1]/input[@type='checkbox']");
    By saveAccountButton = By.xpath("//button[@title='Save']");

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(accountNameInput);
    }

    public void setAccountName(String accountName) {
        driver.findElement(accountNameInput).sendKeys(accountName);
    }

    public void setPhone(String phone) {
        driver.findElement(phoneAccountInput).sendKeys(phone);
    }

    public void setFax(String fax) {
        driver.findElement(faxAccountInput).sendKeys(fax);
    }

    public void setWebsiteAccount(String websiteAccount) {
        driver.findElement(websiteAccountInput).sendKeys(websiteAccount);
    }

    public void setEmployeesAccount(String employees) {
        driver.findElement(employeesAccountInput).sendKeys(employees);
    }

    public void setAnnualRevenueAccount(String annualRevenue) {
        driver.findElement(annualRevenueAccountInput).sendKeys(annualRevenue);
    }

    public void clickTypeAccount() {
        driver.findElement(typeAccountInput).click();
    }

    public void clickTypeCustomerAccount() {
        driver.findElement(typeCustomerAccountInput).click();
    }

    public void clickIndustryAccount() {
        driver.findElement(industryAccountInput).click();
    }

    public void clickIndustryBankingAccount() {
        driver.findElement(industryBankingAccountInput).click();
    }


    public void setBillingZipAccount(String billingZip) {
        driver.findElement(billingZipAccountInput).sendKeys(billingZip);
    }

    public void setBillingCountryAccount(String billingCountry) {
        driver.findElement(billingCountryAccountInput).sendKeys(billingCountry);
    }

    public void clickCopyCheckbox() {
        driver.findElement(copyCheckbox).click();
    }

    public void clickSaveAccountButton() {
        driver.findElement(saveAccountButton).click();
    }

}