import java.util.Arrays;

public class SeparateConsonantsVowels {

    public static void main(String[] args) {
        String inputString = "HelloWorld";
        String result = validate(inputString);
        System.out.println(result);

        inputString = "programming";
        result = validate(inputString);
        System.out.println(result);


        inputString =  "AEIOU"; // Test with only vowels
        result = validate(inputString);
        System.out.println(result);

        inputString = "bcdfgh"; // Test with only consonants
        result = validate(inputString);
        System.out.println(result);

        inputString = ""; // Test with empty string
        result = validate(inputString);
        System.out.println(result);

    }

    public static String validate(String inputString) {
        if (inputString == null) {
            return "Invalid input (null)";
        }


        StringBuilder consonants = new StringBuilder();
        StringBuilder vowels = new StringBuilder();

        String lowerCaseInput = inputString.toLowerCase(); // Case-insensitive checking


        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char ch = lowerCaseInput.charAt(i);
            if (Character.isLetter(ch)) { // Consider only letters
                if ("aeiou".indexOf(ch) != -1) {
                    vowels.append(ch);
                } else {
                    consonants.append(ch);
                }
            }
        }

        return "Consonants: " + consonants.toString() + ", Vowels: " + vowels.toString();
    }
}




