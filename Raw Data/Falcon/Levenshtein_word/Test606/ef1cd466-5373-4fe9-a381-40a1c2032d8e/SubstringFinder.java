import java.util.Scanner;

public class SubstringFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the input string and positions
        System.out.println("Enter the string:");
        String str = input.nextLine();
        System.out.println("Enter the four positions (separated by spaces):");
        int[] positions = new int[4];
        for (int i = 0; i < positions.length; i++) {
            positions[i] = input.nextInt();
        }

        // Find the substrings at the specified positions
        String[] substrings = new String[positions.length];
        boolean found = true;
        for (int i = 0; i < positions.length; i++) {
            if (positions[i] < 0 || positions[i] >= str.length()) {
                found = false;
                break;
            }
            substrings[i] = str.substring(positions[i], positions[i] + 1);
        }

        // Check if all substrings are the same
        boolean same = true;
        for (int i = 1; i < substrings.length; i++) {
            if (!substrings[i].equals(substrings[0])) {
                same = false;
                break;
            }
        }

        // Print the output
        if (found && same) {
            System.out.println("Substrings found:");
            for (String substring : substrings) {
                System.out.println(substring);
            }
        } else {
            System.out.println("Not found");
        }
    }
}
