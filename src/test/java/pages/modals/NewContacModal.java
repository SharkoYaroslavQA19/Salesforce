package pages.modals;


import elements.LightningCombobox;
import elements.LightningInput;
import elements.SelectContact;
import elements.Textarea;
import lombok.extern.log4j.Log4j2;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class NewContacModal extends BaseModal {
    private static final By BIRTHDATE = By.xpath("//input[@name='Birthdate']");

    public NewContacModal(WebDriver driver) {
        super(driver);
    }

    public void fillForm(Contact inputContact) {
        log.info("Filling form Contact");
        new LightningInput(driver, "First Name").setValue(inputContact.getFirstName());
        new LightningInput(driver, "Last Name").setValue(inputContact.getLastName());
        if (inputContact.getSalutation() != null) {
            new LightningCombobox(driver, "Salutation").selectByVisibleText(inputContact.getSalutation().getName());
        }
        new LightningInput(driver, "Phone").setValue(inputContact.getPhone());
        new LightningInput(driver, "Mobile").setValue(inputContact.getMobile());
        new LightningInput(driver, "Email").setValue(inputContact.getEmail());
        new LightningInput(driver, "Title").setValue(inputContact.getTitle());
        new SelectContact(driver, "Account Name").selectOption(inputContact.getAccountName());
        new SelectContact(driver, "Reports To").selectOption(inputContact.getReportsTo());
        new Textarea(driver, "Mailing Street").setValueText(inputContact.getMailingStreet());
        new LightningInput(driver, "Mailing City").setValue(inputContact.getMailingCity());
        new LightningInput(driver, "Mailing Zip/Postal Code").setValue(inputContact.getMailingZip());
        new LightningInput(driver, "Mailing State/Province").setValue(inputContact.getMailingState());
        new LightningInput(driver, "Mailing Country").setValue(inputContact.getMailingCountry());
        new Textarea(driver, "Other Street").setValueText(inputContact.getOtherStreet());
        new LightningInput(driver, "Other City").setValue(inputContact.getOtherCity());
        new LightningInput(driver, "Other Zip/Postal Code").setValue(inputContact.getOtherZip());
        new LightningInput(driver, "Other State/Province").setValue(inputContact.getOtherState());
        new LightningInput(driver, "Other Country").setValue(inputContact.getOtherCountry());
        new LightningInput(driver, "Fax").setValue(inputContact.getFax());
        new LightningInput(driver, "Home Phone").setValue(inputContact.getHomePhone());
        new LightningInput(driver, "Other Phone").setValue(inputContact.getOtherPhone());
        new LightningInput(driver, "Asst. Phone").setValue(inputContact.getAsstPhone());
        new LightningInput(driver, "Assistant").setValue(inputContact.getAssistant());
        new LightningInput(driver, "Department").setValue(inputContact.getDepartment());
        if (inputContact.getLeadSource() != null) {
            new LightningCombobox(driver, "Lead Source").selectByVisibleText(inputContact.getLeadSource().getName());
        }
        if (inputContact.getBirthdate() != null) {
            driver.findElement(BIRTHDATE).sendKeys(inputContact.getBirthdate());
        }
        new Textarea(driver, "Description").setValueText(inputContact.getDescription());


    }
}