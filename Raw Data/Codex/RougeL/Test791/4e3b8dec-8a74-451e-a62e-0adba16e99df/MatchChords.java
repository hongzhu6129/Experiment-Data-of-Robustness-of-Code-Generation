import java.util.Scanner;

public class MatchChords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first chord
        System.out.println("Enter the first chord:");
        String chord1 = scanner.nextLine();

        // Get the second chord
        System.out.println("Enter the second chord:");
        String chord2 = scanner.nextLine();

        // Check if the chords match
        boolean match = true;
        for (int i = 0; i < chord1.length(); i++) {
            if (chord1.charAt(i) != chord2.charAt(i)) {
                match = false;
                break;
            }
        }

        // Print the result
        if (match) {
            System.out.println("The chords match.");
        } else {
            System.out.println("The chords do not match.");
        }
    }
}
