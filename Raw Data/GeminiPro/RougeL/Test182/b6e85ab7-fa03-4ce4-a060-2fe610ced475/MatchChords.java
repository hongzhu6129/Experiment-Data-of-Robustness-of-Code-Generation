import java.util.Scanner;

public class MatchChords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the three chords from the user.
        System.out.print("Enter the first chord: ");
        String chord1 = scanner.nextLine();

        System.out.print("Enter the second chord: ");
        String chord2 = scanner.nextLine();

        System.out.print("Enter the third chord: ");
        String chord3 = scanner.nextLine();

        // Check if the chords contain any minor entrant characters.
        boolean containsMinor = false;
        for (char c : chord1.toCharArray()) {
            if (c == 'm') {
                containsMinor = true;
                break;
            }
        }
        for (char c : chord2.toCharArray()) {
            if (c == 'm') {
                containsMinor = true;
                break;
            }
        }
        for (char c : chord3.toCharArray()) {
            if (c == 'm') {
                containsMinor = true;
                break;
            }
        }

        // Print the result.
        if (containsMinor) {
            System.out.println("The chords contain a minor entrant character.");
        } else {
            System.out.println("The chords do not contain a minor entrant character.");
        }
    }
}
