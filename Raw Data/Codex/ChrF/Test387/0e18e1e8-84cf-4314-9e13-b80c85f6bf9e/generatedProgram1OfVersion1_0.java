public class Staircase {

    public static void main(String[] args) {
        int n = 10; // Example number of coins

        int currentCoins = 0;
        int currentFace = 1;
        int height = 0;

        while (currentCoins < n) {
            int coinsNeeded = currentFace;
            if (currentCoins + coinsNeeded <= n) {
                currentCoins += coinsNeeded;
                height++;
                currentFace++;
            } else {
                break; // Not enough coins to complete the current face
            }
        }

        System.out.println("Height of staircase: " + height);

        // Print the staircase visually (optional)
        currentCoins = 0;
        currentFace = 1;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("O ");  // Use "O" to represent a coin
                currentCoins++;
            }
             System.out.println();
        }

    }
}
