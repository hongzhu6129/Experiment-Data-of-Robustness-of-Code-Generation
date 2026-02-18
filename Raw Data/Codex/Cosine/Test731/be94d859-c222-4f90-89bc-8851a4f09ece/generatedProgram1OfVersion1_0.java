import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCounter {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        int vowelCount = validate(inputString);
        System.out.println("Number of vowels: " + vowelCount);

        inputString = "This is a test string.";
        vowelCount = validate(inputString);
        System.out.println("Number of vowels: " + vowelCount);


        inputString =  "Rhythm"; //Example with no conventional vowels
        vowelCount = validate(inputString);
        System.out.println("Number of vowels: " + vowelCount);


        inputString = ""; // Empty String example
        vowelCount = validate(inputString);
        System.out.println("Number of vowels: " + vowelCount);




    }

    public static int validate(String inputString) {
        if (inputString == null) {
            return 0; // Or throw an exception, depending on desired behavior
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
