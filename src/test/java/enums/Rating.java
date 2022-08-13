package enums;

public enum Rating {
    NONE("--None--"),
    HOT("Hot"),
    WARM("Warm"),
    COLD("Cold");
    private final String rating;

    Rating(String rating) {
        this.rating = rating;
    }

    public static Rating fromString(String value) {
        for (Rating contactRating : Rating.values()) {
            if (contactRating.getName().equals(value)) {
                return contactRating;
            }
        }
        return null;
    }

    public String getName() {
        return this.rating;
    }
}