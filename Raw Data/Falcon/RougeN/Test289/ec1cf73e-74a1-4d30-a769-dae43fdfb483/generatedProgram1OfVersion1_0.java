import java.util.Scanner;

public class StringElider {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input strings
        System.out.println("Enter four strings:");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        String s4 = scanner.nextLine();

        // Elide the strings
        String elidedS1 = elide(s1);
        String elidedS2 = elide(s2);
        String elidedS3 = elide(s3);
        String elidedS4 = elide(s4);

        // Print the elided strings
        System.out.println("Elided strings:");
        System.out.println(elidedS1);
        System.out.println(elidedS2);
        System.out.println(elidedS3);
        System.out.println(elidedS4);
    }

    private static String elide(String s) {
        // Convert the string to an array of characters
        char[] chars = s.toCharArray();

        // Create a new string to store the elided string
        StringBuilder elidedString = new StringBuilder();

        // Iterate over the characters in the array
        for (char c : chars) {
            // If the character is not a protagonist, add it to the elided string
            if (!isProtagonist(c)) {
                elidedString.append(c);
            }
        }

        // Return the elided string
        return elidedString.toString();
    }

    private static boolean isProtagonist(char c) {
        // Create an array of protagonist characters
        char[] protagonists = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        // Iterate over the array of protagonist characters
        for (char protagonist : protagonists) {
            // If the character is a protagonist, return true
            if (c == protagonist) {
                return true;
            }
        }

        // Otherwise, return false
        return false;
    }
}
