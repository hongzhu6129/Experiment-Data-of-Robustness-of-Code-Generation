import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCounter {

    public static void main(String[] args) {
        String inputString = "Hello, World! This is a test string.";
        int vowelCount = validate(inputString);
        System.out.println("Number of vowels: " + vowelCount);


        inputString = "Ths s trng wth n vwls.";  // Example with no vowels
        vowelCount = validate(inputString);
        System.out.println("Number of vowels: " + vowelCount);

        inputString = "aeiouAEIOU"; // Example with only vowels
        vowelCount = validate(inputString);
        System.out.println("Number of vowels: " + vowelCount);


        inputString = null; // Example with null input
        vowelCount = validate(inputString);
        System.out.println("Number of vowels: " + vowelCount);


        inputString = ""; // Example with empty input
        vowelCount = validate(inputString);
        System.out.println("Number of vowels: " + vowelCount);


    }

    public static int validate(String inputString) {
        if (inputString == null) {
            return 0; // Handle null input
        }


        Pattern vowelPattern = Pattern.compile("[aeiouAEIOU]"); // Regular expression for vowels
        Matcher matcher = vowelPattern.matcher(inputString);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
