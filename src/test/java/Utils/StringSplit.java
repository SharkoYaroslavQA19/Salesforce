package Utils;

public class StringSplit {
    public static String[] fullNameSplit(String fullName) {
        String[] fullNameSplit = fullName.split("\\s");
        return fullNameSplit;
    }

    public static String textSplit(String text) {
        String splitText;
        splitText = text.replace("Open", "");
        splitText = splitText.replace("Preview", "");
        splitText = splitText.replace(" ", "");
        return splitText;
    }
}