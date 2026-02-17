import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCounter {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        int vowelCount = validate(inputString);

        System.out.println("The string \"" + inputString + "\" contains " + vowelCount + " vowels.");


        inputString = "ThIs Is A tEsT";
        vowelCount = validate(inputString);
         System.out.println("The string \"" + inputString + "\" contains " + vowelCount + " vowels.");

        inputString = "rhythm"; // Example with no vowels (traditional definition)
        vowelCount = validate(inputString);
        System.out.println("The string \"" + inputString + "\" contains " + vowelCount + " vowels.");



    }

    public static int validate(String inputString) {
        if (inputString == null) {
            return 0; // Or throw an exception, depending on desired behavior
        }

        // Regular expression to match vowels (case-insensitive)
        Pattern vowelPattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = vowelPattern.matcher(inputString);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
