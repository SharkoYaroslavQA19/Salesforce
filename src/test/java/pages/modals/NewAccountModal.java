package pages.modals;

import elements.DropdownAccount;
import elements.Input;
import elements.TextAreaAccount;
import lombok.extern.log4j.Log4j2;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class NewAccountModal extends BaseModal {
    By copyCheckbox = By.xpath("//*[contains(text(),'Copy Billing Address to Shipping Address')]/ancestor::div[1]/input[@type='checkbox']");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public void fillForm(Account inputAccount) {
        log.info("Filling form Account");
        new Input(driver, "Account Name").setValueAccount(inputAccount.getAccountName());
        new Input(driver, "Phone").setValueAccount(inputAccount.getPhone());
        new Input(driver, "Fax").setValueAccount(inputAccount.getFax());
        new Input(driver, "Website").setValueAccount(inputAccount.getWebsite());
        new Input(driver, "Employees").setValueAccount(inputAccount.getEmployees());
        new Input(driver, "Annual Revenue").setValueAccount(inputAccount.getAnnualRevenue());
        if (inputAccount.getType() != null) {
            new DropdownAccount(driver, "Type").selectByVisibleAccountText(inputAccount.getType().getName());
        }
        if (inputAccount.getIndustry() != null) {
            new DropdownAccount(driver, "Industry").selectByVisibleAccountText(inputAccount.getIndustry().getName());
        }
        new TextAreaAccount(driver, "Description").setValueTextAccount(inputAccount.getDescription());
        new TextAreaAccount(driver, "Billing Street").setValueTextAccount(inputAccount.getBillingStreet());
        new Input(driver, "Billing City").setValueAccount(inputAccount.getBillingCity());
        new Input(driver, "Billing State/Province").setValueAccount(inputAccount.getBillingState());
        new Input(driver, "Billing Zip/Postal Code").setValueAccount(inputAccount.getBillingZip());
        new Input(driver, "Billing Country").setValueAccount(inputAccount.getBillingCountry());
        new TextAreaAccount(driver, "Shipping Street").setValueTextAccount(inputAccount.getShippingStreet());
        new Input(driver, "Shipping City").setValueAccount(inputAccount.getShippingCity());
        new Input(driver, "Shipping State/Province").setValueAccount(inputAccount.getShippingState());
        new Input(driver, "Shipping Zip/Postal Code").setValueAccount(inputAccount.getShippingZip());
        new Input(driver, "Shipping Country").setValueAccount(inputAccount.getShippingCountry());
    }

    public void clickCopyCheckbox() {
        driver.findElement(copyCheckbox).click();
    }

}