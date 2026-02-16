import java.util.Arrays;

public class StringMatching {

    public static boolean match(String str1, String str2) {
        // Check if the strings are of equal length
        if (str1.length() != str2.length()) {
            return false;
        }

        // Sort the characters of both strings
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Check if the sorted arrays are equal
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(match("abc", "cab")); // true
        System.out.println(match("aac", "aca")); // true
        System.out.println(match("hello", "olleh")); // true
        System.out.println(match("abc", "bcd")); // false
        System.out.println(match("abc", "ab")); // false
        System.out.println(match("abc", "abcde")); // false
        System.out.println(match("", "")); // true
        System.out.println(match("a", "a")); // true
    }
}
