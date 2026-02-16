public class TrimString {

    public static void main(String[] args) {
        String stringWithLeadingAndTrailingSpaces = "   This string has leading and trailing spaces.    ";

        // Using trim() to remove leading and trailing whitespace
        String trimmedString = stringWithLeadingAndTrailingSpaces.trim();

        System.out.println("Original String: \"" + stringWithLeadingAndTrailingSpaces + "\"");
        System.out.println("Trimmed String: \"" + trimmedString + "\"");


        // Demonstrating strip() (Java 11 and later), which is similar to trim() but handles other Unicode whitespace characters more comprehensively.
        String stringWithUnicodeWhitespace = "\u2002  This has Unicode whitespace. \u00A0"; // Example with En Space and Non-breaking space
        String strippedString = stringWithUnicodeWhitespace.strip();
        System.out.println("Original String with Unicode Whitespace: \"" + stringWithUnicodeWhitespace + "\"");
        System.out.println("Stripped String: \"" + strippedString + "\"");



        //Demonstrating stripLeading() and stripTrailing() (Java 11 and later) for removing leading or trailing whitespace only
        String stringLeading = "   Leading spaces only.";
        String stringTrailing = "Trailing Spaces only.   ";

        String strippedLeading = stringLeading.stripLeading();
        String strippedTrailing = stringTrailing.stripTrailing();

        System.out.println("Original with leading spaces: \"" + stringLeading + "\"");
        System.out.println("Stripped leading spaces: \"" + strippedLeading + "\"");

        System.out.println("Original with trailing spaces: \"" + stringTrailing + "\"");
        System.out.println("Stripped trailing spaces: \"" + strippedTrailing + "\"");


    }
}
