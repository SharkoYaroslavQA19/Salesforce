package PageFactory;

import com.github.javafaker.Faker;
import enums.*;
import models.Lead;

public class FactoryLead {
    Faker faker = new Faker();

    public Lead LeadWithAllData() {
        return Lead.builder().lastName(faker.name().lastName())
                .company(faker.company().name())
                .leadStatus(LeadStatus.CONTACTED)
                .salutation(Salutation.MR)
                .firstName(faker.name().firstName())
                .phone(faker.phoneNumber().phoneNumber())
                .email(faker.internet().emailAddress())
                .title(faker.name().title())
                .rating(Rating.HOT)
                .website(faker.internet().url())
                .street(faker.name().username())
                .state(faker.name().username())
                .city(faker.name().username())
                .zip(faker.address().zipCode())
                .country(faker.name().username())
                .noOfEmployees("1")
                .annualRevenue("12")
                .leadSource(LeadSource.ADVERTISEMENT)
                .industry(Industry.INSURANCE)
                .description("yaroslav")
                .build();
    }

    public Lead LeadWithAddress() {
        return Lead.builder().lastName(faker.name().lastName())
                .company(faker.company().name())
                .leadStatus(LeadStatus.CONTACTED)
                .salutation(Salutation.MR)
                .firstName(faker.name().firstName())
                .street(faker.name().username())
                .state(faker.name().username())
                .city(faker.name().username())
                .zip(faker.address().zipCode())
                .country(faker.name().username())
                .leadSource(LeadSource.ADVERTISEMENT)
                .build();
    }

}
