import java.util.Arrays;

public class StringPermutationChecker {

    public static void main(String[] args) {
        String string1 = "abc";
        String string2 = "bca";
        String string3 = "abd";

        System.out.println("\"" + string1 + "\" is a permutation of \"" + string2 + "\": " + stringPermutation(string1, string2)); // Expected: true
        System.out.println("\"" + string1 + "\" is a permutation of \"" + string3 + "\": " + stringPermutation(string1, string3)); // Expected: false


        // Additional test cases (good practice to include various scenarios)
        System.out.println("\"" +  "" + "\" is a permutation of \"" + "" + "\": " + stringPermutation("", "")); // true - empty strings
        System.out.println("\"" + "a" + "\" is a permutation of \"" + "a" + "\": " + stringPermutation("a", "a")); // true - single characters
        System.out.println("\"" + "hello" + "\" is a permutation of \"" + "olleh" + "\": " + stringPermutation("hello", "olleh")); //true
        System.out.println("\"" + "World" + "\" is a permutation of \"" + "world" + "\": " + stringPermutation("World", "world")); // false - case-sensitive



    }

    public static boolean stringPermutation(String str1, String str2) {
        // 1. Check if the lengths are equal. If not, they cannot be permutations.
        if (str1.length() != str2.length()) {
            return false;
        }

        // 2. Convert strings to char arrays and sort them.
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


        // 3. Compare the sorted arrays. 
        return Arrays.equals(charArray1, charArray2);


        /* Alternative implementation using frequency counting (Suitable if character set is limited, e.g., ASCII):
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCounts = new int[256]; // Assuming ASCII characters

        for (char c : str1.toCharArray()) {
            charCounts[c]++;
        }

        for (char c : str2.toCharArray()) {
            charCounts[c]--;
            if (charCounts[c] < 0) {  // Character count went negative, not a permutation
                return false;
            }
        }
        return true; // All counts should be 0 if it's a permutation
        */
    }
}


