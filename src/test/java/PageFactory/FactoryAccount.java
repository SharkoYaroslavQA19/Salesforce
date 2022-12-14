package PageFactory;

import com.github.javafaker.Faker;
import enums.Industry;
import enums.Type;
import models.Account;

public class FactoryAccount {
    private static final Faker faker = new Faker();

    public static Account accountWithAllData() {
        return Account.builder().accountName(faker.name().username())
                .phone(faker.phoneNumber().phoneNumber())
                .fax(faker.phoneNumber().phoneNumber())
                .website(faker.internet().url())
                .employees("1")
                .annualRevenue("123")
                .type(Type.ANALYST)
                .industry(Industry.INSURANCE)
                .description(faker.name().username())
                .billingStreet(faker.name().username())
                .billingCity(faker.name().username())
                .billingState(faker.name().username())
                .billingZip(faker.address().zipCode())
                .billingCountry(faker.name().username())
                .shippingStreet(faker.name().username())
                .shippingCity(faker.name().username())
                .shippingState(faker.name().username())
                .shippingZip(faker.address().zipCode())
                .shippingCountry(faker.name().username())
                .build();
    }

    public static Account accountWithAddress() {
        return Account.builder().accountName(faker.name().username())
                .billingStreet(faker.name().username())
                .billingCity(faker.name().username())
                .billingState(faker.name().username())
                .billingZip(faker.address().zipCode())
                .billingCountry(faker.name().username())
                .shippingStreet(faker.name().username())
                .shippingCity(faker.name().username())
                .shippingState(faker.name().username())
                .shippingZip(faker.address().zipCode())
                .shippingCountry(faker.name().username())
                .build();
    }
}
