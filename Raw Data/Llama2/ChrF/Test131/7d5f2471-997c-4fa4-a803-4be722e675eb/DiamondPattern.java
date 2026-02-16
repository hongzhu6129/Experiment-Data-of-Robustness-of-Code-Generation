public class DiamondPattern {

    public static void printDiamond(int n) {
        if (n <= 0 || n % 2 == 0) {
            System.out.println("Input n must be a positive odd integer.");
            return;
        }

        // Upper half of the diamond
        for (int i = 1; i <= n; i += 2) {
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test cases
        printDiamond(1);  // Corner case: smallest valid input
        printDiamond(3);
        printDiamond(5);
        printDiamond(7); 
        printDiamond(9);
        printDiamond(0);  // Corner case: Invalid input (0)
        printDiamond(-5); // Corner case: Invalid input (negative)
        printDiamond(4);  // Corner case: Invalid input (even)
    }
}
