package models;



import enums.LeadSource;
import enums.Salutation;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Contact {
    private String firstName;
    @NonNull
    private String lastName;
    private Salutation salutation;
    @NonNull
    private String accountName;
    private String phone;
    private String mobile;
    private String email;
    private String title;
    private String reportsTo;
    private String mailingStreet;
    private String mailingCity;
    private String mailingState;
    private String mailingZip;
    private String mailingCountry;
    private String otherStreet;
    private String otherCity;
    private String otherState;
    private String otherZip;
    private String otherCountry;
    private String fax;
    private String homePhone;
    private String otherPhone;
    private String asstPhone;
    private String assistant;
    private String department;
    private LeadSource leadSource;
    private String birthdate;
    private String description;

}