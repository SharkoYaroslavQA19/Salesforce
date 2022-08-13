package models;


import enums.Industry;
import enums.Type;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Account {
    @NonNull
    private String accountName;
    private String parentAccount;
    private String phone;
    private String fax;
    private String website;
    private String employees;
    private String annualRevenue;
    private Type type;
    private Industry industry;
    private String description;
    private String billingStreet;
    private String billingCity;
    private String billingState;
    private String billingZip;
    private String billingCountry;
    private String shippingStreet;
    private String billingAddress;
    private String shippingCity;
    private String shippingState;
    private String shippingZip;
    private String shippingCountry;
    private String shippingAddress;

}
