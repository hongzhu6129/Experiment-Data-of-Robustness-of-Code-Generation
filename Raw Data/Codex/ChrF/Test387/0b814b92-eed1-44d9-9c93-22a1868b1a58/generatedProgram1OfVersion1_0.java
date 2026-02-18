public class Staircase {

    public static void main(String[] args) {
        int n = 10; // Example: Build staircase with 10 coins

        int rows = 0;
        int coinsUsed = 0;
        int currentRowCoins = 1;

        while (coinsUsed + currentRowCoins <= n) {
            for (int i = 0; i < currentRowCoins; i++) {
                System.out.print("$"); // Print a coin (you can use any symbol)
            }
            System.out.println(); // New line after each row

            coinsUsed += currentRowCoins;
            currentRowCoins++;
            rows++;
        }

        // Handle remaining coins (if any)
        if (coinsUsed < n) {
            for (int i = 0; i < n - coinsUsed; i++) {
                System.out.print("$");
            }
            System.out.println();
        }

        System.out.println("Number of rows: " + rows); // Optional: Print the number of complete rows
    }
}
