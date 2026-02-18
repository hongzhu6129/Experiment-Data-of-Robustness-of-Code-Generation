import java.util.*;

public class SubstringFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Get all substrings of length 3
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i <= str.length() - 3; i++) {
            substrings.add(str.substring(i, i + 3));
        }

        // Find substrings that appear three times
        Map<String, Integer> counts = new HashMap<>();
        for (String substring : substrings) {
            counts.put(substring, counts.getOrDefault(substring, 0) + 1);
        }

        // Print substrings that appear three times
        for (String substring : counts.keySet()) {
            if (counts.get(substring) == 3) {
                System.out.println("Substring that appears three times: " + substring);
            }
        }
    }
}
