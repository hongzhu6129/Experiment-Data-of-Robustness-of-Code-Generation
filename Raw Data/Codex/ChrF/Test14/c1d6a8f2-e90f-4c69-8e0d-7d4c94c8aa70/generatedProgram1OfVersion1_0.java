import java.util.Scanner;

public class CanonicalProportional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string from the user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Get the canonical proportional form of the string
        String canonicalProportionalForm = getCanonicalProportionalForm(str);

        // Print the canonical proportional form
        System.out.println("The canonical proportional form of the string is: " + canonicalProportionalForm);
    }

    /**
     * Gets the canonical proportional form of a string.
     *
     * @param str The string to get the canonical proportional form of
     * @return The canonical proportional form of the string
     */
    public static String getCanonicalProportionalForm(String str) {
        // Convert the string to lowercase
        str = str.toLowerCase();

        // Remove all non-alphabetic characters from the string
        str = str.replaceAll("[^a-z]", "");

        // Sort the string alphabetically
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        // Return the sorted string
        return new String(chars);
    }
}
