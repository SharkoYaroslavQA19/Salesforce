package enums;

public enum Type {
    NONE("--None--"),
    ANALYST("Analyst"),
    COMPETITOR("Competitor"),
    CUSTOMER("Customer"),
    INTEGRATOR("Integrator"),
    INVESTOR("Investor"),
    PARTNER("Partner"),
    PRESS("Press"),
    PROSPECT("Prospect"),
    RESELLER("Reseller"),
    OTHER("Other");
    private final String type;

    Type(String type) {
        this.type = type;
    }

    public static Type fromString(String value) {
        for (Type contactType : Type.values()) {
            if (contactType.getName().equals(value)) {
                return contactType;
            }
        }
        return null;
    }

    public String getName() {
        return this.type;
    }

}
