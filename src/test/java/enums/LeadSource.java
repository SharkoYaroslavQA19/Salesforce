package enums;

public enum LeadSource {
    NONE("--None--"),
    ADVERTISEMENT("Advertisement"),
    EMPLOYEE_REFERRAL("Employee Referral"),
    EXTERNAL_REFERRAL("External Referral"),
    IN_STORE("In-store"),
    ON_SITE("On site"),
    OTHER("Other"),
    SOCIAL("Social"),
    TRADE_SHOW("Trade show"),
    WEB("Wed"),
    WORD_OF_MOUTH("Word of mouth");

    private final String leadSource;

    LeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public static LeadSource fromString(String value) {
        for (LeadSource contactLeadSource : LeadSource.values()) {
            if (contactLeadSource.getName().equals(value)) {
                return contactLeadSource;
            }
        }
        return null;
    }

    public String getName() {
        return this.leadSource;
    }
}