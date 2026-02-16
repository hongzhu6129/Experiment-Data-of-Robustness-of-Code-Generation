import java.util.Arrays;

public class StringCompare {

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
                "apple", "banana", "cherry",
                "Apple", "Banana", "Cherry",
                "apple", "apple", "apple",
                "banana", "banana", "banana",
                "cherry", "cherry", "cherry",
                "apple", "banana", "cherry",
                "Apple", "Banana", "Cherry",
                "apple", "apple", "apple",
                "banana", "banana", "banana",
                "cherry", "cherry", "cherry",
                "", "", "",
                "a", "a", "a",
                "a", "b", "c",
                "c", "b", "a",
        };

        // Sort the test cases lexicographically, ignoring case differences
        Arrays.sort(testCases, String.CASE_INSENSITIVE_ORDER);

        // Print the sorted test cases
        for (String testCase : testCases) {
            System.out.println(testCase);
        }
    }
}
