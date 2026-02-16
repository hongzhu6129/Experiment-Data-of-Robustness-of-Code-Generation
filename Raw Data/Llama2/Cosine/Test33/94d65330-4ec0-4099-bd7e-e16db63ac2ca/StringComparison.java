import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the four input strings
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String string3 = scanner.nextLine();
        String string4 = scanner.nextLine();

        // Check if the strings are all the same length
        if (string1.length() != string2.length() || string1.length() != string3.length() || string1.length() != string4.length()) {
            System.out.println("The strings are not all the same length.");
            return;
        }

        // Check if the strings are all the same
        if (string1.equals(string2) && string1.equals(string3) && string1.equals(string4)) {
            System.out.println("The strings are all the same.");
            return;
        }

        // Check if the strings are all different
        if (!string1.equals(string2) && !string1.equals(string3) && !string1.equals(string4) && !string2.equals(string3) && !string2.equals(string4) && !string3.equals(string4)) {
            System.out.println("The strings are all different.");
            return;
        }

        // Check if the strings are all the same except for one character
        int numDifferences = 0;
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                numDifferences++;
            }
            if (string1.charAt(i) != string3.charAt(i)) {
                numDifferences++;
            }
            if (string1.charAt(i) != string4.charAt(i)) {
                numDifferences++;
            }
        }

        if (numDifferences == 1) {
            System.out.println("The strings are all the same except for one character.");
            return;
        }

        // Otherwise, the strings are not the same
        System.out.println("The strings are not the same.");
    }
}
