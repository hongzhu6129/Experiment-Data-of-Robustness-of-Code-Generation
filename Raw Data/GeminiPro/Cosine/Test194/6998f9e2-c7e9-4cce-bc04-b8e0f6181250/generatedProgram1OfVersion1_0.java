import java.util.Arrays;
import java.util.Scanner;

public class LexicographicallySortedStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the three strings from the user.
        System.out.println("Enter three strings:");
        String[] strings = new String[3];
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }

        // Convert the strings to lowercase and sort them lexicographically.
        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);

        // Print the sorted strings.
        System.out.println("The three strings lexicographically sorted, ignoring case differences, are:");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
