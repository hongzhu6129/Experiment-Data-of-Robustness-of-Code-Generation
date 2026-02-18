import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChars {

    public static void main(String[] args) {
        String str1 = "programming";
        String str2 = "gram";

        String result = removeDuplicates(str1, str2);
        System.out.println(result); // Output: proin

        str1 = "hello world";
        str2 = "lord";
        result = removeDuplicates(str1, str2);
        System.out.println(result); // Output: he w
        
         str1 =  "computer science";
         str2 = "science";
         result = removeDuplicates(str1,""); // Removing duplicates against an empty string should return the original string
         System.out.println(result); // Output: computer science
         
          str1 =  "computer science";
         str2 = "science";
         result = removeDuplicates("", str2); // Removing duplicates from an empty string should return an empty string
         System.out.println(result); // Output: 
        
        str1 = null; //Test for null strings
        str2 = "science";
        result = removeDuplicates(str1, str2);
        System.out.println(result); // Output: null
        
        str1 = "computer science";
        str2 = null; // Test for null strings
        result = removeDuplicates(str1, str2);
        System.out.println(result); // Output: computer science

    }

    public static String removeDuplicates(String str1, String str2) {
        if (str1 == null) return null; // Handle null input for str1
        if (str2 == null) return str1; // Handle null input for str2 (return original str1)
        if (str2.isEmpty()) return str1; // Return original string if str2 is empty
        if (str1.isEmpty()) return "";  // Return empty string if str1 is empty


        Set<Character> charSet = new HashSet<>();
        for (char c : str2.toCharArray()) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : str1.toCharArray()) {
            if (!charSet.contains(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
