package pages.modals;


import elements.LightningCombobox;
import elements.LightningInput;
import elements.Textarea;
import lombok.extern.log4j.Log4j2;
import models.Lead;
import org.openqa.selenium.WebDriver;

@Log4j2
public class NewLeadModal extends BaseModal {

    public NewLeadModal(WebDriver driver) {
        super(driver);
    }

    public void fillForm(Lead inputLead) {
        log.info("Filling form Lead");
        new LightningInput(driver, "First Name").setValue(inputLead.getFirstName());
        new LightningInput(driver, "Last Name").setValue(inputLead.getLastName());
        if (inputLead.getSalutation().getName() != null) {
            new LightningCombobox(driver, "Salutation").selectByVisibleText(inputLead.getSalutation().getName());
        }
        if (inputLead.getLeadStatus() != null) {
            new LightningCombobox(driver, "Lead Status").selectByVisibleText(inputLead.getLeadStatus().getName());
        }
        new LightningInput(driver, "Company").setValue(inputLead.getCompany());
        new LightningInput(driver, "Phone").setValue(inputLead.getPhone());
        new LightningInput(driver, "Email").setValue(inputLead.getEmail());
        if (inputLead.getRating() != null) {
            new LightningCombobox(driver, "Rating").selectByVisibleText(inputLead.getRating().getName());
        }
        new LightningInput(driver, "Title").setValue(inputLead.getTitle());
        new Textarea(driver, "Street").setValueText(inputLead.getStreet());
        new LightningInput(driver, "City").setValue(inputLead.getCity());
        new LightningInput(driver, "Zip/Postal Code").setValue(inputLead.getZip());
        new LightningInput(driver, "State/Province").setValue(inputLead.getState());
        new LightningInput(driver, "Country").setValue(inputLead.getCountry());
        new LightningInput(driver, "Website").setValue(inputLead.getWebsite());
        new LightningInput(driver, "No. of Employees").setValue(inputLead.getNoOfEmployees());
        new LightningInput(driver, "Annual Revenue").setValue(inputLead.getAnnualRevenue());
        if (inputLead.getLeadSource() != null) {
            new LightningCombobox(driver, "Lead Source").selectByVisibleText(inputLead.getLeadSource().getName());
        }
        if (inputLead.getIndustry() != null) {
            new LightningCombobox(driver, "Industry").selectByVisibleText(inputLead.getIndustry().getName());
        }
        new Textarea(driver, "Description").setValueText(inputLead.getDescription());

    }

}