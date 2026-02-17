public class Staircase {

    public static void main(String[] args) {
        int n = 10; // Example number of coins

        buildStaircase(n);
    }

    public static void buildStaircase(int n) {
        int row = 1;
        int coinsUsed = 0;

        while (coinsUsed + row <= n) {
            // Print the current row
            for (int i = 0; i < row; i++) {
                System.out.print("* ");
            }
            System.out.println(); // New line

            coinsUsed += row;
            row++;
        }

        // Handle remaining coins (if any)
        if (coinsUsed < n) {
            for (int i = 0; i < n - coinsUsed; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
