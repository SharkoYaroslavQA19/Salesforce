package pages;

import elements.LightningFormattedElement;
import enums.LeadSource;
import enums.Salutation;
import lombok.extern.log4j.Log4j2;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utils.StringSplit;
@Log4j2
public class ContactDetailsPage extends BasePage {
    private final static By ICON_CONTACT_DETAILS_LOCATOR = By.xpath("//records-highlights-icon");

    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_CONTACT_DETAILS_LOCATOR);
    }

    public Contact getContactInfo() {
        log.info("Filling in the data form Contracts");
        String fullName = new LightningFormattedElement(driver, "Name").getText();
        StringSplit.fullNameSplit(fullName);
        String accountName = new LightningFormattedElement(driver, "Account Name").getText();
        Contact.ContactBuilder contactBuilder = contactBuilder = Contact.builder().lastName(StringSplit.fullNameSplit(fullName)[2]).accountName(StringSplit.textSplit(accountName));
        contactBuilder.salutation(Salutation.fromString(StringSplit.fullNameSplit(fullName)[0]));
        contactBuilder.firstName(StringSplit.fullNameSplit(fullName)[1]);
        String phone = new LightningFormattedElement(driver, "Phone").getText();
        if (phone != "") {
            contactBuilder.phone(phone);
        }
        String mobile = new LightningFormattedElement(driver, "Mobile").getText();
        if (mobile != "") {
            contactBuilder.mobile(mobile);
        }
        String email = new LightningFormattedElement(driver, "Email").getText();
        if (email != "") {
            contactBuilder.email(email);
        }
        String title = new LightningFormattedElement(driver, "Title").getText();
        if (title != "") {
            contactBuilder.title(title);
        }
        String reportsTo = new LightningFormattedElement(driver, "Reports To").getText();
        if (reportsTo != "") {
            contactBuilder.reportsTo(reportsTo);
        }
        String fax = new LightningFormattedElement(driver, "Fax").getText();
        if (fax != "") {
            contactBuilder.fax(fax);
        }
        String homePhone = new LightningFormattedElement(driver, "Home Phone").getText();
        if (homePhone != "") {
            contactBuilder.homePhone(homePhone);
        }
        String otherPhone = new LightningFormattedElement(driver, "Other Phone").getText();
        if (otherPhone != "") {
            contactBuilder.otherPhone(otherPhone);
        }
        String asstPhone = new LightningFormattedElement(driver, "Asst. Phone").getText();
        if (asstPhone != "") {
            contactBuilder.asstPhone(asstPhone);
        }
        String assistant = new LightningFormattedElement(driver, "Assistant").getText();
        if (assistant != "") {
            contactBuilder.assistant(assistant);
        }
        String department = new LightningFormattedElement(driver, "Department").getText();
        if (department != "") {
            contactBuilder.department(department);
        }
        String leadSource = new LightningFormattedElement(driver, "Lead Source").getText();
        if (leadSource != "") {
            contactBuilder.leadSource(LeadSource.fromString(leadSource));
        }
        String birthdate = new LightningFormattedElement(driver, "Birthdate").getText();
        if (birthdate != "") {
            contactBuilder.birthdate(birthdate);
        }
        String description = new LightningFormattedElement(driver, "Description").getText();
        if (description != "") {
            contactBuilder.description(description);
        }
        String mailingAddress = new LightningFormattedElement(driver, "Mailing Address").getText();
        String mailingStreet;
        String mailingCity;
        String mailingState;
        String mailingZip;
        String mailingCountry;
        if (mailingAddress != "") {
            mailingAddress = mailingAddress.replace(",", " ");
            mailingAddress = mailingAddress.replace("\n", " ");
            mailingAddress = mailingAddress.replace("  ", " ");
            String[] mailingAddressSplit = mailingAddress.split("\\s");
            mailingStreet = mailingAddressSplit[0];
            mailingCity = mailingAddressSplit[1];
            mailingState = mailingAddressSplit[2];
            mailingZip = mailingAddressSplit[3];
            mailingCountry = mailingAddressSplit[4];
        } else {
            mailingStreet = null;
            mailingCity = null;
            mailingState = null;
            mailingZip = null;
            mailingCountry = null;
        }
        contactBuilder.mailingStreet(mailingStreet);
        contactBuilder.mailingCity(mailingCity);
        contactBuilder.mailingState(mailingState);
        contactBuilder.mailingZip(mailingZip);
        contactBuilder.mailingCountry(mailingCountry);
        String otherAddress = new LightningFormattedElement(driver, "Other Address").getText();
        String otherStreet;
        String otherCity;
        String otherState;
        String otherZip;
        String otherCountry;
        if (otherAddress != "") {
            otherAddress = otherAddress.replace(",", " ");
            otherAddress = otherAddress.replace("\n", " ");
            otherAddress = otherAddress.replace("  ", " ");
            String[] otherAddressSplit = otherAddress.split("\\s");
            otherStreet = otherAddressSplit[0];
            otherCity = otherAddressSplit[1];
            otherState = otherAddressSplit[2];
            otherZip = otherAddressSplit[3];
            otherCountry = otherAddressSplit[4];
        } else {
            otherStreet = null;
            otherCity = null;
            otherState = null;
            otherZip = null;
            otherCountry = null;
        }
        contactBuilder.otherStreet(otherStreet);
        contactBuilder.otherCity(otherCity);
        contactBuilder.otherState(otherState);
        contactBuilder.otherZip(otherZip);
        contactBuilder.otherCountry(otherCountry);
        return contactBuilder.build();
    }
}
