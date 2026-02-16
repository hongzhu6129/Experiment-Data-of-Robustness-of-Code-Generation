import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        
Test Cases:

1. Empty String: ""
2. String with duplicate characters: "hello"
3. String with no duplicate characters: "abcdef"
4. String with special characters: "!@#$%^&*()_+=-`~/?><,.:;"
5. String with numbers: "1234567890"

Input: ""
Output: ""

Input: "hello"
Output: "helo"

Input: "abcdef"
Output: "abcdef"

Input: "!@#$%^&*()_+=-`~/?><,.:;"
Output: "!@#$%^&*()_+=-`~/?><,.:;"

Input: "1234567890"
Output: "1234567890"


        // Test case 1: Empty string
        String str1 = "";
        System.out.println("Input: " + str1);
        String result1 = removeDuplicates(str1);
        System.out.println("Output: " + result1);

        // Test case 2: String with duplicate characters
        String str2 = "hello";
        System.out.println("Input: " + str2);
        String result2 = removeDuplicates(str2);
        System.out.println("Output: " + result2);

        // Test case 3: String with no duplicate characters
        String str3 = "abcdef";
        System.out.println("Input: " + str3);
        String result3 = removeDuplicates(str3);
        System.out.println("Output: " + result3);

        // Test case 4: String with special characters
        String str4 = "!@#$%^&*()_+=-`~/?><,.:;";
        System.out.println("Input: " + str4);
        String result4 = removeDuplicates(str4);
        System.out.println("Output: " + result4);

        // Test case 5: String with numbers
        String str5 = "1234567890";
        System.out.println("Input: " + str5);
        String result5 = removeDuplicates(str5);
        System.out.println("Output: " + result5);
    }

    public static String removeDuplicates(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }
        return sb.toString();
    }
}
