import java.util.ArrayList;
import java.util.List;

public class LastNVowels {

    public static void main(String[] args) {
        String inputString = "aeiouAEIOUxyz";
        int n = 3;
        String result = validate(inputString, n);
        System.out.println(result); // Output: OU

        inputString = "programming";
        n = 2;
        result = validate(inputString, n);
        System.out.println(result); // Output: ai

        inputString = "hello world";
        n = 4;
        result = validate(inputString, n);
        System.out.println(result); // Output: eoo


        inputString =  "This is a test string"; // Example with more vowels than n
        n = 2;
        result = validate(inputString, n);
        System.out.println(result); // Output: i


        inputString = "xyz"; // Example with no vowels
        n = 2;
        result = validate(inputString, n);
        System.out.println(result); // Output: 


         inputString = "aeiou"; // Example with equal number of vowels and n
        n = 5;
        result = validate(inputString, n);
        System.out.println(result); // Output: aeiou
    }


    public static String validate(String inputString, int n) {
        if (inputString == null || inputString.isEmpty()) {
            return "";
        }

        List<Character> vowels = new ArrayList<>();
        String lowerCaseInput = inputString.toLowerCase();

        for (char c : lowerCaseInput.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels.add(c);
            }
        }

        StringBuilder result = new StringBuilder();
        int numVowels = vowels.size();

        // Handle the case where there are fewer vowels than n
        int startIndex = Math.max(0, numVowels - n);

        for (int i = startIndex; i < numVowels; i++) {
           result.append(vowels.get(i));
        }
       
        return result.toString();

    }
}
