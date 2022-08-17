package pages;


import elements.LightningFormattedElement;
import enums.*;
import lombok.extern.log4j.Log4j2;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utils.StringSplit;
@Log4j2
public class LeadDetailsPage extends BasePage {

    private final static By ICON_LEAD_DETAILS_LOCATOR = By.xpath("//records-highlights-icon");

    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_LEAD_DETAILS_LOCATOR);
    }

    public Lead getLeadInfo() {
        log.info("Filling in the data form Leads");
        String fullName = new LightningFormattedElement(driver, "Name").getText();
        StringSplit.fullNameSplit(fullName);
        String fullAddress = new LightningFormattedElement(driver, "Address").getText();
        String street;
        String city;
        String state;
        String zip;
        String country;
        if (fullAddress != "") {
            fullAddress = fullAddress.replace(",", " ");
            fullAddress = fullAddress.replace("\n", " ");
            fullAddress = fullAddress.replace("  ", " ");
            String[] fullAddressSplit = fullAddress.split("\\s");
            street = fullAddressSplit[0];
            city = fullAddressSplit[1];
            state = fullAddressSplit[2];
            zip = fullAddressSplit[3];
            country = fullAddressSplit[4];
        } else {
            street = null;
            city = null;
            state = null;
            zip = null;
            country = null;
        }

        String company = new LightningFormattedElement(driver, "Company").getText();
        String leadStatus = new LightningFormattedElement(driver, "Lead Status").getText();
        Lead.LeadBuilder leadBuilder = Lead.builder().lastName(StringSplit.fullNameSplit(fullName)[2]).company(company).leadStatus(LeadStatus.fromString(leadStatus));
        leadBuilder.salutation(Salutation.fromString(StringSplit.fullNameSplit(fullName)[0]));
        leadBuilder.firstName(StringSplit.fullNameSplit(fullName)[1]);
        leadBuilder.street(street);
        leadBuilder.city(city);
        leadBuilder.state(state);
        leadBuilder.zip(zip);
        leadBuilder.country(country);
        String phone = new LightningFormattedElement(driver, "Phone").getText();
        if (phone != "") {
            leadBuilder.phone(phone);
        }
        String email = new LightningFormattedElement(driver, "Email").getText();
        if (email != "") {
            leadBuilder.email(email);
        }
        String title = new LightningFormattedElement(driver, "Title").getText();
        if (title != "") {
            leadBuilder.title(title);
        }
        String rating = new LightningFormattedElement(driver, "Rating").getText();
        if (rating != "") {
            leadBuilder.rating(Rating.fromString(rating));
        }
        String website = new LightningFormattedElement(driver, "Website").getText();
        if (website != "") {
            leadBuilder.website(website);
        }
        String noOfEmployees = new LightningFormattedElement(driver, "No. of Employees").getText();
        if (noOfEmployees != "") {
            leadBuilder.noOfEmployees(noOfEmployees);
        }
        String annualRevenue = new LightningFormattedElement(driver, "Annual Revenue").getText();
        annualRevenue = annualRevenue.replace("$", "");
        if (annualRevenue != "") {
            leadBuilder.annualRevenue(annualRevenue);
        }
        String leadSource = new LightningFormattedElement(driver, "Lead Source").getText();
        if (leadSource != "") {
            leadBuilder.leadSource(LeadSource.fromString(leadSource));
        }
        String industry = new LightningFormattedElement(driver, "Industry").getText();
        if (industry != "") {
            leadBuilder.industry(Industry.fromString(industry));
        }
        String description = new LightningFormattedElement(driver, "Description").getText();
        if (description != "") {
            leadBuilder.description(description);
        }
        return leadBuilder.build();
    }
}
