import java.util.ArrayList;
import java.util.List;

public class LastNVowels {

    public static void main(String[] args) {
        String str1 = "aeroplane";
        int n1 = 3;
        System.out.println("Last " + n1 + " vowels of \"" + str1 + "\": " + validate(str1, n1)); // Expected: "ae"

        String str2 = "programming";
        int n2 = 2;
        System.out.println("Last " + n2 + " vowels of \"" + str2 + "\": " + validate(str2, n2)); // Expected: "ai"

        String str3 = "coding";
        int n3 = 5; 
        System.out.println("Last " + n3 + " vowels of \"" + str3 + "\": " + validate(str3, n3)); // Expected: "oi"

        String str4 = "rhythm"; // No vowels
        int n4 = 2;
        System.out.println("Last " + n4 + " vowels of \"" + str4 + "\": " + validate(str4, n4)); // Expected: ""


    }

    public static String validate(String str, int n) {
        List<Character> vowels = new ArrayList<>();

        // Find all vowels (case-insensitive) and add them to the list
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels.add(c);
            }
        }

        StringBuilder result = new StringBuilder();
        int numVowels = vowels.size();

        // Get the last n vowels (or fewer if there are not enough)
        for (int i = Math.max(0, numVowels - n); i < numVowels; i++) {
            result.append(vowels.get(i));
        }

        return result.toString();
    }
}
