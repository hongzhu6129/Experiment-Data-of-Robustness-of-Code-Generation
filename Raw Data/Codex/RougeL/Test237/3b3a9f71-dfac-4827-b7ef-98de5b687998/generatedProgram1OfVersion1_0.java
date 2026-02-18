import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSubstring {

    public static void main(String[] args) {
        String originalString = "The quick brown fox jumps over the lazy dog.";
        String regex = "fox"; // The regular expression to match
        String replacement = "cat"; // The replacement string

        // Using Pattern and Matcher classes for replacement
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(originalString);
        String replacedString = matcher.replaceAll(replacement);

        System.out.println("Original String: " + originalString);
        System.out.println("Replaced String: " + replacedString);


        // Example with a more complex regex (replacing multiple spaces with single space)
        String stringWithMultipleSpaces = "This   string has   multiple    spaces.";
        String regexForMultipleSpaces = "\\s+"; // Matches one or more whitespace characters
        String replacementForMultipleSpaces = " ";

        Pattern pattern2 = Pattern.compile(regexForMultipleSpaces);
        Matcher matcher2 = pattern2.matcher(stringWithMultipleSpaces);
        String stringWithSingleSpaces = matcher2.replaceAll(replacementForMultipleSpaces);

        System.out.println("\nOriginal String with Multiple Spaces: " + stringWithMultipleSpaces);
        System.out.println("String with Single Spaces: " + stringWithSingleSpaces);


        // Another example (case-insensitive replacement)
        String caseInsensitiveString = "apple APPLE Apple aPpLe";
        String caseInsensitiveRegex = "(?i)apple"; // Case-insensitive match for "apple"
        String caseInsensitiveReplacement = "orange";

        Pattern pattern3 = Pattern.compile(caseInsensitiveRegex);
        Matcher matcher3 = pattern3.matcher(caseInsensitiveString);
        String caseInsensitiveReplacedString = matcher3.replaceAll(caseInsensitiveReplacement);


        System.out.println("\nOriginal String (Case-Insensitive): " + caseInsensitiveString);
        System.out.println("Replaced String (Case-Insensitive): " + caseInsensitiveReplacedString);

    }
}
