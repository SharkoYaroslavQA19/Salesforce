package Utils;

public class Message {
    public static String expectedLeadMessageText(String salutation, String firstName, String lastName) {
        String expectedText = String.format("success\n" + "Lead \"%s %s %s\" was created.\n" + "Close", salutation, firstName, lastName);
        return expectedText;
    }

    public static String expectedAccountMessageText(String accountName) {
        String expectedText = String.format("success\n" + "Account \"%s\" was created.\n" + "Close", accountName);
        return expectedText;
    }

    public static String expectedContactMessageText(String salutation, String firstName, String lastName) {
        String expectedText = String.format("success\n" + "Contact \"%s %s %s\" was created.\n" + "Close", salutation, firstName, lastName);
        return expectedText;
    }
}