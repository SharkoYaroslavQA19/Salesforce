package models;


import enums.*;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Lead {
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String company;
    private Salutation salutation;
    @NonNull
    private LeadStatus leadStatus;
    private String phone;
    private String email;
    private String title;
    private Rating rating;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String website;
    private String noOfEmployees;
    private String annualRevenue;
    private LeadSource leadSource;
    private Industry industry;
    private String description;
    private String fullName;
    private String fullAddress;

}