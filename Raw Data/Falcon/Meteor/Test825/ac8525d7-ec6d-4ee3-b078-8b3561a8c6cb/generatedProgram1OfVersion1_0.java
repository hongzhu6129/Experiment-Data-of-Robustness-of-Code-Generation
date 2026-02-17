public class Staircase {

    public static void main(String[] args) {
        int n = 5; // Example: You can change this value

        if (n <= 0) {
            System.out.println("Invalid input. n must be a positive integer.");
            return;
        }


        int totalCoinsNeeded = 0;
        int rows = 0;

        for (int i = 1; ; i++) {
            totalCoinsNeeded += i;
            if (totalCoinsNeeded > n) {
                rows = i - 1;
                break;
            } else if (totalCoinsNeeded == n) {
                rows = i;
                break;
            }
        }


        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            // Print coins
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }

    }
}
