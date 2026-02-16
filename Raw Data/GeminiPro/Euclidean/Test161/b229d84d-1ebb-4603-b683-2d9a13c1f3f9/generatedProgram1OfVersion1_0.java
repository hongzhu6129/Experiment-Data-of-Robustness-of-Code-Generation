import java.util.Scanner;

public class AlphaHelix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the string is valid
        if (!isValidString(inputString)) {
            System.out.println("The input string is not valid.");
            return;
        }

        // Get the five specified positions
        System.out.println("Enter the five specified positions: ");
        int[] positions = new int[5];
        for (int i = 0; i < 5; i++) {
            positions[i] = scanner.nextInt();
        }

        // Check if the positions are valid
        if (!isValidPositions(positions)) {
            System.out.println("The specified positions are not valid.");
            return;
        }

        // Get the alpha-helix string
        String alphaHelixString = getAlphaHelixString(inputString, positions);

        // Print the alpha-helix string
        System.out.println("The alpha-helix string is: " + alphaHelixString);
    }

    private static boolean isValidString(String inputString) {
        // Check if the string is null or empty
        if (inputString == null || inputString.isEmpty()) {
            return false;
        }

        // Check if the string contains only alphabetic characters
        for (char c : inputString.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValidPositions(int[] positions) {
        // Check if the array is null or empty
        if (positions == null || positions.length == 0) {
            return false;
        }

        // Check if the positions are within the range of the input string
        for (int position : positions) {
            if (position < 1 || position > inputString.length()) {
                return false;
            }
        }

        return true;
    }

    private static String getAlphaHelixString(String inputString, int[] positions) {
        StringBuilder alphaHelixString = new StringBuilder();

        for (int position : positions) {
            alphaHelixString.append(inputString.charAt(position - 1));
        }

        return alphaHelixString.toString();
    }
}
